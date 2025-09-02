class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set: MutableSet<Int> = nums1.toMutableSet()
        val ans = mutableListOf<Int>()
        for(num in nums2)
        {
            if(set.remove(num))
                ans.add(num)
        }
        return ans.toIntArray()

    }
}