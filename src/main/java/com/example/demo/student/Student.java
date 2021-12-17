package com.example.demo.student;

import java.time.LocalDate;

public class Student 
{
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student(Long id, String name, String email, LocalDate dob, Integer age)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dob, Integer age)
    {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    // Getters

    public String getName()
    {
        return name;
    }

    public Integer getAge()
    {
        return age;
    }

    public String getEmail()
    {
        return email;
    }

    public Long getId()
    {
        return id;
    }

    public LocalDate getDob()
    {
        return dob;
    }


    // Setters

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setDob(LocalDate dob)
    {
        this.dob = dob;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String toString()
    {
        return "Student{"+"id="+id+",name="+name+"age="+age+",dob="+dob+"email="+email+"}";
    }
    
}