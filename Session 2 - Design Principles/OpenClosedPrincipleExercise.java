package com.upGrad;

abstract class ValidData{
    pubic abstract boolean isValidataData();
}

class Mobile extends ValidData{
    public boolean isMobileNumberValid(){
        System.out.println("VALIDATING NUMBER" );
        //code logic
        return true;
    }
}

class AddressData extends ValidData{
    public boolean isAddressValid(){
        System.out.println("VALIDATING ADDRESS" );
        //code logic
        return true;
    }
}

class User{
    public void addNewData(ValidateData validateData){
        if(validataData.isValidData()){
            System.out.println("Data are valid and added ");
        }
    }
}

