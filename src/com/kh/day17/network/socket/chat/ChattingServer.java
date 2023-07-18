package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {
	
	//서버 먼저 시작(기다리고 있어야함)

	public static void main(String[] args) {
		// 채팅서버를 구동 중입니다...
		// 채팅서버를 구동하였습니다..
		// 클라이언트의 접속을 기다리고 있습니다.
		// 클라이언트가 접속하였습니다.
		// 채팅이 시작되었습니다.
		// 서버(나) : 하이
		// 클라이언트(상대) : 네네
		
		ServerSocket serverSocket = null;
		int port = 7373;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;  //보조스트림, 기본 데이터 타입 입출력을 도와줌
		DataOutputStream dos = null;  //보조스트림, 기본 데이터 타입 입출력을 도와줌
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("채팅서버를 구동 중입니다..."); //서버 준비 
			serverSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다..");
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속하였습니다.");  //채팅 준비
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("채팅이 시작되었습니다.");
			
			while(true) {
				
//				=== 1. 데이터 보내기 ===
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();  //공백을 입력받으니까 띄어쓰기도 가능
				dos.writeUTF(sendMsg);  //sendMsg 전송함
				dos.flush();  //버퍼 비우기
				
//				=== 4. 데이터 받기 ===  
				String recvMsg = dis.readUTF(); //받은것을 읽음
				System.out.printf("클라이언트(상대) : %s \n", recvMsg);
				
			}		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
