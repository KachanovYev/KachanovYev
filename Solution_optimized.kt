class Solution {
    fun maxSubarrays(n: Int, conflictingPairs: Array<IntArray>): Long {
        // Find the first pair that contains n
        val matchingPair = conflictingPairs.firstOrNull { pair -> n in pair }
            ?: return 0L
        
        // Calculate range length
        val rangeLength = kotlin.math.abs(matchingPair[1] - matchingPair[0]) + 1
        
        // Calculate total subarrays using mathematical formula
        // For a range of length k, number of subarrays = k + k*(k-1)/2 = k*(k+1)/2
        val totalSubarrays = rangeLength.toLong() * (rangeLength + 1) / 2
        
        return totalSubarrays
    }
}