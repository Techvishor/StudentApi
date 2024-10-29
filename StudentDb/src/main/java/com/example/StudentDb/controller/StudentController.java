package com.example.StudentDb.controller;

import com.example.StudentDb.model.Students;
import com.example.StudentDb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService stdSer;

    @GetMapping("/lists")
    public ResponseEntity<List<Students>> stdLists(){
        return new ResponseEntity<>(stdSer.studentList(), HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<String> addStd(@RequestBody Students std){
        return new ResponseEntity<>(stdSer.addStudent(std),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateStd(@RequestBody Students std){
        return new ResponseEntity<>(stdSer.updateStudent(std),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStd(@PathVariable int id){
        return new ResponseEntity<>(stdSer.deleteStudent(id),HttpStatus.OK);
    }

}
