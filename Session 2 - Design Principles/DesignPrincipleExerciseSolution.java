class Address{
    //all address  details and validation
}
class PhoneNumber{
    //all phonenumber details and validation
}
class Student{
    int studentId;
    String studentName;
    String dateOfJoining;
    Address address;
    PhoneNumber parentNumber;
    PhoneNumber studentNumber;
    int numberOfDaysLate;
    int numberOfDaysAbsent;
    int studentCurrentGrade;

    public int findStudentFees(int grade){
        if(grade>=9)
            return 2000;
        else
            return 2800;
    }
    //rate of calculation of late coming fine is 10% - updated on version X
    public int findLateComingFine (int numberOfDaysLate, int grade){
        int fees = findStudentFees(grade);
        return fees * 0.1 * numberOfDaysLate;
    }
    public boolean checkStudentMarks(int studentId){
        //code
        return true;
    }
}
class Teacher{
    public boolean checkTeacherAttendance(String teacherName, int teacherId) {
        //some code logic
        return true;
    }
}
class School{
    public int findElectricityBill(int schoolElectricMeterId){
        //code
        return 0;
    }
}
