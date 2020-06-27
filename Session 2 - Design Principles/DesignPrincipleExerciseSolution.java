
class Address{
    //all address  details and validation
}
class PhoneNumber{
    //all phonenumber details and validation
}
class Student_{
    private int studentId;
    private String studentName;
    private String dateOfJoining;
    private Address address;
    private PhoneNumber parentNumber;
    private PhoneNumber studentNumber;
    private int numberOfDaysLate;
    private int numberOfDaysAbsent;
    private int studentCurrentGrade;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(PhoneNumber parentNumber) {
        this.parentNumber = parentNumber;
    }

    public PhoneNumber getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(PhoneNumber studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getNumberOfDaysLate() {
        return numberOfDaysLate;
    }

    public void setNumberOfDaysLate(int numberOfDaysLate) {
        this.numberOfDaysLate = numberOfDaysLate;
    }

    public int getNumberOfDaysAbsent() {
        return numberOfDaysAbsent;
    }

    public void setNumberOfDaysAbsent(int numberOfDaysAbsent) {
        this.numberOfDaysAbsent = numberOfDaysAbsent;
    }

    public int getStudentCurrentGrade() {
        return studentCurrentGrade;
    }

    public void setStudentCurrentGrade(int studentCurrentGrade) {
        this.studentCurrentGrade = studentCurrentGrade;
    }

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

}

class StudentService{
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
