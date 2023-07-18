package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {

	public static void main(String[] args) {
		// 서버와 연결되었습니다.
		// 계산식(빈칸으로 띄어 입력, 예 24 + 42)  >> 23
		// 잘못 입력하셨습니다. 형식에 맞게 입력해주세요.
		// 계산식(빈카으로 띄어 입력, 예 24 + 42)  >> 24 + 42
		// 계산결과 : 66
		// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> exit

		String address = "127.0.0.1";
		int port = 7373;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		
		try {
			Socket socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.");
			
			System.out.println("계산식(빈칸으로 띄어 입력, 예 24 + 42)  >> 23");
			
//			=== 1.데이터 보내기 ===
			
			//입력값 보낼 준비단계
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			//결과값 받을 준비단계
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			
			for(;;) {
				
				System.out.print("입력 : ");
				String sendCalc = sc.nextLine();
				
				//입력받은 데이터 보내는 단계
				dos.writeUTF(sendCalc);  //dos가 null인 상태 -> os추가해주기. : Null pointer access: The variable dos can only be null at this location 
				if(sendCalc.equalsIgnoreCase("exit")) {
					System.out.println("종료하였습니다.");
					break;
				}
				dos.flush();
				
//				=== 4.데이터(결과값) 받기 ===
				String recvresult = dis.readUTF();
				if(recvresult.equalsIgnoreCase("end")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
					continue;
				}
				
				System.out.printf("계산 결과 : %s \n", recvresult);
				
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
