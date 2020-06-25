package com.upGrad;

abstract class ValidateData{
    public abstract boolean isValid();
}

class Student extends ValidateData{
    public boolean isValid(){
        System.out.println("add student : VALIDATING STUDENT" );
        //code logic
        return true;
    }
}

class Teacher extends ValidateData{
    public boolean isValid(){
        System.out.println("add teacher : VALIDATING TEACHER" );
        //code logic
        return true;
    }
}

class SchoolManager {
    public void addNewData(ValidateData validateData) {
        if (validateData.isValid()) {
            System.out.println("Data is valid and added ");
        }
    }
}
