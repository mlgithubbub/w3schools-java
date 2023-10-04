package Java02Classes.Java15Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Display current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //Display current time
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //Display current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Create DateTime formatters
        DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate1 = currentDate.format(dateFormat1);
        System.out.println(formattedDate1);

        DateTimeFormatter dateFormat2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate2 = currentDate.format(dateFormat2);
        System.out.println(formattedDate2);

        DateTimeFormatter dateFormat3 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate3 = currentDate.format(dateFormat3);
        System.out.println(formattedDate3);

        DateTimeFormatter dateFormat4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formattedDate4 = currentDate.format(dateFormat4);
        System.out.println(formattedDate4);

        DateTimeFormatter dateTimeFormat1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:ns");
        String formattedDateTime1 = currentDateTime.format(dateTimeFormat1);
        System.out.println(formattedDateTime1);

        DateTimeFormatter timeFormat1 = DateTimeFormatter.ofPattern("HH:mm:ss:ns");
        String formattedTime1 = currentTime.format(timeFormat1);
        System.out.println(formattedTime1);



    }


}
