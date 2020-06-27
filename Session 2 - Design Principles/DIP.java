class Person {
    // person attributes and method
}

class Android {
    public void sendSms (String msg, int phoneNumber) {
        //code logic to send sms with "msg" as data to number -> "phoneNumber"
    }

    public void call (int phoneNumber) {
        //code logic to call number -> "phoneNumber"
    }

}

class PhoneService {
    private Android android;
    
    public PhoneService () {
        android = new Android();
    }
    
    public void useSmsFeature(String msg, int phoneNumber) {
        android.sendSms(msg, phoneNumber);
    }
    
    public void useCallFeature (int phoneNumber) {
        android.call(phoneNumber);
    }
}
