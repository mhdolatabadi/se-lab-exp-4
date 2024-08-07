package ProfilingTest.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = new int[1000000];
        int[] array2 = new int[1000000];

        fillArray(array1);
        fillArray(array2);

        Set<Integer> commonElements = findCommonElements(array1, array2);

        System.out.println("Common Elements Count: " + commonElements.size());
    }

    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2000000);
        }
    }

    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>(1000000);
        Set<Integer> commonSet = new HashSet<>(1000000);

        for (int num : array1) {
            set1.add(num);
        }

        for (int num : array2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }

        return commonSet;
    }
}
