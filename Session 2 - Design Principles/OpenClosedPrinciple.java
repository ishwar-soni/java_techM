package com.upGrad;
class Student {
    public boolean isStudentValid(){
        System.out.println("add student : VALIDATING STUDENT" );
        //code logic
        return true;
    }
}
class Teacher {
    public boolean isTeacherValid(){
        System.out.println("add teacher : VALIDATING TEACHER" );
        //code logic
        return true;
    }
}
class SchoolManager{
    public void addNewStudentData(Student student){
        if(student.isStudentValid()){
            System.out.println("Student is valid and added");
        }
    }

    public void addNewTeacherData(Teacher teacher){
        if(teacher.isTeacherValid()){
            System.out.println("Teacher is valid and added");
        }
    }
}
