package Algorithm;

import java.util.Scanner;
/*
문장 중 가장 긴 단어 출력하기
 */
class Exam3 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m){

                m=len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Exam3 T = new Exam3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}