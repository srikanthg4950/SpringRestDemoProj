package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController 
{
   // @Autowired
   // private EmployeeDAO employeeDao;
     
    @GetMapping(path="/test", produces = MediaType.TEXT_PLAIN_VALUE )
    public String getEmployees() 
    {
    	System.out.println("--getEmployees() called 3 --");
        //return employeeDao.getAllEmployees();
    	
    	return "employee demo three";
    }
    
    @GetMapping(path="/students", produces = MediaType.TEXT_PLAIN_VALUE )
    public String getStudents() 
    {
        //return employeeDao.getAllEmployees();
    	
    	return "students demo";
    }
}