public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] med = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                med[k++] = nums1[i++];
            } else {
                med[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            med[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            med[k++] = nums2[j++];
        }

        int n = med.length;
        if (n % 2 == 1) {
            return med[n / 2];
        } else {
            return (med[(n / 2) - 1] + med[n / 2]) / 2.0;
        }
    }
}
