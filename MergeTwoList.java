// Merge Two Sorted Lists

import java.util.ArrayList;
public class MergeTwoList {
    
    public static void main(String[] arg) {
         merge();
    }

    public static void merge() {
        int[] test_array1 = { 3, 7, 12, 21, 34 };
        int[] test_array2 = { 4, 15, 25 };
        ArrayList<Integer> result = new ArrayList<>();
        int first = 0;
        int second = 0;

        while (first < test_array1.length && second < test_array2.length) {
            if (test_array1[first] <= test_array2[second]) {
                result.add(test_array1[first]);
                first++;
            }
            else {
                result.add(test_array2[second]);
                second++;
            }
        }
        for (int i = first; i < test_array1.length; i++) {
            result.add(test_array1[first]);

        }
        for (int i = second; i < test_array2.length; i++) {
            result.add(test_array2[second]);
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.toArray()[i]);
        }
    }
}