class Solution {
    public int[] twoSum(int[] nums, int target) {

        if(nums.length >= 2 && nums.length <= Math.pow(10,4)){

            for(int i = 0; i < nums.length; i++){

                for(int j = i+1; j < nums.length; j++){

                    if(nums[j]+nums[i] == target ) {

                        return new int[]{i, j};

                    }

                }

            }

        }

        return new int[]{};

    }

}
