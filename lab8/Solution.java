package lab8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Am pus solutia si pe LambdaChecker insa nu iau punctaj (Am verificat solutia local si nu are probleme)

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            Integer x = scanner.nextInt();
            if(!hashMap.containsKey(x)){
                hashMap.put(x, 1);
            }
            else{
                hashMap.put(x, hashMap.get(x) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            System.out.printf("%d: %d ", entry.getKey(), entry.getValue());
        }

    }

}
