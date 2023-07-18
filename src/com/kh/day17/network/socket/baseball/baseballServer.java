package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class baseballServer {

	public static void main(String[] args) {
//		서버소켓을 생성하였습니다.
//		2023-07-18 12:04:56:15
//		클라이언트의 접속을 기다립니다.
//		클라이언트가 접속했습니다.
//		서버 숫자 -> 7 3 8
//		서버 준비 완료
//		받기 : 4 2 1
//		0스트라이크 0볼
//		받기 : 7 3 8
//		3스트라이크 0볼
//		아웃! 게임종료
		
		ServerSocket serverSocket = null;
		int port = 8054;
		Socket socket = null;
		InputStream is = null;
		DataInputStream dis =  null;
		
		try {
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 접속을 기다립니다.");
			socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			String recvServer = dis.readUTF();
			System.out.printf("서버숫자 -> " + recvServer);
			System.out.println("서버 준비 완료");
			
//			=== 2. 데이터 받기 ===
			String recvNum = dis.readUTF();
			System.out.printf("받기 : " + recvNum);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
