package test.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {
	
	
	
	public static void name(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("* 분자(나누어지는 수) 입력:");
		int n1 = s.nextInt();
		System.out.print("분모 입력:");
		int n2 = s.nextInt();
		try {
			System.out.printf("%d ÷ %d = %d\n",n1,n2,n1/n2);
		}catch (ArithmeticException e) {
			System.out.println("!!!정수를 정수로 나눌 때는 분모가 0 이면 안됩니다.");
			System.out.print("받은 분모 :");
			n2 = s.nextInt();
			System.out.printf("%d ÷ %d = %d\n",n1,n2,n1/n2);
		} catch (InputMismatchException e) {
			System.out.println("!!!정수만 입력하세요");
		}
		finally {
			System.out.println("프로그램 종료");
		}
		s.close();
		
	}

}
