package com.rupali.Day56;
public class RotateArray {
    public static void rotat(int[] nums, int k) {
        int n = nums.length;
       int [] copy=nums.clone();
       for(int i=0;i<n;i++){
           nums[(i+k)%n]=copy[i];
        }
    }

    public static void main(String[] args) {
        RotateArray rotate=new RotateArray();
        int [] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate.rotat(nums,k);
        for(int num:nums){
            System.out.print(num+ " ");
        }
    }
}
