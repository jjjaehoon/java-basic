package static2.ex2;

public class MathArrayUtils {
    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (minValue > value) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[values.length - 1];
        for (int value : values) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
