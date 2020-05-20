package com.upGrad;

public class CreateCustomException {
    public void finallyBlockExecution() {
        String name = "upGrad";
        try {
            System.out.println("Name:" + name);
            System.out.println("Exit from try block");
            throw new MyCustomException("returns my custom message ");
        } catch (MyCustomException ex) {
            System.out.println("Catch block executed...");
        } finally {
            System.out.println("finally block executed");
        }


    }
}

    //creating CustomException
    class MyCustomException extends Exception {
        public MyCustomException() {
        }

        public MyCustomException(String message) {
            super(message);
        }

        public MyCustomException(String message, Throwable cause) {
            super(message, cause);
        }

        public MyCustomException(Throwable cause) {
            super(cause);
        }

        public MyCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
