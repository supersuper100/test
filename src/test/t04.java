package test;
import java.util.*;

public class t04 {
    public int solution(int n){
        int answer = 0;
        String[] array = String.valueOf(n).split("");
        for (String s : array){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
