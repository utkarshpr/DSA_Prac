class Solution {
    public int reversePairs(int[] a) {
      return mergeSort(a,0, a.length - 1);
    }

    /**
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //Modification 1: cnt variable to count the pairs:
        int cnt = 0;
        while(left<=mid && right<=high){
            if ((long) arr[left] <= 2L * arr[right]) {
                left++;
            } else {
                cnt += mid - left + 1;
                right++;
            }
        }
         left = low;      // starting index of left half of arr
         right = mid + 1;  
        while(left<=mid && right<=high){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;

            }
            else{
               // cnt+=(mid - left + 1); 
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }


        return cnt;
    }

   
}
