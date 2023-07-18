package com.kh.day17.network.socket.baseball;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class baseballClient {

	public static void main(String[] args) {
//		클라이언트 소켓을 생성하였습니다.
//		/127.0.0.1
//		게임 준비 완료
//		--> 4 2 1
//		0스트라이크 0볼
//		--> 7 3 8
//		3스트라이크 0볼
//		축하합니다. 아웃입니다!
		
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8054;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
//			=== 1. 데이터 보내기 ===
			
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			socket = new Socket(address, port);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			
			System.out.println(address);
			System.out.println("게임 준비 완료");
			System.out.print("--> ");
			String sendNum = sc.nextLine();
			
			dos.writeUTF(sendNum);
			dos.flush();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
