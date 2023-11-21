package Converter.converter;

public class TimeConverter {

        public static int hoursToMinutes(int hours) {
            return hours * 60;
        }

        public static int minutesToHours(int minutes) {
            return minutes / 60;
        }

        public static int hoursToSeconds(int hours) {
            return hours * 3600;
        }

        public static int secondsToHours(int seconds) {
            return seconds / 3600;
        }
}
