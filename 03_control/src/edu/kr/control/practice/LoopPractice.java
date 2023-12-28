package edu.kr.control.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요. : ");
		int input = sc.nextInt();
		
		if(input<0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
			
		}
		
		
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i = 1; i < (input + i); i++) {
				System.out.print(input + " ");
				input -= 1;
			}
		}
		
		
		
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int i = 0;
		
		int sum = 0;
		
		for( i = 1; i < input; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.print(i);
		System.out.println(" = " + (i + sum));
				
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 :");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 :");
		int num2 = sc.nextInt();
		
		int mid1 = num2 - num1 + 1; // num2가 더 클 경우 
		int mid2 = num1 - num2 + 1; // num1이 더 클 경우
		
		if(num1<1||num2<1) { // 1 미만 숫자를 입력했을 경우
			
			System.out.println("1 이상의 숫자를 입력해주세요");
			
		}else if(num1<num2) { // 두 번째 숫자가 더 클 경우
			
			for(int i = 1; i <= mid1 ; i++) {
				System.out.print(num1 + " ");
				num1++;
			}
		}else if(num2<num1) { // 첫 번째 숫자가 더 클 경우
			
			for(int x = 1; x <= mid2 ; x++) {
				System.out.print(num2 + " ");
				num2++;
			}
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
	
	
		System.out.println("==== "+dan+"단 ====");
		for(int x = 1; x<=9; x++) {
			System.out.printf("%d X %d = %d\n",dan,x,dan*x);
		}
		System.out.println();
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan<2||dan>9) {
			System.out.println("2 ~ 9 사이 숫자만 입력해주세요.");
		}else {
			for(int i = dan; i<=9; i++) {
				System.out.println("===== "+i+" 단=====");
				for(int x = 1; x<=9; x++) {
					System.out.printf("%d X %d = %d\n", i, x , i * x);
				}
				System.out.println();
			}
			
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input ; i++) { // 반복 줄
			
			for(int x = 1; x <= i ; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

	public void practice8() { //* 별 거꾸로
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input; i >=1; i --) {
			
			for(int x = i; x >= 1; x --) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}
	
	public void practice9() { // 우정렬 삼각
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			// 1) for문 하나 더 작성
			// * 1개 출력 전에 띄어쓰기 3번
			// * 2개 출력 전에 띄어쓰기 2번
			// * 3개 출력 전에 띄어쓰기 1번
			// * 4개 출력 전에 띄어쓰기 0번
			
			/*
			for(a = x ; a <= input - 1  ; a++) {
				System.out.print(" ");
				
			}for(b = 1 ; b <= x ; b++) {
				System.out.print("*");
			}
			
			System.out.println();
			*/
//			==========================================
			
			//2) for + if else
			
			for(int i =1; 1 <= input; i++) {
				
				if(i <= input - x) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			
			
			
		}
		
	}
	public void practice10() { // 좌 삼각
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		//윗쪽 삼각형
		for(int a = 1; a <= input; a++) {
			
			for(int b = 1; b <= a; b++) {
					System.out.print("*");
			}
			System.out.println();
		}
		//아래쪽 삼각형	
		for(int c = 1; c <= input-1; c++) {
			
			for(int d = input - 1 ; d >= c ; d--){
					System.out.print("*");
			
			}	
			System.out.println();
		}
		
			
		
	}
	
	public void practice11() { // 피라미드
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			
			for(int x = i ; x <= input - 1  ; x++) { // -> (int x = input -i; x >= 1; x--)
				System.out.print(" ");
				
			}for(int y = 1 ; y <= i*2-1 ; y++) { 
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
		
	
	public void practice12() { // 정사각형 (가운데 빔)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// row : 행(줄)
		// col(column): 열(칸)
		
		
		for(int row = 1; row <= input; row++) {
			
			if(row==1||row==input) { 
				
				for(int col = 1; col <= input ;col++) {
					System.out.print("*");
				}
				
			}else {
				for(int col =1; col <= input; col++) {
					
					if(col==1||col==input) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				
			}
			
			System.out.println();
		
		}
		System.out.println("=====================");
		
		for(int row2 = 1; row2<= input; row2++) {
			
			for(int col2 = 1; col2<= input; col2++) {
				// row 또는 col이 1 또는 input인 경우 * 출력
				// == 테두리
				
				if(row2==1||col2==1||row2==input||col2==input) {
					System.out.print("*");
					
				}else { // 내부
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
			
			
			
		
		
	}
	
	
	public void practice13() {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= input; i ++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		
		for(int i = 1; i <= input; i++) {
			if(i%2==0 && i%3==0) {
				count ++;
			}
		}
		
		System.out.println("count : " + count);
		
		
	}
	
}
