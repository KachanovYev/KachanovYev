class Solution {
    fun maxSubarrays(n: Int, conflictingPairs: Array<IntArray>): Long {
        val filtered = conflictingPairs.filter { pair -> n in pair }.toTypedArray()
        var maximumNumberofSubarrays = 0L
        if (filtered.isNotEmpty()) {
            val firstPair: IntArray = filtered[0]
            val xPair = firstPair[0].toLong()
            val yPair = firstPair[1].toLong()
            maximumNumberofSubarrays = kotlin.math.abs(yPair - xPair) + 1
            val result = mutableListOf<List<Int>>()
    val arr = (firstPair[0]..firstPair[1]).toList()
    val n = arr.size
    for (start in 0 until n) {
        for (end in (start + 1) until n) {
            result.add(arr.subList(start, end + 1))
        }
    }
    maximumNumberofSubarrays = maximumNumberofSubarrays + result.size
        }
            
        return maximumNumberofSubarrays
    }
}