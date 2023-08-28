//https://leetcode.com/problems/two-sum/
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()
        nums.forEachIndexed{i,q->
            val complement = target - nums[i]
            if(map.containsKey(complement)){
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}