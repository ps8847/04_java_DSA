public class _28_Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        median = findMedianSortedArrays(nums3, nums4);
        System.out.println("Median: " + median);
    }

    // method 1 : brute force

    // public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int m = nums1.length;
    //     int n = nums2.length;
    //     int[] merged = new int[m + n];
    //     int i = 0, j = 0, k = 0;

    //     // Merge the two sorted arrays into one
    //     while (i < m && j < n) {
    //         if (nums1[i] < nums2[j]) {
    //             merged[k++] = nums1[i++];
    //         } else {
    //             merged[k++] = nums2[j++];
    //         }
    //     }

    //     while (i < m) {
    //         merged[k++] = nums1[i++];
    //     }

    //     while (j < n) {
    //         merged[k++] = nums2[j++];
    //     }

    //     // Calculate the median
    //     if ((m + n) % 2 == 0) {
    //         int mid1 = merged[(m + n) / 2 - 1];
    //         int mid2 = merged[(m + n) / 2];
    //         return (double) (mid1 + mid2) / 2.0;
    //     } else {
    //         return (double) merged[(m + n) / 2];
    //     }
    // }


    // method 2

    public static double findMedianSortedArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int n = (n1 + n2);
    
        int ind1 = (n - 1) / 2;
        int ind2 = n / 2;
        int i = 0;
        int j = 0;
        int cnt = 0;
        int ind1el = -1, ind2el = -1;
    
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (cnt == ind1) ind1el = a[i];
                if (cnt == ind2) ind2el = a[i];
                cnt++;
                i++;
            } else {
                if (cnt == ind1) ind1el = b[j];
                if (cnt == ind2) ind2el = b[j];
                cnt++;
                j++;
            }
        }
    
        while (i < n1) {
            if (cnt == ind1) ind1el = a[i];
            if (cnt == ind2) ind2el = a[i];
            cnt++;
            i++;
        }
    
        while (j < n2) {
            if (cnt == ind1) ind1el = b[j];
            if (cnt == ind2) ind2el = b[j];
            cnt++;
            j++;
        }
    
        if (n % 2 == 1) {
            return (double) ind2el;
        }
    
        return (double) (ind1el + ind2el) / 2.0;
    }
    
}
