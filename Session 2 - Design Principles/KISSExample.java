package com.upGrad;

public class KISSExample {
    public String months(int month)   {
        switch (month) {
            case 1:
                return "JAN";
            case 2:
                return "FEB";
            case 3:
                return "MAR";
            case 4:
                return "APR";
            case 5:
                return "MAY";
            case 6:
                return "JUN";
            default:
                return "month must be in range 1 to 6";
        }
    }
    public String monthsTillSecondQuarter2(int month)   {
        if ((month < 1) || (month > 6)) return "month must be in range 1 to 6";
        String[] months = {
                "JAN",
                "FEB",
                "MAR",
                "APR",
                "MAY",
                "JUN"
        };
        return months[month - 1];
    }
}

 class InvalidOperationException extends Exception{
     public InvalidOperationException() {
     }

     public InvalidOperationException(String message) {
         super(message);
     }

     public InvalidOperationException(String message, Throwable cause) {
         super(message, cause);
     }

     public InvalidOperationException(Throwable cause) {
         super(cause);
     }

     public InvalidOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
         super(message, cause, enableSuppression, writableStackTrace);
     }
 }
