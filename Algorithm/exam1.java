package Algorithm;

import java.util.Scanner;
/**
 문자열에서 특정 문자 개수 찾기
 **/
class Exam1 {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
//        for(int i = 0; i<str.length(); i++){
//            if(str.charAt(i) == t) answer++;} //1번 방식
        for (char x: str.toCharArray()) {
            if(x == t) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Exam1 T = new Exam1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str,c));
    }
}