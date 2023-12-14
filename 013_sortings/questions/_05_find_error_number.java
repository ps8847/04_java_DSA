import java.util.Arrays;

public class _05_find_error_number {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(finderrnum(arr)));
    }

    static int[] finderrnum(int[] arr){
        int i = 0;
        while(i < arr.length){
                int correct = arr[i] - 1;
    
                if(arr[i] != arr[correct]){
                    swap(arr , i , correct);
                } else {
                    i++;
                }

        
        }

        
        for(int in = 0; in < arr.length; in++){
            if(arr[in] != in+1){
                return new int[] {arr[in] , in + 1};
            }
        }

        return new int[] {-1,-1};

    }

    static void swap(int[] arr , int f ,  int s){
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}
