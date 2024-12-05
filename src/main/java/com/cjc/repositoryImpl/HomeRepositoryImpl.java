package com.cjc.repositoryImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cjc.crud.model.Student;
import com.cjc.crud.repository.HomeRepository;
@Repository
public class HomeRepositoryImpl implements HomeRepository{

	List<Student> al=new ArrayList<Student>();
	public void saveData(Student stu) {
		// TODO Auto-generated method stub
		System.out.println("In repository:"+stu);
		al.add(stu);
		
		
	}
	public List<Student> loginCheck(String uname, String pass) {
		// TODO Auto-generated method stub
		 for(Student st:al)
		 {
			 if(uname.equalsIgnoreCase(st.getUname())&&pass.equals(st.getPass()))
			 {
				 return al;
			 }
		 }
		 return null;
	}

}
