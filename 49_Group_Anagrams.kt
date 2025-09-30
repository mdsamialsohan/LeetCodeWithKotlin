class Solutionz {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        for (s in strs) {
            val key = s.toCharArray().sorted().joinToString("")
            //println("$key -> $s")
            val list = map.getOrPut(key) { ArrayList() }
            list.add (s)
        }
        println(map)
        return ArrayList(map.values)
    }
}

fun main() {
    val solution = Solutionz()
    val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val result = solution.groupAnagrams(input)

    println(result)
}
