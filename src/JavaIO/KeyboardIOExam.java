package JavaIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String args[]) throws Exception{
        //키보드로 한줄씩 입력받고,한줄씩 출력
        //키보드: System.in
        //화면 출력: System.out
        //키보드로 입력받는것은 문자열 입력: char
        //한줄 읽기: BufferedReader의 readLine
        //한줄 쓰기: PrintStream,PrintWriter

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line); 
        }
    }
}
