package gr.aueb.cf.cf9.solutions.ch13;

public class MathHelper {

    private MathHelper(){}

    public static int findingMax(int[] array) {
        int largest = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] > largest) {
                largest = array[i];
            }

        }
        return largest;
    }

    public static int findingMin(int[] array) {
        int smallest = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
            }

        }
        return smallest;
    }

    public static int findingMean(int[] array) {
        int mean = 0;

        for(int i = 0; i < array.length; i++) {
                mean += array[i];

        }
        return mean/array.length;
    }
}


//public class MathHelper {
//
//    public static double sum(double... numbers) {
//        double sum = 0;
//        for (double number : numbers) {
//            sum += number;
//        }
//        return sum;
//    }
//
//    public static double average(double... numbers) {
//        return sum(numbers) / numbers.length;
//
//    }
//
//    public static double max(double... numbers) {
//        double max = Double.MIN_VALUE;
//        for (double number : numbers) {
//            if (number > max) max = number;
//        }
//        return max;
//    }
//
//    public static double min(double... numbers) {
//        double min = Double.MAX_VALUE;
//        for (double number : numbers) {
//            if (number < min) min = number;
//        }
//        return min;
//    }
//
//    public static double pow(double base, int exponent) {
//        double result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= base;
//        }
//        return result;
//    }
//}
