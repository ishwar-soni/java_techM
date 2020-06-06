package com.upGrad;
//Inner class example demonstrated

class Student{
    //student has a inner class called Address
    class Address{
        String address = "Road, Locality , City";
        public void displayAddress(){
            System.out.println("Printing address inside the nested class");
        }
    }
}
public class InnerClassExample{
    public static void main(string[] args){
        Student.Address studentAddress = new Student().new Address();
        studentAddress.displayAddress();
    }
}

//program to demonstrate Static Inner Class
class StudentOuter {
    public static void displayAddress(){
            System.out.println("Printing address from the Address class");
        }
    // A static inner class
    static class Address {
        String address = "Road, Locality , City";
        public static void main(String[] args) {
            System.out.println("Address will be printed here");
            displayAddress();
        }
    }
}

//methodLocalInnerClass exampe
class Student {
    void createAddress() {
        System.out.println("We are creating address object for student");
        // Address class is local to createAddress()
        class Address {
            void displayAddress() {
                System.out.println("Address is created for student");
            }
        }
        Address address = new Address();
        address.createAddress();
    }
}
class MethodLocalInnerClassExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.createAddress();
    }
}

    //program to demonstrate Anonymous inner class
    interface StudentsGrade{
        String grade = "A";
        void getStudentsGrade();
    }
    class AnonymousClassDemo{
        public static void main(String[] args) {
            //We have a  hidden inner class of StudentsGrade interface
            // whose name is not written but an object to it
            // is created.
            StudentsGrade obj = new StudentsGrade() {
                public void getStudentsGrade() {
                    // printing grade
                    System.out.print("Grade is "+ grade);
                }
            };
            obj.getStudentsGrade();
        }
    }
    class AnonymousClassDemo2{
    static StudentsGrade obj = new StudentsGrade() {
        public void getStudentsGrade() {
            // printing grade
            System.out.print("Grade is "+ grade);
        }
    };

    public static void main(String[] args) {
        //We have a  hidden inner class of StudentsGrade interface
        // whose name is not written but an object to it
        // is created.
        obj.getStudentsGrade();
    }
}


