package test;
import java.util.*;
public class t07 {
    public long[] solution(int x, int n){
        long[] answer = new long[n];
        long sum = x;
        for (int i = 0; i < n; i++) {
            answer[i] = sum;
            sum += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        t07 sol = new t07();
        long[] answer = sol.solution(x,n);
        System.out.println(Arrays.toString(answer));
    }

}
