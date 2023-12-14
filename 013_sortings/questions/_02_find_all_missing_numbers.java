import java.util.ArrayList;
import java.util.List;

public class _02_find_all_missing_numbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findallmissingnumbers(arr));
    }

    static List<Integer> findallmissingnumbers(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int in = 0; in < arr.length; in++){
            if(arr[in] != in+1){
                ans.add(in + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr , int f ,  int s){
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }

} 
