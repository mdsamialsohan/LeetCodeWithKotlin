 fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort()
        val n = nums.size
        for(i in 0 until n-2)
        {
            if( i>0 && nums[i] == nums[i-1]) continue
            var left = i+1
            var right = n-1
            while(left<right)
            {
                val sum = nums[i] + nums[left] + nums[right]
                if(sum == 0)
                {
                    result.add(listOf(nums[i],nums[left],nums[right]))
                    while(left<right && nums[left]==nums[left+1]) left ++
                    while(right>left && nums[right] == nums[right-1]) right--
                    left++
                    right--
                }
                else if(sum<0) left++
                else right --
            }

        }
        return result
    }


 fun threeSumBruteforce(nums: IntArray): List<List<Int>> {

     // this solution get TLE for 0(N^3)

     val result = mutableSetOf<List<Int>>()
     val n = nums.size
     nums.sort()
     for(i in 0 until n)
     {
         for(j in i+1 until n)
         {
             for(k in j+1 until n)
             {
                 if(nums[i]+nums[j]+nums[k]==0)
                 {
                     val triplet = listOf(nums[i],nums[j],nums[k])
                     result.add(triplet)
                 }
             }
         }
     }
     return result.toList()

 }