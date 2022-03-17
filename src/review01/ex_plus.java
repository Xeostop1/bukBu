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
		
		

	}

}
