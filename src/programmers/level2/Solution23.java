package programmers.level2;

import java.util.Arrays;

/**
 * 스킬트리
 * https://school.programmers.co.kr/learn/courses/30/lessons/49993
 */
public class Solution23 {
    /**
     * 내 풀이
     */
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skills = skill.toCharArray();
        
        for(int i = 0; i < skill_trees.length; i++) {
            if(isRightSkillTree(skill_trees[i], skill ,skills)) answer++;
        }
        
        return answer;
        
    }
    
    public static boolean isRightSkillTree(String skillTree, String skill, char[] skills) {
        int idx = 0;
        for(Character c : skillTree.toCharArray()) {
            if(skill.contains(String.valueOf(c))) {
                if(c == skills[idx]) {
                    idx++;
                    continue;
                } else {
                    return false;
                }
            }
        }
        
        return true;
        
    }

    /**
     * Stream을 사용한 풀이
     * skill_trees에 skill을 맞추지 않고
     * skill에 없는 문자열들을 skill_trees에서 전부 공백 문자열로 변환 => skill에 skill_trees의 맨 앞 문자열이 skill의 맨앞 문자열과 같은지 비교
     */
    public static int solution_stream(String skill, String[] skill_trees) {
        String regex = "[^" + skill + "]";
        return (int) Arrays.stream(skill_trees)
                .filter(tree -> skill.startsWith(tree.replaceAll(regex, ""))).count();

    }
    
}
