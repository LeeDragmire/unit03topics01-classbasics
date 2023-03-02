public class TimeV1 {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean am;

    public TimeV1(int curHours, int curMinutes, int curSeconds, boolean isAM) {
        hours = curHours;
        minutes = curMinutes;
        seconds = curSeconds;
        am = isAM;
    }
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public String toString() {
        String output = "";
        if (am) {
            output += getHours() + ":";
        } else {
            output += getHours() + 12 + ":";
        }
        if (getMinutes() < 10) {
            output += "0" + getMinutes() + ":";
        } else {
            output += getMinutes() + ":";
        }
        if (getSeconds() < 10) {
            output += "0" + getSeconds();
        } else {
            output += getSeconds();
        }
        return output;
    }
    public static void main(String[] args) {
        TimeV1 test = new TimeV1(7, 2, 0, false);
        System.out.println(test);
    }
}
