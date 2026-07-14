package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService{

    @Autowired
    studentrepository repo;

    List<model> arr=new ArrayList<>();


    public String createStudent( model m){
        repo.save(m);
        return "user added successfully";
    }
    //fetch all users

    public List<model> getAllStudents(){
        return repo.findAll();
    }
    //fetch by id

    public model getUserById (int id){

        return repo.findById(id).orElse( null);
    }

    //delete by id

    public String deleteById (  int id) {
        repo.deleteById(id);
        return "user deleted successfully";
    }
}

