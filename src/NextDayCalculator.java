public class NextDayCalculator {
    public static boolean isLeapYear(int year) {
        boolean checkDivisionBy4 = year % 4 == 0;
        boolean checkDivisionBy100 = year % 100 == 0;
        boolean checkDivisionBy400 = year % 400 == 0;
        if (checkDivisionBy4) {
            if (checkDivisionBy100) {
                if (checkDivisionBy400) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static String nextDayDisplay(int day, int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    if (day == 29) {
                        day = 1;
                        month += 1;
                        return "Next day: " + day + "/" + month + "/" + year;
                    } else {
                        day += 1;
                        return "Next day: " + day + "/" + month + "/" + year;
                    }
                } else {
                    if (day == 28) {
                        day = 1;
                        month += 1;
                        return "Next day: " + day + "/" + month + "/" + year;
                    } else {
                        day += 1;
                        return "Next day: " + day + "/" + month + "/" + year;
                    }
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    month += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                } else {
                    day += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                }

            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                } else {
                    day += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                }

            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                } else {
                    day += 1;
                    return "Next day: " + day + "/" + month + "/" + year;
                }

        }
        return "Error";
    }
}
