package edu.kr.control.condition;

import java.util.Scanner;

public class ConditionExample {

	public void ex1() {
		
		//if문
		//- 조건식이 true 일때만 내부 코드 수행
		
		/* [작성법]
		 * if(조건식) {
		 * 		조건식이 true일 때 수행할 코드
		 * }
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사
		if(input > 0) {
			System.out.println("양수 입니다.");
		}
		
		if(input <=0) {
			System.out.println("양수가 아닙니다.");
		}
		
	}
	
	public void ex2() {
		
		// if -else 문
		// - 조건식 결과가 true이면 if문,
		//   false이면 else 구문이 수행됨
		
		/*[작성법]
		 * if(조건식){
		 *  	조건식이 true일 떄 수행할 코드
		 *  } else {
		 *  	조건식이 false일 때 수행할 코드
		 *  }
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		// 홀짝 검사
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if (input % 2 !=0) {
			System.out.println("홀수 입니다.");
		}else { //짝수 또는 0 입력 시 수행
			
			// ** 중첩 if문 **
			if(input== 0) {
				System.out.println("0 입니다.");
			}else {
				System.out.println("짝수 입니다.");
			}
		}
	}
	
	public void ex3() {

		//if - else if - else
		
		//양수 , 음수 , 0 판별
		
		Scanner sc = new Scanner(System.in);
		int input= sc.nextInt();
		
		if(input > 0) { // input이 양수일 경우
			System.out.println("양수 입니다.");
		} else if(input < 0) { // input이 음수일 경우
			//바로 위에 있는 if문이 만족되지 않은 경우 수행
			System.out.println("음수 입니다.");
		} else {
			//모든 if, else if가 만족되지 않은 경우 수행
			System.out.println("0 입니다.");
		}
		
	}
	
	public void ex4() {
		// 달(month)을 입력 받아 해당 달에 맞는 계절 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		if(month>=3&&month<=5) { // 봄 : 3,4,5
			season = "봄";
			
		} else if(month>=6&&month<=8) { // 여름 : 6,7,8
			season = "여름";
			
		} else if(month>=9&&month<=11) { // 가을 : 9,10,11
			season = "가을";
			
		} else if(month == 12 ||month == 1|| month == 2) { // 겨울 : 12,1,2
			season = "겨울";
			
		} else { //if,else if가 모두 false인 경우
			season = "해당하는 계절이 없습니다.";
			
		}
		System.out.println(season);
		
	}
	
	public void ex5() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : "); // 나이를 입력 받아
		int age = sc.nextInt();
		
		String name;
		
		if(age<=13) {                       // 13세 이하면 "어린이 입니다."
			name = "어린이";
			
		}else if(age>13&&age<=19) {         // 13세 초과 19세 이하면 : "청소년 입니다."
			name = "청소년";
			
		}else {                             // 이 외 조건일 경우 (19세 초과 시) "성인 입니다." 
			name = "성인";
			
		}		
		System.out.printf("%d세는 %s 입니다.\n", age, name); // 출력
		
	}
	
	public void ex6() {
		//점수(100점 만점)를 입력 받아
		//90점 이상 : A
		//80점 이상 90점 미만 : B
		//70점 이상 80점 미만 : C
		//60점 이상 70점 미만 : D
		//60점 미만 : F
		//0점 미만, 100 초과 : "잘못 입력 하셨습니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(100>score&&score>=90) {
			System.out.println("A");
			
		}else if(score>=80&&score<90) {
			System.out.println("B");
			
		}else if(70<=score&&score<80) {
			System.out.println("C");
			
		}else if(60<=score&&score<70) {
			System.out.println("D");
			
		}else if(60>score) {
			System.out.println("F");
			
		}else {
			System.out.println("잘못 입력 하셨습니다.");
			
		}
		
		
	}
	
	public void ex7() {
		// 놀이기구 탑승 제한 검사
		
		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 " 탑승 가능"
		// 나이가 12세 미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 :");
		int age = sc.nextInt();
		
		//System.out.print("키를 입력해주세요 :");
		//double hi = sc.nextDouble();
	
		String result;
		
		if( age <0 || age >100) {
			result ="잘못 입력 하셨습니다.";
			
		}else {
			System.out.print("키 입력 :");
			double hi = sc.nextDouble();
			
			if(age <12) {
				result ="적정 연령이 아닙니다.";
			}else if(hi<140.0) {
				result ="적정 키가 아닙니다.";
				
			}else {
				result ="탑승 가능";
			}
		}
		
		
		/*
		 * 
		 * if (age<0 || age>100) { result = "잘못 입력 하셨습니다.";
		 * 
		 * }else if(age<12) { result = "적정 연령이 아닙니다.";
		 * 
		 * }else if(hi<140.0) { result = "적정 키가 아닙니다.";
		 * 
		 * }else { result = "탑승 가능.";
		 */
		
		/*if(age < 0 || age >100) {
			result ="잘못 입력 하셨습니다.";
		 }else {
			 if(age<12) {
				 result = "적정 연령이 아닙니다.";
			 }else {
				 if(hi<140.0) {
					 result = "적정 키가 아닙니다.";
				 }else {
					 result = "탑승 가능";
				 }
			 }
		 }
		 */
		System.out.println(result);
		 		
		
	}
	
	public void ex8() {
		//놀이기구 탑승 제한 검사 프로그램
		//조건 - 나이 : 12세 이상
		//    - 키 : 140.0cm 이상
		
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0 ~ 250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		
		// 나이 0, 키 X : "나이는 적절하나, 키가 적절치 않음"
		// 나이 x, 키 0 : "키는 적절하나, 나이가 적절치 않음"
		// 나이 x, 키 x : "나이와 키 모두 적절치 않음"
		// 나이 o, 키 o : "탑승 가능"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if (age<0||age>100) {
			result = "나이를 잘못 입력 하셨습니다.";
			
		}else {
			System.out.print("키 입력 :");
			double hi = sc.nextDouble();
			
			if (hi<0 || hi>250.0) {
				result = "키를 잘못 입력하셨습니다.";
			}else {
				if(age >=12 && hi< 140.0) {
					result = "나이는 적절하나, 키가 적절치 않음";
					
				}else if (age < 12 && hi >= 140.0) {
					result ="키는 적절하나, 나이가 적절치 않음";
					
				}else if (age <12 && hi < 140.0) {
					result ="나이와 키 모두 적절치 않음";
					
				}else {
					result ="탑승 가능";
					
				}
			}
			
			 /*else if(age<12 && hi<140.0){
				result = "나이와 키 모두 적절치 않음";
				
				}else if(age>=12 && hi<140.0) {
					result = "나이는 적절하나 키가 적절하지 않음";
					
				}else if(age<12 && hi>=140.0) {
					result = "키는 적절하나 나이가 적절하지 않음";
					
				}else {
					result = "탑승 가능";
					
			}
			*/
		}
		System.out.println(result);
		
	}
	
	
	
}
	
