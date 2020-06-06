package com.upGrad;

import java.io.*;

class StudentSerialized implements Serializable{
    String studentName;
    int rollNo;

    public StudentSerialized(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "StudentSerialized{" +
                "studentName='" + studentName + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
public class ObjectInputOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //creating a file with FileOutputStream
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("StreamFile.txt"));
       ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("StreamFile"));

       StudentSerialized studentObject = new StudentSerialized("Ram" , 20);

       objectOutputStream.writeObject(studentObject);
       objectOutputStream.flush();
        System.out.println("Serialization of student object is done");
       StudentSerialized studentReadObject = (StudentSerialized) objectInputStream.readObject();
       System.out.println(studentReadObject.toString());
    }
}
