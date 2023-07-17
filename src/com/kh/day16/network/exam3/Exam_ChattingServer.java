package com.kh.day16.network.exam3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Exam_ChattingServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
	
		
		try {
			
			serverSocket = new ServerSocket(2233);
			System.out.println("서버 소켓 성생");
			System.out.println("클라이언트 접속 대기");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트 접속 완료");
			
//			=================== 2. 데이터 받기 =====================
			
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0, readByteNo);
			System.out.printf("클라이언트(상대) : %s\n"
					, message);
			
//			================ 데이터 받기 완료 ====================

//			=================== 3. 데이터 보내기 ======================
			
			os = socket.getOutputStream();
			System.out.print("서버(나) : ");
			message = sc.nextLine();
			bytes = message.getBytes();  //bytes 는 위에 선언되어 있기 때문에 재할당 안해도 됨.
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 성공");
			
//			================ 데이터 보내기 완료 ====================	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
