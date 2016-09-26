package com.testSSH.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.User;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.testSSH.domain.Users;
import com.testSSH.service.CountryService;
import com.testSSH.service.UserService;

public class UserAction extends ActionSupport implements ServletRequestAware  {
	private String message;
	private String name;
	private String pwd;
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private HttpServletRequest request;
	
	@Resource
	private CountryService countryService;
	
	@Resource
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setCountryService(CountryService countryService) {
		this.countryService = countryService;
	}

	public String redirect1(){
		message = "redirect1 from UserAction";
		return SUCCESS;
	}
	
	public String add(){
		message = "add a message";
		return SUCCESS;
	}

	public String update(){
		message = "update a message";
		return SUCCESS;
	}
	
	public String delete(){
		message = "delete a message";
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	public String execute() throws Exception{
		setMessage("execute a message");
		return SUCCESS;
	}
	
	public String register() throws Exception{
		setMessage("send user info");
		//System.out.println(name);
		Users user = new Users();
		user.setName(name);
		user.setPwd(pwd);
		user.setEmail(email);
		userService.Save(user);
		
		request.setAttribute("name", name);
		request.setAttribute("address", "abc@163.com");
		return SUCCESS;
	}
	
	public String showCountry() throws Exception{
		//如果action没有交给spring管理(不是配置)，获取Spring容器如下：
		//WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
		//CountryService cs= (CountryService)ctx.getBean("countryService");
		
		List list = countryService.showCountry();//可以是不同表的List，所以不写countrylist
		request.setAttribute("List", list);
		request.setAttribute("Country", "中国");
		//request.setCharacterEncoding("GB2312");
		return SUCCESS;
	}
	
}
