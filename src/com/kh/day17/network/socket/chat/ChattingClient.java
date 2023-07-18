package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		// 서버에 연결중입니다.
		// 채팅서버에 접속하였습니다.
		// 서버와의 채팅을 시작합니다.
		// 서버(상대) : 하이
		// 클라이언트(나) : 네네
		
		String address = "127.0.0.1";
		int port = 7373;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;  //보조스트림, 기본 데이터 타입 입출력을 도와줌
		DataOutputStream dos = null;  //보조스트림, 기본 데이터 타입 입출력을 도와줌
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("서버에 연결중입니다.");    //서버준비
			Socket socket = new Socket(address, port);
			System.out.println("채팅서버에 접속하였습니다.");  //채팅 준비
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와의 채팅을 시작합니다.");
			
			while(true) {
				
//				=== 2. 데이터 받기 ===  
				String recvMsg = dis.readUTF(); //받은것을 읽음
				System.out.printf("서버(상대) : %s \n", recvMsg);
				
//				=== 3. 데이터 보내기 ===
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();  //공백을 입력받으니까 띄어쓰기도 가능
				dos.writeUTF(sendMsg);  //sendMsg 전송함
				dos.flush();  //버퍼 비우기
				
			}		
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
