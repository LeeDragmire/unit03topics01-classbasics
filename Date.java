public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int curDay, int curMonth, int curYear) {
        day = curDay;
        month = curMonth;
        year = curYear;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public String toString() {
        String output = "";
        if (getDay() < 10) {
            output += "0" + getDay() + "/";
        } else{
            output += getDay() + "/";
        }
        if (getMonth() < 10) {
            output += "0" + getMonth() + "/";
        } else{
            output += getMonth() + "/";
        }
        // TODO: doesn't ensure the year is always 4 digits long and pad with zeros when necessary
        output += getYear();
        return output;
    }
    public static void main(String[] args) {
        Date test = new Date(1, 3, 2023);
        System.out.println(test);
    }
}