public class TimeV2 {
    private int allData;

    // TODO: again, constructor should have 3 arguments
    public TimeV2(int curHours, int curMinutes, int curSeconds, boolean isAM) {
        // TODO: this totally works, and uses the same philosophy as the Student example I did in class. However, in the README you were asked for your one instance variable to represent the total number of seconds since midnight (which your allData variable doesn't). Try recoding with that representation for practice. Do you have any thoughts about the advantages/disadvantages of each representation?
        allData = 0;
        allData += curHours;
        //7
        allData *= 100;
        allData += curMinutes;
        //702
        allData *= 100;
        allData += curSeconds;
        //70205
        allData *= 10;
        if (isAM) {
            allData += 1;
        }
        //702051
    }
    public int getHours() {
        return allData / 100000;
    }
    public int getMinutes() {
        return allData % 100000 / 1000;
    }
    public int getSeconds() {
        return (allData % 1000) / 10;
    }
    public String toString() {
        String output = "";
        if (allData % 10 == 1) {
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
        TimeV2 test = new TimeV2(7, 2, 5, false);
        System.out.println(test);
    }
}
