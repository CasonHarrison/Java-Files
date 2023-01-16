public class TimeSplitter {
    public static int TimeSplit(String Time) throws InvalidTimeException {
        String[] digits = Time.split(":",3);
        if(digits.length!=3){
            throw new InvalidTimeException("Enter a valid time");
        }
        int hours = Integer.parseInt(digits[0]);
        int minutes = Integer.parseInt(digits[1]);
        int seconds = Integer.parseInt(digits[2]);
        if (hours < 0) {
            throw new InvalidTimeException("Hours must be positive.");
        }

        if (hours > 23) {
            throw new InvalidTimeException("Hours must be below 24.");
        }

        if (minutes < 0) {
            throw new InvalidTimeException("Minutes must be positive.");
        }

        if (minutes > 59) {
            throw new InvalidTimeException("Minutes must be below 60.");
        }

        if (seconds < 0) {
            throw new InvalidTimeException("Seconds must be positive.");
        }

        if (seconds > 59) {
            throw new InvalidTimeException("Seconds must be below 60.");
        }
        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }
}
