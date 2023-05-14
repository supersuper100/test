package test;

import java.util.Arrays;

public class t05 {
    public double solution(int[] arr){

        return Arrays.stream(arr).average().getAsDouble();
    }
}
