package com.upGrad;
interface ValidateData{
    public boolean isValidData();
}

class Mobile implements ValidateData{
    public boolean isValidData(){
        System.out.println("VALIDATING NUMBER" );
        //code logic
        return true;
    }
}

class Address implements ValidateData{
    public boolean isValidData(){
        System.out.println("VALIDATING ADDRESS" );
        //code logic
        return true;
    }
}

class User{
    public void addMobileNumber(ValidateData mobile){
        if(mobile.isValidData()){
            System.out.println("Mobile number is valid and added ");
        }
    }

    public void addAddress(ValidateData address){
        if(address.isValidData()){
            System.out.println("Address is valid and added ");
        }
    }
}
