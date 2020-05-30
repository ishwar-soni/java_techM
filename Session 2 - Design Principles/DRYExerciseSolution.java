package com.upGrad;

public class DRYExerciseSolution {
    public static int getStudentTotalMarks(String studentName){
        int studentId = findStudentId(studentName);
        int maths = findStudentMathsMarks(studentId);
        int science = findStudentScienceMarks(studentId);
        int total = maths + science;
        return total;
    }

    public static String calculateGrade(String studentName){
        int total = getStudentTotalMarks(studentName);
        String grade  = "";
        if(total >= 50){
            grade = "PASS";
        }else{
            grade = "FAIL";
        }
        return grade;
    }

    public static int findStudentId(String studentName){
        return 0;
    }
    public static int findStudentMathsMarks(int id){
        return 0;
    }
    public static int findStudentScienceMarks(int id){
        return 0;
    }

}

