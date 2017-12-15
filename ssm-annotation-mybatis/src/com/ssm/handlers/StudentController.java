/**
 * 作者：樊钰丰
 * 时间：2017.9.27
 * 功能：处理器
 */

package com.ssm.handlers;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.beans.Student;
import com.ssm.service.IStudentService;

@Controller
@RequestMapping("/test")
public class StudentController {

	@Autowired
	@Qualifier("studentService")
	//@Resource(name="studentService")
	private IStudentService service;

	@RequestMapping("/register.do")
	public String doRegister(String name,int age) {
		
		Student student=new Student(name,age);
		service.addStudent(student);
		return "/welcome.jsp";
	}

	public IStudentService getService() {
		return service;
	}

	public void setService(IStudentService service) {
		this.service = service;
	}	
}
