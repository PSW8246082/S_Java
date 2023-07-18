package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalculatorServer {

	public static void main(String[] args) {
		// 서버 구동중입니다.
		// 클라이언트의 연결을 기다리고 있습니다.
		// 클라이언트와 연결되었습니다.
		// 받은 메세지 : 23
		// 받은 메세지 : 24 + 42
		// 클라이언트가 종료하였습니다.
		
		ServerSocket serverSocket = null;
		int port = 7373;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
				
		
		try {
//			System.out.println(".");
//			Thread.sleep(1000);  //지연되게 해주는것
//			System.out.println(".");
//			Thread.sleep(1000);  //지연되게 해주는것
//			System.out.println(".");
//			Thread.sleep(1000);  //지연되게 해주는것
			
			System.out.println("서버 구동중입니다.");
			for(int i = 1; i <= 50; i++) {
				System.out.print("=");
				Thread.sleep(10);  //지연되게 해주는것, 로딩중st
			}
			System.out.println("100%");
			System.out.println();
			
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			
//			=== 2.데이터 받기 ===
			
			//입력값 받을 준비단계
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			//결과값 보낼 준비단계
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			while(true) {
				
				//전송받은 데이터 받는 단계
				String recvCalc = dis.readUTF();
				if(recvCalc.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				System.out.printf("받은 메세지 : %s \n", recvCalc);	
				
			
				// ==== 계산기 만들기 ====
				
				// 24 + 42   ->  24 / + / 42
				//띄어쓰기 기준으로 받은 메세지를 나눈다.
				
				String [] calcArrs = recvCalc.split(" ");
				
				if(calcArrs.length != 3) {
					String errMsg = "end";
					dos.writeUTF(errMsg);
					continue;  //다시 while문으로 되돌아감.
				}
				
				int num1 = Integer.parseInt(calcArrs[0]);
				int num2 = Integer.parseInt(calcArrs[2]);
				String operator = calcArrs[1];
				
				String result = "";
				switch(operator) {
				case "+" : 
					result = String.valueOf(num1 + num2);
					break;
				case "-" : 
					result = num1 - num2 + "";  //문자열을 만나면 결과값이 문자열이 됨. 
					break;
				case "*" : 
					result = num1 * num2 + "";  //String.valueOf(num1 + num2); 보다 간단한 방법
					break;
				case "/" :
					result = num1 / num2 + "";
					break;
				case "%" : 
					result = num1 % num2 + "";
					break;
				}
				
//				=== 3.데이터(결과값) 보내기 ===
				//결과 보내기.
				dos.writeUTF(result);
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
