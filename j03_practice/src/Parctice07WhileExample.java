import java.util.Scanner;

public class Parctice07WhileExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("점수를 입력해 주세요.");
			int score = sc.nextInt();
			char grade = 'F';
			if(score <= 100 && score >= 90) {
				grade = 'A';
			}else if(score <= 89 && score >= 80) {
				grade = 'B';
			}else if(score <= 79 && score >= 70) {
				grade = 'C';
			}else if(score <= 69 && score >= 60) {
				grade = 'D';
			}else if(score <= 59 && score >= 0) {
				grade = 'F';
			}else {
				// 100 ~ 0 까지의 정수가 아닐 경우
				break; // 가장가까운 반목문을 즉시 탈출=
			}
			System.out.printf("%c학점입니다. \n", grade);
		}
	} // end main
} // end class
