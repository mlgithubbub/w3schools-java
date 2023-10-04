package Java02Classes.Java15Date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Timer {

    public static void main(String[] args) {
        //Timer
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter timeFormat1 = DateTimeFormatter.ofPattern("HH:mm:ss:ns");
        String formattedTime1 = currentTime.format(timeFormat1);
        System.out.println(formattedTime1);

        System.out.println("Press Enter to start timer");
        Scanner inputScanner = new Scanner(System.in);
        inputScanner.nextLine();
        LocalTime startTime = LocalTime.now();
        String formattedStartTime = startTime.format(timeFormat1);
        System.out.println("Time started: " + formattedStartTime);
        System.out.println("Press Enter to stop timer");
        inputScanner.nextLine();
        LocalTime endTime = LocalTime.now();
        String formattedEndTime = endTime.format(timeFormat1);
        System.out.println("Time started: " + formattedEndTime);

        int startTimeHrs = startTime.getHour();
        System.out.println(startTimeHrs);
        int startTimeMins = startTime.getMinute();
        System.out.println(startTimeMins);
        int startTimeSecs = startTime.getSecond();
        System.out.println(startTimeSecs);
        int startTimeNano = startTime.getNano();
        System.out.println(startTimeNano);

        int endTimeHrs = endTime.getHour();
        System.out.println(endTimeHrs);
        int endTimeMins = endTime.getMinute();
        System.out.println(endTimeMins);
        int endTimeSecs = endTime.getSecond();
        System.out.println(endTimeSecs);
        int endTimeNano = endTime.getNano();
        System.out.println(endTimeNano);

        int elapsedHours = endTimeHrs - startTimeHrs;
        int elapsedMins = endTimeMins - startTimeMins;
        int elapsedSecs = endTimeSecs - startTimeSecs;
        int elapsedNano = endTimeNano - startTimeNano;

        System.out.println("This much time has elapsed:");
        System.out.println(elapsedHours + ":" + elapsedMins + ":" + elapsedSecs + ":" + elapsedNano);
    }
}
