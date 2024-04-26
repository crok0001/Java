package loop_statement;

import java.util.Scanner;

/**
 * while, do_while
 * 반복횟수가 정해져 있지 않을 때 자주 사용 
*/
public class WhileExample {

	public static void main(String[] args) {
		// 0 ~ 100까지의 정수를 사용자에게 원하는  개수만큼 입력받아서
		// 평균(average) 을 구하시오.
		// ctrl + shift + o

		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		// 점수를 입력받은 횟수를
		int count = 0;
		
		System.out.println("0 ~ 100까지의 정수를 원하는 개수만큼 입력하세요.");
		System.out.println("-1 입렵 완료");
		while(true) {
			int number = scanner.nextInt();
			// 사용자가 입력한 정수 값이 -1이면 while loop 탈출/종료
			if(number == -1) {
				break; // 반복문 즉시 종료
			}
			// total 변수에 사용자가 입련한 점수릃 누적해서 합산
			total = total + number;
			count++;
		}
		
		// 입력된 숫자들의 편균
		// 연산 결과가 double type의 실수를 표현할 수 있도록
		// count 변수를 double type으로 변경 후 연산
		double average = total / (double)count;
		System.out.printf("입력개수 %d 총합 : %d 평균: %.2f 입니다.", count, total, average);
		
		// while(true){} 탈출 조건이 없는 무한 루프
		System.out.println("Main 종료");
	}
}
