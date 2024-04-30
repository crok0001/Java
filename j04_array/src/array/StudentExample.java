package array;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		System.out.println("Main START");
		
		Scanner sc = new Scanner(System.in);
		
		// 프로그램 종료 flag
		boolean isRun = true;
		// 학생들의 점수를 저장할 배열(공간)
		int[] scores = null;
		while(isRun) {
			System.out.println("=====================================");
			System.out.println("1.학생수|2.점수입력|3.전체점수|4.분석|5.종료");
			System.out.println("=====================================");
			System.out.println("선택하실 기능의 번호를 입력하세요 > ");
			int selectNO = sc.nextInt();
			System.out.println("선택하신 번호는 " + selectNO+ "번 입니다.");
			
			if(selectNO != 1 && selectNO != 5 && scores == null) {
				System.out.println("학생수를 먼저 입력해주세요.");
				continue;
			}
			switch(selectNO) {
				case 1 :
					System.out.println("학생 수를 입력해 주세요 > ");
					int num = sc.nextInt();
					scores = new int[num];
					System.out.println("등록된 학생 수는 : " +num+ "명입니다.");
					break;
				case 2 : 
						System.out.println(scores.length+ "명의 점수를 입력해주세요.");
						for(int i = 0; i < scores.length; i++) {
							scores[i] = sc.nextInt();
							System.out.println((scores.length - (i+1))+"명 남았습니다.");
						}
						System.out.println("점수 입력 완료");
						break;
				case 3 :
					for(int i = 0; i < scores.length; i++) {
						System.out.println(scores[i]+"점");
					}
					break;
				case 4 :
					int sum = 0;
					double avg = 0;
					int max = scores[0];
					int min = scores[0];
					for(int i = 0; i < scores.length; i++) {
						sum += scores[i];
					}
					avg = (double)sum / scores.length;
					for(int i = 1; i < scores.length; i++) {
						if(scores[i] > max) {
							max = scores[i];
						}
					}
					for(int i = 1; i < scores.length; i++) {
						if(scores[i] < min) {
							min = scores[i];
						}
					}
					System.out.println("총점은 : " +sum);
					System.out.println("평균 점수는 : " +avg);
					System.out.println("최고점수는 : " +max);
					System.out.println("최저점수느 : " +min);
					break;
				case 5 :
					isRun = false;
					break;
				default :
					System.out.println("없는 메누입니다.");
			}
		} // end while
		/*
		 	1. 학생수
		 		점수를 입력할 학생수를 입력 받음.
		 		입력받은 학생수(정수값) 만큼 배열을 생성하여 scores에 저장
		 	2. 1번에서 생성된 학생 수 만큼(배열의 크기 만큼) 학생의 점수를 입력받아
		 	   scores배열의 각 항목에 저장 (0 ~ scores.length -1)
		 	3. scores 배열에 저장된 각 학생의 점수(배열 항목)를 출력
		 	4. 분석 - scores 배열에 저장된 학생의 점수를 계산하여
		 			전체 총점, 평균 점수, 최고점수, 최저점수를 출력
		 	5. while문을 종료하여 프로그램 종료
		 */
		System.out.println("Main End");
	} // end main
}// end class
