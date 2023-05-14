package DSAProblems;

public class RotatedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target,0,arr.length -1 ));
    }
    public static int search(int[] arr, int tar, int si, int ei) {
        //base
        if(si > ei) {
            return -1;
        }
        //kaam
        int mid = si + (ei - si) /2;

        //case found;
        if(arr[mid] == tar) {
            return mid;
        }

        // mid on l1
        if(arr[si] <= arr[mid]) {
            //case a : left
            if(arr[si] <= tar && tar <= arr[mid]) {
                return search(arr,tar,si,mid -1);
            } else {
                //case b: right
                return search(arr,tar,mid + 1,ei);
            }
        }
        //mid on l2
        else {
            //case C : RIGHT
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr,tar,mid + 1,ei);
            } else {
                //case b: right
                return search(arr,tar,si,mid - 1);
            }
        }

        /**while(si <= ei ) {

            int mid = si + (ei - si)/2;

            if(arr[mid] == tar) {
                return mid;
            }
            if(arr[si] <= arr[mid]) {
                // case a
                if(arr[si] <= tar && tar <= arr[mid]) {
                    ei = mid - 1;

                } else {
                    si = mid + 1;

                }
            } else {
                if(arr[mid] <= tar && tar <= arr[ei]) {
                    si = mid + 1;
                } else{
                    ei = mid -1;
                }
            }
        }
        return -1;**/
    }
}
