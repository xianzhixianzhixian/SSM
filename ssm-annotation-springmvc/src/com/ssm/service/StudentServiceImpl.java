package com.ssm.service;

import com.ssm.beans.Student;
import com.ssm.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao studentdao;

	@Override
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
