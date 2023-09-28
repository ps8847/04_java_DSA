public class _12_Find_the_Highest_Altitude {
    public static void main(String[] args) {
        
        int val[] = {52,-91,72};

        System.out.println("ans " + largestAltitude(val));
    }

    public static int largestAltitude(int[] gain) {
        
        int currentAltitude = 0;
        int highestAltitude = 0;
        
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            highestAltitude = Math.max(highestAltitude, currentAltitude);
        }
        
        return highestAltitude;

        // int highest = 0;
        // int prevEl = gain[0];
        // for(int i = 0; i < gain.length - 1 ; i++){

        //     int now = prevEl + gain[i+1];
        //     prevEl = now;
        //     System.out.println(now);
        //     if(now > highest){
        //         highest = now;
        //     }
        // }
        // return highest;
    }
}
