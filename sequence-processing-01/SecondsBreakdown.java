/*
    Name: mark campbell
    Date: 1/27/25
    HW #: 2
    Problem #: 3
    Source Code: SecondsBreakdown.java
    Class: Monday | 5:22PM
    Action: Given a total number of seconds, this application breaks it down and displays them into days, hours,
            minutes, and remaining seconds.
*/

package testprogram.module3;


import java.util.Scanner;

public class SecondsBreakdown
{
    public static void main(String[] args)
    {

        int TotalSeconds;
        int Day = 0;
        int Hours = 0;
        int Minutes = 0;
        int Seconds = 0;
        final int SECONDS_PER_DAY = 84600;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;


        Scanner Input = new Scanner( System.in );

        System.out.print("Enter the total time in seconds: ");
        TotalSeconds = Integer.parseInt( Input.nextLine() );

        if ( TotalSeconds != 0 ){

            Day = TotalSeconds / SECONDS_PER_DAY;
            Seconds = TotalSeconds % SECONDS_PER_DAY;

            Hours = Seconds / SECONDS_PER_HOUR;
            Seconds = Seconds % SECONDS_PER_HOUR;

            Minutes = Seconds / SECONDS_PER_MINUTE;
            Seconds = Seconds % SECONDS_PER_MINUTE;

        }

        System.out.println (Day + " day, " + Hours + " hours, " + Minutes + " minutes, " + Seconds + " seconds");

    }
}

/* *** Application Output ***

Enter the total time in seconds: 209000
2 day, 11 hours, 3 minutes, 20 seconds

*/