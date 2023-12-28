package edu.kh.op.practice;

import java.util.Scanner;

public class OpPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : " );
		int input = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / input );
		System.out.println("남은 사탕 개수 : " + candy % input );
		
		/*sc.nextLine();
		
		System.out.printf("1인당 사탕 개수 : %d\n",candy / input  );
		System.out.printf("남은 사탕 개수 : %d", candy % input );
		*/
		
	}
	
	public void practice2() {
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc2.nextLine();
		
		System.out.print("학년(정수) : ");
		int grader = sc2.nextInt();
		
		System.out.print("반(정수) : ");
		int group = sc2.nextInt();
		
		System.out.print("번호(정수) : ");
		int num = sc2.nextInt();
		
		sc2.nextLine();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc2.nextLine();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double record = sc2.nextDouble();
		
		System.out.println();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.", grader, group, num, name, gender, record);
	}
	
	public void practice3() {
		
		// 정수를 하나 입력 받아 짝수/홀수를 구분하세요.
		// (0은 짝수로 취급합니다.)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		System.out.println((sc.nextInt() %2 == 0 ? "짝수" : "홀수") + " 입니다.");
		// 					(		조건식 	 )	? 식1(true) : 식2(false)
		
	}
	
	public void practice4 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math; // 합계
		double avg = sum / 3.0; // 평균
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		boolean result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);
		
		System.out.println(result ? "합격" : "불합격");
							// 조건식 ? 식1 : 식2 
		
		
		
		
			
		
		
		
		
		
		
		
		
	}

	
}
