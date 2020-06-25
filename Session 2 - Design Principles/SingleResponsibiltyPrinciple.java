package com.upGrad;
//without single responsibility principle
public class School{
    public void addStudent(Student student){
        //code
    }
    public int findStudentID(String studentName){
        //code
        return 0;
    }
    public void studentAdmissionStatus(int studentId){
        //codeLogic
    }
    public void teacherSalaryStatus(int teacherId){
        //codeLogic
    }
    public boolean checkTeacherAttendance(int teacherId){
        //codeLogic
    }
}


//With Single Responsibility Principle
public class Student {
    public void addStudent(Student student){
        //code
    }
    public int findStudentID(String studentName){
        //code
        return 0;
    }
}

public class School{
    public void studentAdmissionStatus(int studentId){
        //codeLogic
    }
    public void teacherSalaryStatus(int teacherId){
        //codeLogic
    }
    public boolean checkTeacherAttendance(int teacherId){
        //codeLogic
    }
}
