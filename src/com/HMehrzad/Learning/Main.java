package com.HMehrzad.Learning;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        // write your code here
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            //return "Invalid value";
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        String hourString = hours + "h";
        if (hours < 10) {
            hourString = "0" + hourString;
        }
        String minutesString = remainingMinutes + "h";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondString = seconds + "h";
        if (seconds < 10) {
            secondString = "0" + secondString;
        }
        return hourString + " " + minutesString + " " + secondString + " ";
        //return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            //return "Invalid value";
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}