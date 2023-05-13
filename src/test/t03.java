package test;

public class t03 {
    public String  solution(int num){
        if(num %2 == 0){
            return "EVEN";
        }else
            return "Odd;";
    }

    public static void main(String[] args) {
        int num = 7;
        String result = new t03().solution(num);
        System.out.println("result" +  result);
    }

}
