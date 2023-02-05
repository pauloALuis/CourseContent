package src.exercise.SpeedConverter;

public class SpeedConverter {

    /**
     *
     * @param kilometersPerHour
     * @return round
     */
    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    /**
     *
     * @param kilometersPerHour
     */
    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour <0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h= " + milesPerHour +
                    " mi/h");

        }
    }
}
