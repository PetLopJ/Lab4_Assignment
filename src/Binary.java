import java.util.Arrays;

public class Binary {

    public static int BinarySearch(int[] nums, int low, int high, int key) {
        // sets the binary search to start in middle
        if (low <= high) {
            int mid = (low + high) / 2;
            // base case if mid == key
            if (nums[mid] == key) {
                return mid;
                // if key > mid then recursively makes mid+1 the low
            } else if (nums[mid] < key) {
                return BinarySearch(nums, mid+1, high, key);
                // if key < mid then recursively makes mid-1 the high
            } else {
                return BinarySearch(nums,low, mid-1, key);
            }
        }
        // if the key is not found
        return -1;
    }
            // sets array, initializes low,high,key, assigns result to BinarySearch
        public static void main (String[] args){
            int[] nums = {2, 4, 6, 8, 10, 12, 14};
            int low = 0;
            int high = nums.length - 1;
            int key = 12;
            int result = BinarySearch(nums, low, high, key);
            // if key is found, prints the key
            if (result != -1) {
                System.out.println(nums[result]);
            }
        }
    }

