package leetCode.Easy


fun longestCommonPrefix(strs: Array<String>): String {
    // 첫번째 문자열을 기준으로 prefix
    var prefix = strs[0]

    // 배열의 각 문자열과 비교하면서 접두사를 점점 줄여감
    for (i in 1 until strs.size) {
        while (strs[i].indexOf(prefix) != 0) {
            // 문자열이 일치하지 않을 때마다 접두사를 한 글자씩 줄임
            prefix = prefix.substring(0, prefix.length - 1)
            // 공통 접두사가 없으면 빈 문자열 반환
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}


fun main() {
    val input1 = arrayOf("flower", "flow", "flight")
    println(longestCommonPrefix(input1))  // Output: "fl"
}
