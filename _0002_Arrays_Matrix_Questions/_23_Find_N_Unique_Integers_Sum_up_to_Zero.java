public class _23_Find_N_Unique_Integers_Sum_up_to_Zero {
    public static void main(String[] args) {
        int n1 = 5;
        int[] result1 = sumZero(n1);
        printArray(result1);
    
        // Example 2
        int n2 = 3;
        int[] result2 = sumZero(n2);
        printArray(result2);
    
        // Example 3
        int n3 = 1;
        int[] result3 = sumZero(n3);
        printArray(result3);
    }

    public static int[] sumZero(int n) {
        
        int[] array = new int[n];
         for(int i=1;i<n;i+=2) {
             array[i-1]=i;
             array[i]=-i;
         }
         return array;
     }

     public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
