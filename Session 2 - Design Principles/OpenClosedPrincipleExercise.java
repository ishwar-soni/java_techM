package com.upGrad;
class Mobile{
    public boolean isMobileNumberValid(){
        System.out.println("VALIDATING NUMBER" );
        //code logic
        return true;
    }
}

class AddressData{
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

    public void addAddress(AddressData addressData){
        if(addressData.isAddressValid()){
            System.out.println("Address data are valid and added ");
        }
    }
}

