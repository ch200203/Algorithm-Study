package programmers.level2.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solutio1 {
 public static void main(String[] args) {
     String phone_book [] = {"123","456","789"};
    
     System.out.println(solution(phone_book));

     Scanner scan = new Scanner(System.in);
     
 }  
 
 public static Boolean solution(String [] phone_book)  {
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < phone_book.length; i++) {
        map.put(phone_book[i], i);
    }

    for(int i = 0; i < phone_book.length; i++){
        for (int j = 0; j < phone_book[i].length(); j++) {
            if(map.containsKey(phone_book[i].substring(0, j))) {
                return false;
            }
        }
    }

    return true; 
 }
}