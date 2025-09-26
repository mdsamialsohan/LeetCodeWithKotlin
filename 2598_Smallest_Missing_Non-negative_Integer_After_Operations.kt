fun findSmallestInteger(nums: IntArray, value: Int): Int {
    val count = HashMap<Int, Int>()
    for (num in nums) {
        val reminder = ((num % value) + value) % value
        count[reminder] = (count[reminder] ?: 0) + 1
    }
    for(i in nums.indices){
        val reminder = i%value
        count [reminder] = (count[reminder] ?: 0) - 1
        if(count[reminder]!!< 0){
            return i
        }
    }
    return nums.size
}