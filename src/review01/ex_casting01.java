package review01;

import java.util.Scanner;

public class ex_casting01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		char value2=(char)(value-32);
		//차타입에도 형변환을 한번더 줘야하네~
		System.out.println("입력하신 "+(char)value+"는 "+value2+"으로 변경되었습니다");
		//출력물에 차타입으로 형변환 한번더! 하기 뒤에 벨류2는 한번 형변환 해서 안해도 되는것 같음 


	}//main

}//class
