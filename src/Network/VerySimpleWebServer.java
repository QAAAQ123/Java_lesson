package Network;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
public class VerySimpleWebServer {
    public static void main(String args[]) throws Exception{
        ServerSocket ss = new ServerSocket(9090);
        
        //소켓은 클라이언트와 통신할수 있는 객체다.
        Socket socket = ss.accept();
        //클라이언트와 읽고 쓸수 있는 input,outputstream이 나온다.
        //GET / HTTP/1.1 GET /board/hello.html HTTP/1.1 ->get방식으로 페이지 요청
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        /*byte[] buffer = new byte[512];
        int readCount = 0;

        while((readCount = in.read(buffer)) != -1){
            System.out.write(buffer,0,readCount);
        }
        
        //클라이언트를 대기
        //클라이언트가 접속하는 순간,클라이언트와 통신할수 있는 socket을 반환
        System.out.println("클라이언트 접속을 기다립니다.");
        System.out.println(socket);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();
        List<String> headers = new ArrayList<>();
        String line = null;
        //빈줄을 만나면 while문 끝내기
        while((line = br.readLine()).equals("")){
            headers.add(line);
        }
        //요청정보 읽기 끝
        System.out.println(firstLine);
        for(int i = 0; i < headers.size(); i++){
            System.out.println(headers.get(i));
        }

        pw.println("HTTP/1.1 200 OK");
        pw.println("name: kim");
        pw.println("email: urstory@gmail.com");
        pw.println();
        pw.println("<html>");
        pw.println("<h1>Hello!!!</h1>");
        pw.println("</html>");
        pw.close();
        //서버에게 응답 메세지 보내기
        ss.close();
        System.out.println("서버가 종료됩니다.");


    }
}
