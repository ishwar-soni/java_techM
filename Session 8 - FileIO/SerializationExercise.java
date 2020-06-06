package com.upGrad;

import java.io.*;

class Employee implements Serializable{
    int employeeId;
    String employeeName;
    int employeeSalary;

    public Employee( int employeeId , String employeeName, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

}
public class SerializationExercise {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //creating a file with FileOutputStream
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("EmployeeData.txt"));
       ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("EmployeeData.txt"));

       Employee employeeObject  = new Employee(20 , "Ramesh Kumar" , 12330);

       objectOutputStream.writeObject(employeeObject);
       objectOutputStream.flush();
        System.out.println("Serialization of employeeObject  is done");
       Employee employeeReadObject = (Employee) objectInputStream.readObject();
        System.out.println("Employee name :" + employeeReadObject.employeeName);
        System.out.println("Employee salary :" + employeeReadObject.employeeSalary);

    }
}
