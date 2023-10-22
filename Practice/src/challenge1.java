public class challenge1 {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double milesPerHour = (double) (1.0 / 1.609) * kilometersPerHour;
        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);
        if (miles == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
        String printOut = (miles == -1) ? "Invalid Value" : kilometersPerHour + " km/h = " + miles + " mi/h";
        System.out.println((miles == -1) ? "Invalid xx Value" : kilometersPerHour + " km/h = " + miles + " xxx mi/h");
    }

    public static void main(String[] args) {
        double[] mileSpeeds = { 1.5, 10.25, -5.6, 25.42, 75.114 };
        for (int i = 0; i < mileSpeeds.length; i++) {
            printConversion(mileSpeeds[i]);
        }
    }
}
