package review01;

import java.util.Scanner;

public class ex_casting01 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է����ּ���");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		char value2=(char)(value-32);
		//��Ÿ�Կ��� ����ȯ�� �ѹ��� ����ϳ�~
		System.out.println("�Է��Ͻ� "+(char)value+"�� "+value2+"���� ����Ǿ����ϴ�");
		//��¹��� ��Ÿ������ ����ȯ �ѹ���! �ϱ� �ڿ� ����2�� �ѹ� ����ȯ �ؼ� ���ص� �Ǵ°� ���� 

System.out.println();

		Scanner sc1=new Scanner(System.in);
		System.out.println("���� 1���� �Է��ϼ���");
		String str=sc.next();//���ڿ��� �޾Ƽ�, ������ int�� ������
		//�̰� ��Ÿ���� ����! �׷��� �Ʒ��� ��Ÿ���� �ٽ� �̾��ذ��� 

		char ch=str.charAt(0);//���� K�� ��ȯ�� ���ڿ�1���� �̾��ذ���
		System.out.println((char) (ch-32));//char�� ����ȯ(ĳ����)




	}//main

}//class
