package com.upGrad;

public class CheckedUncheckedExercise {
    //handle the possible exception here
        private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

        public static void main(String[]  args) throws Exception{
            System.out.println("Trying to load MySQL JDBC driver");
            Class.forName(DRIVER_CLASS);
        }
        //create a possible situation of unchecked exception
}
