package test;

public class t06 {
    public int solution(int n){
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
       int n = 12;
       t06 sol = new t06();
       int answer = sol.solution(n);
        System.out.println(answer);
    }
}
