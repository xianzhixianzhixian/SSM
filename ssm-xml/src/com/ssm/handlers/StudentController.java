/**
 * 作者：樊钰丰
 * 时间：2017.9.27
 * 功能：处理器
 */

package com.ssm.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ssm.beans.Student;
import com.ssm.service.IStudentService;

public class StudentController implements Controller {

	private IStudentService service=null;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String name=request.getParameter("name");
		String ageStr=request.getParameter("age");
		Integer age=Integer.parseInt(ageStr);
		Student student=new Student(name,age);
		service.addStudent(student);
		return null;
	}

	public IStudentService getService() {
		return service;
	}

	public void setService(IStudentService service) {
		this.service = service;
	}

	
}
