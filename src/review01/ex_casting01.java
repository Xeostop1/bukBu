package review01;

import java.util.Scanner;

public class ex_casting01 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		char value2=(char)(value-32);
		//차타입에도 형변환을 한번더 줘야하네~
		System.out.println("입력하신 "+(char)value+"는 "+value2+"으로 변경되었습니다");
		//출력물에 차타입으로 형변환 한번더! 하기 뒤에 벨류2는 한번 형변환 해서 안해도 되는것 같음 

System.out.println();

		Scanner sc1=new Scanner(System.in);
		System.out.println("문자 1개를 입력하세요");
		String str=sc.next();//문자열을 받아서, 위에는 int로 받은것
		//이건 차타입이 없음! 그래서 아래서 차타입을 다시 뽑아준거임 

		char ch=str.charAt(0);//앞이 K를 반환함 문자열1개를 뽑아준거임
		System.out.println((char) (ch-32));//char로 형변환(캐스팅)




	}//main

}//class
