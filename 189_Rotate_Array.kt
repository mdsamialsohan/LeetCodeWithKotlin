fun rotate(nums: IntArray, k: Int): Unit {
    val s = k%nums.size
    reverse(nums,0,nums.size-1)
    reverse(nums,0,s-1)
    reverse(nums,s,nums.size-1)
}
private fun reverse(nums: IntArray, left: Int , right: Int)
{
    var l = left
    var r = right
    while(l<r)
    {
        val temp = nums[l]
        nums[l++] = nums[r]
        nums[r--] = temp
    }
}