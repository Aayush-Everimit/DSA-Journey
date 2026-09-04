class Solution 
{
    public void sortColors(int[] nums) 
    {
        quicksort(nums,0,nums.length-1);
    }
    private static void quicksort(int[] arr , int low , int high){
        if (low >= high) return; 
        int pivot = partition(arr, low , high);
        quicksort(arr, low , pivot-1);
        quicksort(arr, pivot+1 , high);
    }
    private static int partition(int[] arr , int low , int high){
        int mid = low + (high-low)/2;
        int pivot = arr[mid];

        swap(arr , mid , high);
        int i = low;
        for ( int j = low ; j < high ; j++){
            if(arr[j] < pivot){
                swap(arr, i , j);
                i++;
            }
        }
        swap(arr, i , high);
        return i;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}