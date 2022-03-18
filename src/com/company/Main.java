package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //Calendar now = new GregorianCalendar();
        Calendar now = Calendar.getInstance();
        //calender in the get method is a static string
        now.setTimeInMillis(0);

        System.out.println(now.getTimeInMillis());

        System.out.println(now.get(Calendar.MONTH) +1 );
        System.out.println(now.get(Calendar.DAY_OF_MONTH));
        System.out.println(now.get(Calendar.YEAR));

    }
}
