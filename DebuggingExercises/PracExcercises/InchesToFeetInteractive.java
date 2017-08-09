package PracExcercises;

import java.util.Scanner;

/**
 * Created by jc428795 on 9/08/17.
 */
public class InchesToFeetInteractive {
    public static void main(String args[]) {
        int inches;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("How many inches?");
        inches = inputDevice.nextInt();
        int feet = inches / 12;
        int remainder = inches % 12;
        System.out.println(inches + " inches becomes " + feet + " feet and " + remainder + " inches ");
    }
}
