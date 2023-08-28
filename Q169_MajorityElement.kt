//https://leetcode.com/problems/majority-element/description/
class Solution {
    fun majorityElement(nums: IntArray): Int {
        var candidate = 0
        var count = 0

        for (num in nums) {
            when{
                count == 0 -> {
                    candidate = num
                    count = 1
                }
                candidate == num -> count++
                else -> count--
            }
        }
        return candidate
    }
}