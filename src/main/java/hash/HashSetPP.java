package hash;

import java.util.HashSet;

public class HashSetPP {
    public int solution(int[] nums) {

        HashSet<Integer> hs= new HashSet<>(); //중복제거
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }

        if(hs.size()>nums.length/2)
            return nums.length/2;
        else
            return hs.size();


    }
    public static void main(String[] args) {
        HashSetPP t = new HashSetPP();
        int[] nums = {3,3,3,2,2,4};
        System.out.println(t.solution(nums));


    }
}
