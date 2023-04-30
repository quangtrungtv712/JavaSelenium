package lab;

public class Lab_06_01 {
    public static void main(String[] args) {

        String timeStr = "2hrs amd 5 minutes";

        String hoursIndex = timeStr.substring(0, 1);
        String minutesIndex = timeStr.substring(9, 10);

        int hours = Integer.valueOf(hoursIndex);
        int minutes = Integer.valueOf(minutesIndex);

        System.out.println(hoursIndex);
        System.out.println(minutesIndex);

        int totalMinutes = hours * 60 + minutes;
        System.out.println("Total Minutes: " + totalMinutes);

    }
}
