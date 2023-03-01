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

        }
        return output;
    }
    public static void main(String[] args) {
        
    }
}
