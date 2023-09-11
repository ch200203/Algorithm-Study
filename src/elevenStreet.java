public class elevenStreet {
    public static void main(String[] args) {
        System.out.println(solution("And now here is my secret", 15)); // "And now ..."
        System.out.println(solution("There is an animal with four legs", 15)); // "There is an ..."
        System.out.println(solution("super dog", 4)); // "..."
        System.out.println(solution("how are you", 20)); // "how are you"
    }

    private static String solution(String message, int K) {
        // message의 길이가 K보다 작거나 같으면 바로 반환
        if (message.length() <= K) {
            return message;
        }

        // 메시지를 단어별로 분리
        String[] words = message.split(" ");
        StringBuilder notification = new StringBuilder();

        for (String word : words) {
            if (notification.length() + word.length() + 4 > K) { // 4는 " ..."의 길이
                break;
            }
            notification.append(word).append(" ");
        }

        // 마지막 공백 제거
        if (notification.length() > 0) {
            notification.setLength(notification.length() - 1);
        }

        // 단어가 하나도 포함되지 않는 경우
        if (notification.length() == 0) {
            return "...";
        }

        // " ..." 추가
        notification.append(" ...");
        return notification.toString();
    }

}
