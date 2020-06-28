class EMICalculator{
      public static int calculateNumberOfEMIs(int amount, int emiAmount){
        int months = 0 ;
        try{
            months = amount/emiAmount; // if emiAmount = 0, then exception is thrown
            //statements below will not get executed when the above statement will cause an exception
            System.out.println("Number of months : " + months);
            return months;
        }catch (ArithmeticException ae){
            System.out.println("Emi amountis 0 , so nothing calculated");
        }finally {
            System.out.println("EMI calculation is done");
        }
        //rest of the program is executed
        System.out.println("Thanks for using our service");
        return months;
    }
}