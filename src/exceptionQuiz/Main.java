package exceptionQuiz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scanner =new Scanner(System.in);
		while(true) {
			int n1=0;
			int n2=0;
			System.out.println("첫번째 수 입력:");
			String str1 = scanner.next();

			try {
				
				n1= Integer.parseInt(str1);
			} catch (Exception e) {
				System.out.println("첫번째수를 다시 입력하세요");
				continue;
			}
			
			
			
			System.out.println("두번째 수 입력:");
			String str2 = scanner.next();
			try {
				n2= Integer.parseInt(str2);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("두번째수를 다시 입력하세요");
				continue;

			}
			
			System.out.println("합은 : "+(n1+n2));
			break;
		}
		scanner.close();
	}

}
