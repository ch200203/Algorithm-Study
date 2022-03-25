package baekjoon;

import java.util.Scanner;

public class Main_10039 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int input = scan.nextInt();
            if(input < 40) input = 40;
            sum += input; 
        }

        System.out.println(sum / 5);
    }
}
