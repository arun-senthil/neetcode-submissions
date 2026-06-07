class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, cnt = 0;
        //O(n)
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                res = Math.max(res, cnt);
                cnt = 0;
            } else {
                cnt ++;
            }
        }
        return res = Math.max(res, cnt);
    }
}