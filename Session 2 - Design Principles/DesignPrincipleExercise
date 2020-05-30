class Student{
    int studentId;
    String name; // this is student name
    String date; // this date of joining of student in school
    String cityName;
    String districtName;
    String localityName;
    String pinCode;
    String phoneNumber; // this is student's parent number
    String phoneNumber2; // this is student's  number
    int numberOfDaysLate;
    int numberOfDaysAbsent;
    int grade; // this is student grade in which he/she is currently studying

    public int findStudentFees(int grade){
        if(grade>=9)
            return 2000;
        else
            return 2800;
    }
    //We are calculating the late fees by finding the fees of student
    //then multiply with number of days student came late to school
    // and final amount's 10% is taken as fine
    public int findLateComingDues (int numberOfDaysLate, int grade){
        int fees = 0;
        if(grade>=9)
            fees =  2000;
        else
            fees =  2800;
        int lateComingDues = fees * 0.1 * numberOfDaysLate;
        return lateComingDues;
    }
    public boolean checkStudentMarks(int studentId){
        //code
        return true;
    }
    public boolean checkTeacherAttendance(String teacherName, int teacherId) {
        //some code logic
        return true;
    }
    public int findElectricityBill(int schoolElectricMeterId){
        //code
        return 0;
    }

}
