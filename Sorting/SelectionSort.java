public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {13,46,52,24,20,9};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i;j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i : arr){
            System.out.print(i +" ");
        }
    }
}