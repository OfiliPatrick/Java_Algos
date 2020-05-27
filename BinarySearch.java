// Binary Search
public class BinarySearch {

    public static void main(String[] arg) {
        int result = binSearch();
        System.out.println(result);
    }
    public static int binSearch() {
        int[] test_array = { 3,4,7,12,15,21,38};
        int target = 15;
        int left = 0;
        int right = test_array.length-1;
        while (left <= right) {
            int mid = Math.floorDiv(left+right, 2);
            if(target < test_array[mid]){
                right = mid -1;
            }
            else if (target == test_array[mid]) {
                return target;
            }     
            else{
                left = mid + 1;
            }
        }        
        return -1;
    }

}