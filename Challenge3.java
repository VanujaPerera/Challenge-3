import java.util.*;

public class Challenge3 {

    public static int[] sortArray(int array[])
    {
        int[] arr =array;
        for (int i = 0; i < arr.length; i++) {
 
            for (int j = i + 1; j < arr.length; j++) {
 
                // Checking elements
                int temp = 0;
                if (arr[j] < arr[i]) {
 
                    // Swapping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int mode(int array[]) {
        int maxValue = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; ++i) {
            int count = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[j] == array[i])
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    public static List<Integer> findPrime(int array[]) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                primeList.add(i);
            }

        }
        return primeList;
    }

    public static double median(int[] array) {
        int middle = array.length/2;
        if (array.length%2 == 1) {
            return array[middle];
        } else {
            return (array[middle-1] + array[middle]) / 2.0;
        }
    }

    public static void main(String args[]) {

        int[] array = { 2, 30, -5, 43, 100 };
        int[] sortedArray = sortArray(array);

        int mode= mode(sortedArray);
        double median = median(sortedArray);

        System.out.println("The median is " + median);
        System.out.println("The mode is " + mode);
        System.out.println("The largest value is " + sortedArray[-1]);
        

        

    }
}
