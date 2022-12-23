import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
            list.add(scan.nextLine());
        }
        
        int answer = 0, idx = 0;
        Set<String> set = new HashSet<>();
        
        while(idx > list.get(0).length() - 1) {
            for(String s :list) {
                String str = s.substring(idx, s.length() -1);
                set.add(str);
                
                if(set.size() == N) {
                    System.out.println(answer);
                    return;
                }
                
                set.clear();
            }
        }
        
        
    }
}