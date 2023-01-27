fun main() {
    print(pivotIndex(intArrayOf(2, 1, -1)))
}

fun pivotIndex(nums: IntArray): Int {

    var currentIndex = 0

    for (i in nums.indices) {
        var sumLeft = 0
        var sumRight = 0
        for (j in 0 until currentIndex) {
            sumLeft += nums[j]
        }

        for (j in currentIndex + 1 until nums.size) {
            sumRight += nums[j]
        }

        if (sumLeft == sumRight)
            return currentIndex

        currentIndex++
    }

    return -1
}