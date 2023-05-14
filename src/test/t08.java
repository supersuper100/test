package test;

public class t08 {
    public long solution(long n){
        for (int i = 2; i <= n; i++) {
            if (n % i ==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        long n = 10;
        t08 sol = new t08();
        long answer = sol.solution(n);
        System.out.println(answer);

        n = 10;
        answer = sol.solution(n);
        System.out.println(answer);
    }
}
