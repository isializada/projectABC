package leetcode;

import java.util.HashSet;

public class SingleNumber136 {
  public static void main(String[] args){
    int[] request = new int[] {1,1,4,5,5,3,2,4,3};
    System.out.println(singleNumber(request));
  }

  public static int singleNumber(int[] nums) {
    HashSet<Integer> map = new HashSet<>();
    int numsSum = 0;
    for(int i=0; i<nums.length; i++){
      numsSum+=nums[i];
    }
    for(int i=0; i<nums.length; i++){
      if(!map.add(nums[i])){
        numsSum = numsSum - nums[i]*2;
      }
    }

    return numsSum;
  }
}
