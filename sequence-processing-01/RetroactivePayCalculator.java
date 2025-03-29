


/*
    Name: mark campbell
    Date: 1/28/25
    HW #: 2
    Problem #: 4
    Source Code: RetroactivePayCalculator.java
    Action: Calculates the pay raise increase and the amount to pay retroactively for 6 months for a given employee's salary and displays the new amounts.
*/

package testprogram.module3;


import java.util.Scanner;

public class RetroactivePayCalculator
{
    public static void main(String[] args)
    {
        final float PAY_INCREASE = .076f;
        final int RETROACTIVE_TIME_RANGE = 6;
        float PreviousAnnualSalary;

        Scanner input = new Scanner( System.in );
        System.out.print("Please enter employee's salary --> ");
        PreviousAnnualSalary = input.nextFloat();

        // calculate the old monthly salary and 6 months worth to help with the retroactive pay amount
        float OldMonthlySalary = PreviousAnnualSalary / 12;
        float PreviousSixMonthSalary = OldMonthlySalary * RETROACTIVE_TIME_RANGE;

        float NewAnnualSalary = PreviousAnnualSalary * PAY_INCREASE + PreviousAnnualSalary;
        float NewMonthlySalary = NewAnnualSalary / 12;
        float RetroactiveSalary = PreviousSixMonthSalary * PAY_INCREASE;

        System.out.println();
        System.out.printf("%-19s %s $%.1f %n", "Retroactive Pay", "-->", RetroactiveSalary);
        System.out.printf("%-19s %s $%.1f %n", "New Annual Salary", "-->", NewAnnualSalary);
        System.out.printf("%-19s %s $%.4f %n", "New Monthly Salary", "-->", NewMonthlySalary);
    }
}

/* *** Application Output ***

Please enter employee's salary --> 52450

Retroactive Pay     --> $1993.1
New Annual Salary   --> $56436.2
New Monthly Salary  --> $4703.0166

*/