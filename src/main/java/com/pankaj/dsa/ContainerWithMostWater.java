package com.pankaj.dsa;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int water = Math.min(height[left],height[right])*(right-left);
            if(water>area){
                area=water;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.gc();
        return area;
    }
    public int maxArea1(int[] height) {

        int area=0;
        for(int i=0; i<height.length; i++){
            for(int j=i; j<height.length; j++){
                int water = (j-i)*Math.min(height[i],height[j]);
                if(area<water){
                    area=water;
                }
            }
        }

        return area;

    }
}
