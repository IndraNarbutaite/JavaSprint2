package com.indra.employee.sprint2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class EmployeeInfo{
    private String eName;
    private String eLastName;
    private int salary;

    public void setName(String name){
        this.eName = name;
    }

    public String getName(){
        return this.eName;
    }

    public void setLastName(String lastName){
        this.eLastName = lastName;
    }
    public String getLastName(){
        return this.eLastName;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return this.salary;
    }
}

