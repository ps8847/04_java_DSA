public class _01_missing_number {
    public static void main(String[] args) {
        
        int[] arr = {4,0,2,1};
        System.out.println(missingnum(arr));
    }

    static int missingnum(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];

            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr , i , correct);
            } else {
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr , int f ,  int s){
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}
