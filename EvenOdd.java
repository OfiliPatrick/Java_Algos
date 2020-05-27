// Arrange an array such that even numbers appear first while odd numbers last in constant space

public class EvenOdd {
    public static void main(String[] arg) {
         EvenOddFunc();
    }
    public static void EvenOddFunc() {
        int[] test_array = { 12, 4, 7, 3, 6, 21};
        int even_pointer = 0;
        int  odd_ponter = test_array.length - 1;
       
        while (even_pointer < odd_ponter) {
            if (test_array[even_pointer] % 2 == 0) {
                even_pointer ++;
            }
            else{
            int temp = test_array[even_pointer];
            test_array[even_pointer] = test_array[odd_ponter];
            test_array[odd_ponter] = temp;
            odd_ponter--;
            }

        }
     
        for (int i = 0; i < test_array.length; i++) {
            System.out.println(test_array[i]);

        }
    
    }

    
}