package PracExcercises;

/**
 * Created by jc428795 on 9/08/17.
 */
public class InchesToFeet {
    public static void main(String args[]) {
        int inches = 86;
        int feet = inches / 12;
        int remainder = inches % 12;
        System.out.println(inches + " inches becomes " + feet + " feet and " + remainder + " inches ");
    }
}
