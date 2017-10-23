package com.example;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2,1,2,1,4,4,7,3,4,4,3,7,8};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums){
        Set<Integer> solution = new HashSet<>();
        solution.add(nums[0]);
        for(int i = 1; i < nums.length; ++i){
            if(solution.contains(nums[i])){
                solution.remove(nums[i]);
            } else {
                solution.add(nums[i]);
            }
        }
        Iterator<Integer> iterator = solution.iterator();
        return iterator.next();
    }
}
