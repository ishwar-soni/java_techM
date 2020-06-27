
class Address{
    //all address  details and validation
}
class PhoneNumber{
    //all phonenumber details and validation
}
class Student_{
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
        return (int) (fees * 0.1 * numberOfDaysLate);
    }

    public int checkStudentMarks(int studentId){
        int maths = findMathsMarks(studentId);
        int science = findScienceMarks(studentId);
        return maths + science;
    }

    public char checkStudentGrade(int studentId){
        int total = checkStudentMarks(studentId);
        if(total > 80){
            return 'A';
        }else{
            return 'B';
        }
    }
    public int findMathsMarks(int studentId){
        //code
        return 0;
    }

      public int findScienceMarks(int studentId){
        //code
        return 0;
    }

    public void print(){
        //write print logic code here
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
