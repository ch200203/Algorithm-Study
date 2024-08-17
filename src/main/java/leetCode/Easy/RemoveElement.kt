package leetCode.Easy

// 27. Remove Element
// https://leetcode.com/problems/remove-element/description/
class RemoveElement {
    fun removeElement(nums: IntArray, target: Int): Int {
        var index = 0
        for (i in nums.indices) {
            if (nums[i] != target) {
                nums[index] = nums[i]
                index++
            }
        }
        return index
    }
}

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    val target = 3

    val removeElement = RemoveElement()
    println(removeElement.removeElement(nums, target))

    val nums2 = intArrayOf(0,1,2,2,3,0,4,2)
    val target2 = 2

    println(removeElement.removeElement(nums2, target2))
}
