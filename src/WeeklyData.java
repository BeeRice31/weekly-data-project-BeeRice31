/**
 * The WeeklyData class stores and analyzes a week's worth of numeric data.
 * This could represent steps taken, hours of sleep, money spent, screen time,
 * or any other measurable daily value.
 */
public class WeeklyData {

    // Instance Variables
    private double[] data;

    /**
     * Constructs a WeeklyData object by making a deep copy of the input array.
     *
     * @param input an array representing daily values
     */
    public WeeklyData(double[] input) {
        if (input == null) {
            this.data = new double[0];
        } else {
            this.data = new double[input.length];
            for (int i = 0; i < input.length; i++) {
                this.data[i] = input[i];
            }
        }
    }

    /**
     * Calculates and returns the total of all values in the week.
     *
     * @return the sum of all values in the data array
     */
    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    /**
     * Calculates and returns the average value for the week.
     *
     * @return the average of the values in the array,
     *         or 0.0 if the array is empty
     */
    public double getAverage() {
        if (data.length == 0) {
            return 0.0;
        }
        return getTotal() / data.length;
    }

    /**
     * Finds and returns the highest value in the data array.
     *
     * @return the maximum value
     */
    public double getMax() {
        if (data.length == 0) {
            return 0.0;
        }
        double max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    /**
     * Finds and returns the lowest value in the data array.
     *
     * @return the minimum value
     */
    public double getMin() {
        if (data.length == 0) {
            return 0.0;
        }
        double min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    /**
     * Returns a formatted, multi-line String showing each day's data.
     *
     * @return a formatted String representing the week's data
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            sb.append("Day ").append(i + 1).append(": ").append(data[i]);
            if (i < data.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
