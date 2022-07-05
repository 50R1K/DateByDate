package com.TreatTime.DateByDate;

public class DateToCode {
    public static double dateToCode(int year, int month, int day) {
        Months[] monthsArr = Months.values();
        int monthCode = monthsArr[month - 1].getMonthCode();
        return (day + yearToCode(year) + monthCode) % 7;
    }

    private static double yearToCode(int year) {
        int def = 6;
        for (int i = 0; i < year / 100; i++) {
            def -= 2;
            if (def < 0) {
                def = 6;
            }
        }
        double twoLastDigits = year % 100;
        return (def + twoLastDigits + Math.floor(twoLastDigits / 4)) % 7;
    }
}

