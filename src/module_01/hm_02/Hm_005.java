package module_01.hm_02;

import java.util.Scanner;

public class Hm_005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m1 = 0;
        int m2 = 0;
        int s1 = 0;
        int s2 = 0;

        int time1 = input.nextInt();

        int hours = (time1 / 3600);
        int hoursBrabus = hours % 24;
        int time2 = time1 - (hours * 3600);

        int mins = time2 / 60;
        time2 = time2 - (mins * 60);
        m1 = mins % 10;
        m2 = mins / 10;

        int secs = time2;
        s1 = secs % 10;
        s2 = secs / 10;

        System.out.println(hoursBrabus + ":" + m2 + m1 + ":" + s2+ s1);


    }
}
