package test;

public class t10 {
    public long solution(int a, int b){
       // a, b의 대소관계를 파악하여, 작은 수를 start, 큰 수를 end에 대입합니다.
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        // start 부터 end까지 모든 수를 더해줍니다.
        long sum = 0;
        for (int i = start; i <= end; i++) {
            sum += 1;
        }

        // 구한 합을 반환합니다
        return sum;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;


    }


}
