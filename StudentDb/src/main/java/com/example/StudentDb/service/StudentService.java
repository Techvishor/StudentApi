package com.example.StudentDb.service;

import com.example.StudentDb.model.Students;
import com.example.StudentDb.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo stdRep;

    public List<Students> studentList(){
        return stdRep.findAll();
    }

    public String addStudent(Students std) {
        try {
            stdRep.save(std);
            return "add";
        }catch (Exception e){
            return " not added";
        }
    }

    public String updateStudent(Students std) {
        try {
            stdRep.save(std);
            return "updated";
        }catch (Exception e){
            return " not updated";
        }
    }


    public String deleteStudent(int id) {
        try {
           stdRep.deleteById(id);
            return "deleted";
        }catch (Exception e){
            return " not deleted";
        }
    }
}
