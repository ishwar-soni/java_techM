package com.upGrad;
abstract class ValidateData{
    public abstract boolean isValidateData();
}
class Students_OCP extends ValidateData{
    public boolean isValidateData(){
        System.out.println("add student : VALIDATING STUDENT" );
        //code logic
        return true;
    }
}
class Teachers_OCP extends ValidateData{
    public boolean isValidateData(){
        System.out.println("add teacher : VALIDATING TEACHER" );
        //code logic
        return true;
    }
}
class SchoolManager_OCP {
    public void addNewData(ValidateData validateData) {
        if (validateData.isValidateData()) {
            System.out.println("Data are valid and added ");
        }
    }
}

public class OpenClosedPrinciple_fixed {

}

