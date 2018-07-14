package exercises;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateTest
{
    public static void main(String[] args) {
        Date date = new Date();
        Date date2 = new Date();
        Calendar rightNow = Calendar.getInstance();
        GregorianCalendar birthday = new GregorianCalendar(2018,Calendar.JUNE,26);

        System.out.println("Time is: " + date.getTime());
        System.out.println("Date: " + date.toString());
        System.out.println("\nTime is: " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());

        System.out.println("Day: " + rightNow.get(Calendar.DAY_OF_WEEK)+"  "+rightNow.get(Calendar.MONTH)+"/"+rightNow.get(Calendar.DAY_OF_MONTH));
        int day = rightNow.get(Calendar.DAY_OF_MONTH);
        int month = rightNow.get(Calendar.MONTH);

        //rightNow.add(Calendar.DAY_OF_MONTH,(1-day));
        //rightNow.add(Calendar.MONTH,(Calendar.MAY-month));

        System.out.println("\nNew Day: " + rightNow.get(Calendar.DAY_OF_WEEK)+"  "+rightNow.get(Calendar.MONTH)+"/"+rightNow.get(Calendar.DAY_OF_MONTH));
        int dow = rightNow.get(Calendar.DAY_OF_WEEK);
        int dtm = (Calendar.SATURDAY+2) - Calendar.DAY_OF_WEEK;
        rightNow.add(Calendar.DAY_OF_WEEK,dtm);
        System.out.println("Day: " + rightNow.get(Calendar.DAY_OF_WEEK)+"  "+rightNow.get(Calendar.MONTH)+"/"+rightNow.get(Calendar.DAY_OF_MONTH));
        rightNow.add(Calendar.DAY_OF_WEEK,-dtm);
        dtm = Calendar.MONDAY - Calendar.DAY_OF_WEEK;
        rightNow.add(Calendar.DAY_OF_WEEK,dtm);
        System.out.println("Day: " + rightNow.get(Calendar.DAY_OF_WEEK)+"  "+rightNow.get(Calendar.MONTH)+"/"+rightNow.get(Calendar.DAY_OF_MONTH));

        System.out.println("\n\nBirthDay: " + birthday.get(Calendar.DAY_OF_WEEK)+"  "+birthday.get(Calendar.MONTH)+"/"+birthday.get(Calendar.DAY_OF_MONTH));
        day = birthday.get(Calendar.DAY_OF_MONTH);
        month = birthday.get(Calendar.MONTH);
        birthday.add(Calendar.DAY_OF_MONTH,(1-day));
        birthday.add(Calendar.MONTH,(Calendar.MAY-month));
        System.out.println("BirthDay: " + birthday.get(Calendar.DAY_OF_WEEK)+"  "+birthday.get(Calendar.MONTH)+"/"+birthday.get(Calendar.DAY_OF_MONTH));

    }
}
