package com.upGrad;
//Inner class example demonstrated

class Outer {
    // Simple nested inner class
    class Inner {
        public void show() {
            System.out.println("In a nested class method");
        }
    }
}
class InnerClassExample {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}

//program to demonstrate Static Inner Class
class OuterClassStatic {
    private static void outerMethod() {
        System.out.println("static outerMethod");
    }
    // A static inner class
    static class Inner {
        public static void main(String[] args) {
            System.out.println("static inside inner class Method");
            outerMethod();
        }
    }
}

//methodLocalInnerClass exampl

class OuterClass {
    void outerMethod() {
        System.out.println("outerMethod");
        // Inner class is local to outerMethod()
        class Inner {
            void innerMethod() {
                System.out.println("innerMethod");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
class MethodLocalInnerClassExample {
    public static void main(String[] args) {
        OuterClass x = new OuterClass();
        x.outerMethod();
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
            @Override
            public void getStudentsGrade() {
                // printing grade
                System.out.print("Grade is "+ grade);
            }
        };
        obj.getStudentsGrade();
    }
}


