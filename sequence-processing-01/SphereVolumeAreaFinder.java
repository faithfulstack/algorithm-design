/*
    Name: mark campbell
    Date: 1/27/25
    HW #: 2
    Problem #: 2
    Source Code: SphereVolumeAreaFinder.java
    Class: Monday | 5:22PM
    Action: Given a circle's radius this application calculates and displays the volume and area of a sphere.
*/

package testprogram.module3;


import java.util.Scanner;

public class SphereVolumeAreaFinder
{
    public static void main(String[] args)
    {

        float Radius;
        float Volume = 0;
        float SurfaceArea = 0;
        final float PI = 3.14f;

        Scanner Input = new Scanner( System.in );

        System.out.print( "Enter the Radius of a circle: " );
        Radius = Input.nextFloat();


        if ( Radius > 0 ) { // Check if calculations are needed

            Volume =  4f / (3 * ( PI * ( Radius * Radius * Radius ))); // Volume equaiont V=4(3(PI * R^3))
            SurfaceArea = PI * Volume * Volume;

        }

        System.out.printf("The Volume is %.2f and the Surface Area is %.2f", Volume, SurfaceArea);

    }
}

/* *** Application Output ***
Enter the Radius of a circle: 5
The Volume is 523.33 and the Surface Area is 859976.38
*/