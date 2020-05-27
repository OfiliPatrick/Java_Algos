// Check if a given number is a prime number
public class IsPrime {

    public static void main(String[] arg) {
        Boolean result = isPrime();
        System.out.println(result);
    }

    public static Boolean isPrime() {
        int test_num = 15;
        for (int num = 2; num < test_num; num++) {
            if (test_num % num == 0) {
                return false;
            }
        }
        return true;
    }
}