package com.indra.employee.sprint2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter employee last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter employee salary: ");
        int salary = sc.nextInt();

        EmployeeInfo personInfo = new EmployeeInfo();
        personInfo.setName(name);
        personInfo.setLastName(lastName);
        personInfo.setSalary(salary);

        File employeesFile = new File("C:\\Users\\HP\\Desktop\\Project\\Sprint_2\\src\\com\\indra\\employee\\sprint2/writtingToFiles.csv");
        try {

            FileWriter write = new FileWriter(employeesFile, true);
            BufferedWriter ewr = new BufferedWriter(write);

            ewr.write("Person name: " + personInfo.getName()+ "\n");
            ewr.write("Person surname: " + personInfo.getLastName()+ "\n");
            ewr.write("Person salary: " + personInfo.getSalary()+ " eur" + "\n");
            ewr.close();

            FileReader reader = new FileReader(employeesFile);
            BufferedReader erd = new BufferedReader(reader);
            String fileLines = erd.readLine();
            while (fileLines != null){

                String[] splitString = fileLines.split(" ");
                fileLines = erd.readLine();
                System.out.println(Arrays.toString(splitString));

            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}

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

