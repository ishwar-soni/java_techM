package com.upGrad;
class Mobile{
    public boolean isMobileNumberValid(){
        System.out.println("VALIDATING NUMBER" );
        //code logic
        return true;
    }
}

class Address{
    public boolean isAddressValid(){
        System.out.println("VALIDATING ADDRESS" );
        //code logic
        return true;
    }
}

class User{
    public void addMobileNumber(Mobile mobile){
        if(mobile.isMobileNumberValid()){
            System.out.println("Mobile number is valid and added ");
        }
    }

    public void addAddress(Address addressData){
        if(addressData.isAddressValid()){
            System.out.println("Address is valid and added ");
        }
    }
}
