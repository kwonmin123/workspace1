package bankbank;

import java.util.Scanner;

public class BankApp {
	private static Account[] arr =new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.계좌생성 |2.계좌목록 |3.예   금 |4.출    금 |5.종    료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			int selectNo =scan.nextInt();
		
			
			
			if(selectNo ==1) {
				creatAccount();
			}else if (selectNo==2) {
				accountList();
			}else if (selectNo==3) {
				deposit();
			}else if (selectNo==4) {
				withdraw();
			}else if (selectNo==5) {
				run= false;
				
			}
		}
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("----------------\n예금을 찾습니다\n--------------------");
		System.out.print("계좌번호를 입력하세요>");
		String sano=scan.next();
		System.out.print("찾을금액 입력하세요>");
		int sbal=scan.nextInt();
		
		if(findAccount(sano)!=null) {
			findAccount(sano).setBalance(findAccount(sano).getBalance()-sbal);
			System.out.println("결과 : 예금을 성공적으로 찾았습니다");
		} else System.out.println("결과 : 찾을수없는 계좌입니다");
	}

	private static Account findAccount(String ano) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(ano.equals(arr[i].getAno())) {
					return arr[i];
			}
		}
				
		return null;
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("----------------\n예금을 입금합니다\n--------------------");
				System.out.print("계좌번호를 입력하세요>");
				String sano=scan.next();
				System.out.print("넣을금액 입력하세요>");
				int sbal=scan.nextInt();
				
				if(findAccount(sano)!=null) {
					findAccount(sano).setBalance(findAccount(sano).getBalance()+sbal);
					System.out.println("결과 : 예금이 성공적으로 되었습니다");
				} else System.out.println("결과 : 찾을수없는 계좌입니다");
	}

	private static void accountList() {
		// TODO Auto-generated method stub
		System.out.println("---------------------\n계좌목록\n--------------------");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {System.out.printf("%s     %s     %d\n",arr[i].getAno(),arr[i].getOwner(),arr[i].getBalance());
			}
		}
	}

	private static void creatAccount() {
		// 계좌생성
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) {
				System.out.print("----------------------\n계좌생성합니다\n----------------------\n");
				System.out.print("계좌번호 입력>");
				String a=scan.next();
					if(a.equals(arr[0])) {
						System.out.println("중복된 계좌번호입니다");
					}
				
				System.out.print("계좌 주 입력>");
				String b=scan.next();
				System.out.print("초기금액 입력>");
				int c=scan.nextInt();
				
				
				arr[i]=new Account(a,b,c);
				break;
			}
		}
	}

}
