/*
    Name: mark campbell
    Date: 1/27/25
    HW #: 2
    Problem #: 1
    Source Code: ThirdAngleFinder.java
    Class: Monday | 5:22PM
    Action: This calculates and displays the 3rd angle of a triangle based on the other two angles.
*/

package testprogram.module3;


import java.util.Scanner;

public class ThirdAngleFinder
{
    public static void main(String[] args)
    {
        int AngleOne;
        int AngleTwo;
        int AngleThree;
        final int SUM_OF_ANGLES_IN_TRIANGLE = 180;

        Scanner Input = new Scanner( System.in );

        System.out.print( "Enter degrees of the first angle: " );
        AngleOne = Input.nextInt(); // this should be positive numbers only

        System.out.print( "Enter degrees of the second angle: " );
        AngleTwo = Input.nextInt(); // this should be positive numbers only

        AngleThree = SUM_OF_ANGLES_IN_TRIANGLE - ( AngleOne + AngleTwo );

        System.out.println( "The third angle of the triangle is " + AngleThree );
    }
}

/* *** Application Output ***

Enter degrees of the first angle: 35
Enter degrees of the second angle: 45
The third angle of the triangle is 100

 */