package test;

public class t01 {
    public int solution(int num1, int num2) {
        int result = num1 * num2; // num1과 num2를 곱한 값을 result 변수에 저장합니다.
        return result; // 결과값을 반환합니다.
    }

    public static void main(String[] args) {
        int num1 = 5; // 예시로 num1에 5를 할당합니다.
        int num2 = 3; // 예시로 num2에 3을 할당합니다.
        int result = new t01().solution(num1, num2); // solution 함수를 호출하고 결과값을 result 변수에 저장합니다.
        System.out.println("The result is " + result); // 결과값을 출력합니다.
    }

}
