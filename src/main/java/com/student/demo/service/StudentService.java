package com.student.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.demo.domain.Student;
import com.student.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
    private StudentRepository repo;
	
	public List<Student> listAll() {
        return repo.findAll();
    }
     
    public void save(Student std) {
        repo.save(std);
    }
     
    public Student get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}