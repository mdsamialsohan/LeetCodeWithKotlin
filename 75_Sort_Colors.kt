
fun sortColors(nums: IntArray): Unit {
    //this solution with 3 pointers
    var zero = -1
    var one = -1
    var two = -1
    for ( num in nums)
    {
        if(num==0)
        {
            nums[++two] = 2
            nums[++one] = 1
            nums[++zero] = 0
        }
        else if(num==1)
        {
            nums[++two] = 2
            nums[++one] = 1
        }

        else nums[++two] = 2
    }

}