package review01;

public class ex_plus {

	public static void main(String[] args) {
		//닭은 1개의 알을 낳는다. 매일 1개는 낳는다고 가정하면 
		//일주일 동안의 낳는 개수는 몇개일까? 월,화,수,목,금,토,일의 알의 개수를 출력 
		//++연산자를 사용하여 알의 개수 변수를 갱신할 수 있도록 하자

		int egg=1;
		int egg1= egg++;
		int egg2= ++egg1;
		int egg3= ++egg2;//목
		int egg4= ++egg3;
		int egg5= ++egg4;
		int egg6= ++egg5;

		System.out.println("월: "+egg+"개");
		System.out.println("화: "+egg1+"개");
		System.out.println("수: "+egg2+"개");
		System.out.println("목: "+egg3+"개");
		System.out.println("금: "+egg4+"개");
		System.out.println("토: "+egg5+"개");
		System.out.println("일: "+egg6+"개");


		int num=0;

		num++;
		System.out.print("월요일의 알의 개수"+num+" ");
		num++;
		System.out.print("화요일의 알의 개수"+num+" ");
		num++;
		System.out.print("수요일의 알의 개수"+num+" ");
		num++;
		System.out.println("목요일의 알의 개수"+num);
		num++;
		System.out.print("금요일의 알의 개수"+num+" ");
		num++;
		System.out.print("토요일의 알의 개수"+num+" ");
		num++;
		System.out.print("일요일의 알의 개수"+num+" ");

		//반복문으로 고쳐서 사용함! 반복이 되니까
		System.out.println("--------------");


		int i=0;
		for (i = 0; i < 8; i++)//시작 0으로 시작 i는 1개씩 8까지 증가하자, 8까지 작은지 확인
		{
			num++;
			System.out.println("알의 개수"+num);



		}//for


	}//main

}//class
