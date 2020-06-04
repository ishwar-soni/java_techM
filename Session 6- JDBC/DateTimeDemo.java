package com.upGrad;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeDemo {
    public static void dateTimeDemo(){
        LocalDate date = LocalDate.now();
        System.out.println("The current date is : " + date);
        //the current time
        LocalTime time = LocalTime.now();
        System.out.println("The current time is : " + time);
        //will give us current time and date
        LocalDateTime current =LocalDateTime.now();
        System.out.println("current date and time : " + current);
    }
    public static void calculateDaysFromCurrentDate(String date){
        //default time zone
        ZoneId defaultZoneId = ZoneId.systemDefault();
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = date;
        try {
            Date futureDate = myFormat.parse(dateString);
            LocalDate currentLocalDate = LocalDate.now();
            Date currentDate =  Date.from(currentLocalDate.atStartOfDay(defaultZoneId).toInstant());
            long difference = futureDate.getTime() - currentDate.getTime();
            float daysBetween = (difference / (1000*60*60*24));
            /* You can also convert the milliseconds to days using this method
             * float daysBetween =
             *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
             */
            System.out.println("Number of Days between dates: "+daysBetween);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void calculateNumberOfDays(String date1, String date2){
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateBeforeString = date1;
        String dateAfterString = date2;

            try {
                Date dateBefore = myFormat.parse(dateBeforeString);
                Date dateAfter = myFormat.parse(dateAfterString);
                long difference = dateAfter.getTime() - dateBefore.getTime();
                float daysBetween = (difference / (1000*60*60*24));
                /* You can also convert the milliseconds to days using this method
                 * float daysBetween =
                 *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
                 */
                System.out.println("Number of Days between dates: "+daysBetween);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static void main(String[] args){
        dateTimeDemo();
    }
}

