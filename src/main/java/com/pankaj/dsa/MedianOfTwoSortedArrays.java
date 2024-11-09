package com.pankaj.dsa;

//run complexicity should be O(log(m+n))
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        double result = 0.0;

            int j = 0, k = 0, num=0;
            int[] med = {0, 0};
            for (int i = 0; i < totalLength; i++) {
                if (j < nums1.length && k < nums2.length) {
                    if (nums1[j] > nums2[k]) {
                        num = nums2[k];
                        k++;
                    } else {
                        num = nums1[j];
                        j++;
                    }
                }
                else if(j>nums1.length-1){
                    num = nums2[k];
                    k++;
                }
                else if(k>nums2.length-1){
                    num = nums1[j];
                    j++;
                }
                if (totalLength % 2 == 0) {
                if (i == totalLength / 2 - 1) {
                    med[0] = num;
                }
                if (i == totalLength / 2) {
                    med[1] = num;
                    result = ((double) med[0] + med[1]) / 2;
                    break;

                }}
                else {
                    if (i == totalLength / 2) {
                        result = num;
                        break;
                    }
                }
            }


        return result;
    }
}
