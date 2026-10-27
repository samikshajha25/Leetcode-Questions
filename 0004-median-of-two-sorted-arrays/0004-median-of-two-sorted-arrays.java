class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];
        int k = 0;
        for(int i = 0; i<m; i++){
            arr[k] = nums1[i];
            k++;
        }
        for(int j = 0; j<n; j++){
            arr[k] = nums2[j];
            k++;
        }
        Arrays.sort(arr);
        if(arr.length%2 != 0){
            return arr[arr.length/2];
        }else{
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        }
    }
}