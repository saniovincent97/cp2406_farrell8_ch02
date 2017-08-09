package PracExcercises;

/**
 * Created by jc428795 on 9/08/17.
 */
public class MinutesConversion {
    public static void main(String args[]){
        int minutes = 6000;
        int hours = minutes / 60;
        int days = minutes / 1440;
        System.out.println(minutes + " minutes equals " + hours + " hours and equals " + days + " days.");
    }
}
