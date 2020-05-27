// Reverse an Array in Constant Space

public class ArrayReverse {
    
    public static void main(String[] arg) {
         arrRev();
    }

    public static void arrRev() {
        int[] test_array = { 3, 4, 7, 12, 15, 21};
        int left = 0;
        int right = test_array.length - 1;
       
        while (left < right) {
            int temp = test_array[left];
            test_array[left] = test_array[right];
            test_array[right] = temp;
            left++;
            right--;

        }
        
        for (int i = 0; i < test_array.length; i++) {
            System.out.println(test_array[i]);

        }
    
    }

}