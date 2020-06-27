
interface PhoneFeatures {
    public void sendSms (String msg, int phoneNumber);
    public void call (int phoneNumber);
}


class Android implements PhoneFeatures{
    public void sendSms (String msg, int phoneNumber) {
        //code logic to send sms with "msg" as data to number -> "phoneNumber"
        //logic is based for android phones
    }

    public void call (int phoneNumber) {
        //code logic to call number -> "phoneNumber"
        //logic is based for android  phones
    }
}

class IOS implements PhoneFeatures{
    public void sendSms (String msg, int phoneNumber) {
        //code logic to send sms with "msg" as data to number -> "phoneNumber"
        //logic is based for ios phones
    }

    public void call (int phoneNumber) {
        //code logic to call number -> "phoneNumber"
        //logic is based for ios  phones
    }
}

class PhoneService {
    private PhoneFeatures phone;
    
    public PhoneService (PhoneFeatures phoneFeatures) {
        phone = new Android();
    }
    
    public void useSmsFeature(String msg, int phoneNumber) {
        phone.sendSms(msg, phoneNumber);
    }
    
    public void useCallFeature (int phoneNumber) {
        phone.call(phoneNumber);
    }
}
