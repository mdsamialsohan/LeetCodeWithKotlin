class Solution {
    fun commonChars(words: Array<String>): List<String> {
        val cnt = IntArray(26){Int.MAX_VALUE}
        for(word in words)
        {
            val minCnt = IntArray(26)
            for(ch in word)
            {
                minCnt[ch-'a']++
            }
            for(i in 0 until 26)
            {
                cnt[i] = minOf(minCnt[i],cnt[i])
            }
        }
        val res = mutableListOf<String>()
        for(i in 0 until 26)
        {
            repeat(cnt[i])
            {
                res.add(('a'+i).toString())
            }
        }
        return res
    }
}