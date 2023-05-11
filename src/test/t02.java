package test;

public class t02{
    public int solution(int age) {
        int birthYear = 2022 - age; // 출생 연도를 계산합니다.
        return birthYear; // 출생 연도를 반환합니다.
    }
    public static void main(String[] args) {
        int age = 40; // 예시로 나이에 40을 할당합니다.
        int birthYear = new t02().solution(age); // solution 함수를 호출하고 출생 연도를 반환합니다.
        System.out.println("The birth year is " + birthYear); // 출생 연도를 출력합니다.
    }

}
