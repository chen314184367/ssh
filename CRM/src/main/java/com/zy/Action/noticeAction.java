package com.zy.Action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zy.Model.Notice;
import com.zy.Model.Role;
import com.zy.Model.User;
import com.zy.Service.NoticeService;

import lombok.Getter;
import lombok.Setter;

@Controller
public class noticeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	@Autowired
	NoticeService ns;
	@Setter
	@Getter
	Notice n;
	@Setter
	@Getter
	private String expireTime;
	@Setter
	@Getter
	private String pubTime;
	@Setter
	@Getter
	private String noticetype;
	@Setter
	@Getter
	private String noticecountext;

	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public String noticeSearch() {
		System.out.println("usertype:"+noticetype+"     ,      usercontext:"+noticecountext);
		  List<Notice> list = ns.search(noticetype,noticecountext);
		  System.out.println(list);
		System.out.println("userActionSearch");
		ActionContext.getContext().put("list", list);
		
		return SUCCESS;
	}

	public String noticeView() {
		List<Notice> list = ns.list();
		System.out.println(list);
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}

	public String noticeAdd() throws ParseException {
		System.out.println(pubTime);
		User ob = (User) ActionContext.getContext().getSession().get("user");

		n.setExpireTime(sdf.parse(expireTime));
		n.setPubTime(sdf.parse(pubTime));
		n.setCreater(ob.getUserId());
		System.out.println("进入添加 noticeAdd 方法");
		n.setCreateTime(date);
		ns.save(n);
		return SUCCESS;

	}

	public String noticeUpdateReady() throws Exception {

		System.out.println("noticeUpdateReady");
		System.out.println("r.getRoleId()" + n.getNoticeId());
		n = ns.get(n.getNoticeId());

		
//		Date pub = sdf.parse(n.getPubTime().toString());
//		Date exp = sdf.parse(n.getExpireTime().toString());
//		n.setPubTime(pub);
//		n.setExpireTime(exp);

		ActionContext.getContext().put("n", n);
		return SUCCESS;

	}

	public String noticeUpdate() throws ParseException {
		User ob = (User) ActionContext.getContext().getSession().get("user");
		System.out.println("n" + n);
		// expireTime = expireTime.replace("T", " ") + ":00";
		// pubTime = pubTime.replace("T", " ") + ":00";
		n.setExpireTime(sdf.parse(expireTime));
		n.setPubTime(sdf.parse(pubTime));
		n.setUpdater(ob.getUserId());
		n.setUpdateTime(date);
		ns.update(n);
		return SUCCESS;
	}

	public String noticeDelete() {
		System.out.println("delete");
		ns.delete(n);
		return SUCCESS;
	}

}
