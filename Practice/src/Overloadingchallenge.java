public class Overloadingchallenge {

    //  convert challenge
    public static double convertToCentimeters(int inches) {
        int feet = 0;
        return convertToCentimeters(feet, inches);
    }

    public static double convertToCentimeters(int feet, int inches) {
        double centimetres = ((int) feet * 12 + inches) * 2.54;
        System.out.println("The value in CM is " + centimetres);
        return centimetres;
    }
    

    // seconda and minutes challenge
    public static String getDurationString(long seconds) {
        long minutes = 0;
        return getDurationString(minutes, seconds);

    }

    public static String getDurationString(long minutes, long seconds) {
        long totalSeconds = minutes * 60 + seconds;
        long days = totalSeconds / (24 * 60 * 60);
        long secondsLeft = totalSeconds % (24 * 60 * 60);
        long hours = secondsLeft / (60 * 60);
        secondsLeft = totalSeconds % (60 * 60);
        minutes = secondsLeft / 60;
        secondsLeft = secondsLeft % 60;
        return days + "d " + hours + "h " + minutes + "m " + secondsLeft + "s";
        
    }

    public static void main(String[] args) {
        //  convert challenge
        System.out.println("Convert feet to inches challenge");
        System.out.println(convertToCentimeters(6, 8));
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 11));
        

        // seconda and minutes challenge

        System.out.println("Time convert");
        System.out.println(getDurationString(155, 400));
        System.out.println(getDurationString(1_000_000));
        System.out.println(getDurationString(1_000_000_000_000L));
        System.out.println(getDurationString(Long.MAX_VALUE));
        System.out.println(getDurationString(1_500, 400));
        System.out.println(getDurationString(6, 35));
        System.out.println(Long.MAX_VALUE);
    }
}
