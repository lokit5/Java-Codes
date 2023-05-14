package Array1D;

public class Q2 {
    public static void main(String[] args) {
        int[] nums = {1};
        //int target = 0;
        System.out.println(rotated(nums,0));
    }
    public static int rotated(int[] arr, int target) {
        if(arr.length == 1) {
            if(target==arr[0]) {
                return 0;
            }else {
                return -1;
            }
        }
        int peak = arr.length - 1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid =  start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]) {
                peak = mid;
                break;
            } else if(arr[mid] < arr[mid - 1]) {
                peak = mid -1;
                break;
            } else if(arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if(target == arr[peak]) {
            return peak;
        }else if(target >= arr[start]) {
            return binarySearch(0,peak,arr,target);
        }else {
            return binarySearch(peak+1, arr.length -1, arr, target);
        }

    }
    public static int binarySearch(int start, int end,int[] arr,int target){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            }else if(target < arr[mid] ) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
