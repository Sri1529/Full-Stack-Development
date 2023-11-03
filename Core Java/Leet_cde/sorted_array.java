package Leet_cde;
import java.util.*;

class sorted_array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int size = m + n;
        int index = 0;
        int temp;

        int sorted[] = new int[size];

        for (int i = 0; i < m; i++) {
            sorted[index++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            sorted[index++] = nums2[i];
        }
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (sorted[j] > sorted[i]) {
                    temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        double median;
        int midind = size / 2 - 1;
        int midind2 = size / 2;

        if (size % 2 == 1) {
            median = sorted[((size + 1) / 2) - 1];
        } else {
            median = (sorted[midind] + sorted[midind2]) / 2.0;
        }
        return median;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of nums1");
        int m = sc.nextInt();
        System.out.println("Enter the size of nums2");
        int n = sc.nextInt();
        int nums1[] = new int[m];
        int nums2[] = new int[n];

        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            nums2[j] = sc.nextInt();
        }

        sorted_array solution = new sorted_array();
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);

        sc.close();
    }
}
