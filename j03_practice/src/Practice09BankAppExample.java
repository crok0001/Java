import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Practice09BankAppExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// while 문 종료 flag, true = 계속 실행, false = 종료1
		boolean isRun = true;
		// 사용자의 예금응 저장할 변수
		int money = 0;
		while(isRun) {	// isRun 이 true  면 반복, false면 탈출
			System.out.println("=========================");
			System.out.println("1.예금|2.출금|3.잔액확인|4.종료");
			System.out.println("=========================");
			System.out.println("번호를 입력해주세요(1~4) >");
			// 메뉴 선택 번호 저장
			int selectNO = sc.nextInt();
			System.out.println("선택하신 메뉴 번호는 : " + selectNO);
			
			/*
			 	1. 예금 - 입금할 금액을 입력받아 money 변수에 누적 저장
			 	2. 출금 - 츨금할 금액을 입력받아 money 변수에 저장된 값을 감소
			 			 단, 출금 금액을 예금된 금액을 초과할 수 없음.
			 	3.잔액 - money  변수(예금액)을 저장된 값을 출력
			 	4.종료 - 프로그램 종료 - while문을 종료 시켜 main 종료 
			*/
			
			// switch문 처리
			switch(selectNO) {
				case 1 :
					System.out.println("입금");
					System.out.println("입금하실 금액을 입력 하세요");
					money = sc.nextInt();
					break;
				case 2 :
					System.out.println("출금");
					System.out.println("출금하실 금액을 입력해 주세요");
					int demoney = sc.nextInt();
					if(money >= demoney) {
						System.out.println(demoney+"원 출급되었습니다");
						money = money - demoney;
					}else {
						System.out.println("출금 금액이 예금된 금액보다 클 수 없습니다.");
					}
					break;
				case 3 :
					System.out.println("잔액확인");
					System.out.println("잔액 : "+money+"원");
					break;
				case 4 :
					System.out.println("종료합니다");
					isRun = false;
					break;
				default :
					System.out.println("선택할 수 없는 메뉴 번호");
			}
			
			/*
			if(selectNO == 1) {
				// 1.예금
				System.out.println("입금");
				System.out.println("입금하실 금액을 입력 하세요");
				int deposit = sc.nextInt();
				money = money + deposit;
				System.out.println(deposit+"원이 입금되었습니다.");
			}else if(selectNO == 2){
				// 2. 출금
				System.out.println("출금");
				System.out.println("출금하실 금액을 입력해 주세요");
				int minus = sc.nextInt();
				// 출금할 수 있는 금액 인지 확인
				if(money < minus) {
					System.out.println("출금 금액이 예금된 금액보다 클 수 없습니다.");
					continue;
				}
				System.out.println(minus+"원 출급되었습니다");
				money = money - minus;
			}else if(selectNO == 3){
				// 3. 잔액확인
				System.out.println("잔액확인");
				System.out.println("잔액 : "+money+"원");
			}else if(selectNO == 4){
				// 4. 종료
				isRun = false;
			}
			*/

		} //end while
	} // end Main
} // end class
