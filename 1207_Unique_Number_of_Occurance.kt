fun uniqueOccurrences(arr: IntArray): Boolean {
    val set  = mutableSetOf<Int>()
    val map = mutableMapOf<Int,Int>()
    for(n in arr)
    {
        map[n] = map.getOrDefault(n, 0) + 1
    }
    for ((_, cnt) in map){
        if(!set.add(cnt)) return false
    }
    return true
}