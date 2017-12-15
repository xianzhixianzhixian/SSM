package com.ssm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.beans.Student;
import com.ssm.dao.IStudentDao;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Resource(name="IStudentDao")
	private IStudentDao studentdao;

	@Transactional
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentdao.insertStudent(student);
	}
	public IStudentDao getStudentdao() {
		return studentdao;
	}

	public void setStudentdao(IStudentDao studentdao) {
		this.studentdao = studentdao;
	}
}
