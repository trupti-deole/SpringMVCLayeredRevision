package com.cjc.crud.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.model.Student;
import com.cjc.crud.serviceI.HomeService;
import com.cjc.repositoryImpl.HomeRepositoryImpl;
@Service
public class HomeServiceImpl implements HomeService{
    @Autowired
    private HomeRepositoryImpl repository;
	public void saveData(Student stu) {
		// TODO Auto-generated method stub
		repository.saveData(stu);
		
	}
	public List<Student> loginCheck(String uname, String pass) {
		// TODO Auto-generated method stub
		List<Student> stuList=repository.loginCheck(uname,pass);
		return stuList;
	}

}
