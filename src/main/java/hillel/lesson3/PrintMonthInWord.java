package hillel.lesson3;

public class PrintMonthInWord {
    public static void main(String[] args) {
        int numberMonth = 20;
        String month;
        if (numberMonth == 1) {
            month = "January";
            }else if (numberMonth == 2) {
                month = "February";
            } else if (numberMonth == 3) {
                month = "March";
            } else if (numberMonth == 4) {
                month = "April";
            } else if (numberMonth == 5) {
                month = "May";
            } else if (numberMonth == 6) {
                month = "June";
            } else if (numberMonth == 7) {
                month = "July";
            } else if (numberMonth == 8) {
                month = "August";
            } else if (numberMonth == 9) {
                month = "September";
            } else if (numberMonth == 10) {
                month = "October";
            } else if (numberMonth == 11) {
                month = "November";
            } else if (numberMonth == 12) {
                month = "December";
        } else month = "Not a valid month";
        System.out.println(month);
        }
    }
