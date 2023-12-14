public class _03_find_duplicate_number {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findduplicate(arr));
    }

    static int findduplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i+1){
                int correct = arr[i];
    
                if(arr[i] != arr[correct]){
                    swap(arr , i , correct);
                } else {
                    return arr[i];
                }

            } else {
                i++;
            }
        }

        
        return -1;
    }

    static void swap(int[] arr , int f ,  int s){
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}
