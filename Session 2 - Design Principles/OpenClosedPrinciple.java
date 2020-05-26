package com.upGrad;
class Students{
    public boolean isStudentValid(){
        System.out.println("add student : VALIDATING STUDENT" );
        //code logic
        return true;
    }
}
class Teachers{
    public boolean isTeacherValid(){
        System.out.println("add teacher : VALIDATING TEACHER" );
        //code logic
        return true;
    }
}
class SchoolManager{
    public void addNewStudentData(Students students){
        if(students.isStudentValid()){
            System.out.println("Students are valid and added ");
        }
    }

    public void addNewTeacherData(Teachers teachers){
        if(teachers.isTeacherValid()){
            System.out.println("Teacher are valid and added ");
        }
    }
}
public class OpenClosedPrinciple {
}
