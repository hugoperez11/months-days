package dev.hugo;

public class MonthInfo {

    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month";
        }
    }

    public static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear ? 29 : 28;
            default:
                return -1; // Indicating invalid month
        }
    }

    public static void main(String[] args) {
        int month = 2; // Example month
        boolean isLeapYear = true; // Example leap year
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, isLeapYear);
        
        if (daysInMonth == -1) {
            System.out.println("Invalid month number.");
        } else {
            System.out.println("Month: " + monthName);
            System.out.println("Days: " + daysInMonth);
        }
    }
}

