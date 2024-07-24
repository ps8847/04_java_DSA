public class _10_max_value {
    public static void main(String[] args) {
        int[] arr = {1,3,23,5,18};
        
        System.out.println(max(arr));
    }

    static int max(int[] arr){

        int maxVal = arr[0];

        for(int i = 1; i< arr.length; i++){

            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
            
        }

        return maxVal;
    }
}
