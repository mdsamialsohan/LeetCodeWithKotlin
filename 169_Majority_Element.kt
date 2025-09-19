fun majorityElement(nums: IntArray): Int {
    var ans = 0
    var cnt = 0
    for(n in nums)
    {
        if(cnt == 0 )
        {
            ans = n
            cnt++
        }
        else if(ans == n)
            cnt++
        else cnt--
    }
    return ans
}