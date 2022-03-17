package review01;

public class ex03 {

	public static void main(String[] args) {
		int num1=7, num2=7;
		int result1, result2;
		result1=--num1+4;
		result2=num2-- +4;

		System.out.println("전위 감소 /연산자: "+result1+" /변수: "+num1);
		System.out.println("후위 감소 /연산자: "+result2+" /변수: "+num2);
	}

}
