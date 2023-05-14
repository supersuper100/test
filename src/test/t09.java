package test;

public class t09 {
    boolean solution(String s){
        // 문자열 s를 소문자로 변경하여 p와 y의 개수를 세기 쉽게 합니다.
        s = s.toLowerCase();
        // p와 y의 개수를 담을 변수를 초기화합니다.
        int pCount = 0;
        int yCount = 0;
        // 문자열 s를 한 글자씩 순회하면서 p와 y의 개수를 세어줍니다
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p'){
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }
        // 'p'와 'y'의 개수가 같으면 true, 다르면 false를 반환합니다
        return pCount == yCount;
    }

    public static void main(String[] args) {
        t09 sol = new t09();
        System.out.println(sol.solution("pPoooyY")); // true
        System.out.println(sol.solution("Pyy")); // false
    }
}
