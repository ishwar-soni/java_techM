
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

class AddressData implements ValidateData{
    public boolean isValidData(){
        System.out.println("VALIDATING ADDRESS" );
        //code logic
        return true;
    }
}

class User{
    public void addMobileNumber(ValidateData validateData){
        if(validateData.isValidData()){
            System.out.println("Data is valid and added ");
        }
    }

    public void addAddress(ValidateData validateData){
        if(validateData.isValidData()){
            System.out.println("Data is valid and added ");
        }
    }
}

