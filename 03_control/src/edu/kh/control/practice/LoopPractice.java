package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if(input >= 1) {
			for(int i = 1; i <= input; i++){
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice2(){

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if(input >= 1) {
			for(int i = input; i > 0; i--){
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}

	}

	public void practice3(){
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

		// ex) 정수를 하나 입력하세요 : 8
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();

		int sum = 0;

		for(int i = 1; i <= input; i++) {
			sum += i; 
			System.out.print(i);

			if(i < input) {
				System.out.print(" + ");

			} else {
				System.out.print(" = ");
				System.out.print(sum);
			}
		}
	}



	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		int max = 0;
		int min = 0;

		if((num1 < 1) || (num2 < 1)) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if(num1 > num2){
			max = num1;
			min = num2;
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		}else if(num2 > num1) {
			max = num2;
			min = num1;
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		System.out.println("====" + dan + "단====");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",dan, i, dan * i );
		}
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if(dan < 2 || dan > 9 ) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int i = dan; i <= 9; i++) {
				System.out.println("==== " + i + "단 ====" );

				for(int a = 1; a <= 9; a++) {
					System.out.println(i + " * " + a + " = " + (i * a));
				}
			}
		}
	}

	public void practice7() {
		//		ex.
		//		정수 입력 : 4
		//		*
		//		**
		//		***
		//		****
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int y = 1; y <= input; y++ ) {
			for(int x = 1; x <= y; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int y = input; y >= 1; y-- ) {
			for(int x = 1; x <= y; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {

		//정수 입력 : 4
		//	 *
		//	**
		// ***
		//****

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int x = 1; x <= input; x++ ) {

			// 1) for문 하나 더 작성 
			// * 1개 출력 전에 띄어쓰기 3번
			// * 2개 출력 전에 띄어쓰기 2번
			// * 3개 출력 전에 띄어쓰기 1번
			// * 4개 출력 전에 띄어쓰기 0번


			/*
			for(int y = input - x; y >= 1; y--) { 
				System.out.print(" ");
			}
			for(int i = 1; i <= x; i++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
			 */

			// 2) for + if else

			for(int i = 1; i <= input; i++) {

				if(i <= input - x) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// 위쪽 삼각형
		for(int x = 1; x <= input; x++) {

			for(int i = 1; i <= x; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 아래쪽 삼각형
		for(int y = input - 1; y >= 1; y--) {

			for(int i = 1; i <= y; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice11(){
		//정수 입력 : 4
		//    *
		//   ***
		//  *****
		// *******

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for(int x = 1; x <= input; x++) { // 입력 받은 input 만큼 줄 출력
			// 공백 출력 for문
			for(int i = input - x; i >= 1; i--) { 
				System.out.print(" ");
			}

			// '*'출력 for문
			for(int i = 1; i <= 2 * x - 1 ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice12(){

		/* ex.
		정수 입력 : 5
		 *****
		 *   *
		 *	 *
		 *	 *
		 *****

		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// row : 행(줄)
		// col(column) : 열(칸)

		for(int row = 1; row <= input; row++) {

			for(int col = 1; col <= input; col++) {
				// row 또는 col이 1 또는 input인 경우 * 출력 
				// == 테두리
				if(row == 1 || col == 1 || row == input || col == input) {
					System.out.print("*");
				} else { // 내부 
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	public void practice13(){

		//1부터 사용자에게 입력 받은 수까지 중에서
		//  	1) 2와 3의 배수를 모두 출력하고
		//  	2) 2와 3의 공배수의 개수를 출력하세요.

		// * ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
		// 모두 나머지가 0이 나오는 수

		// ex.
		// 자연수 하나를 입력하세요 : 15
		// 2 3 4 6 8 9 10 12 14 15 
		// count : 2

		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();

		int count = 0;

		for(int i = 1; i <= input; i++) {

			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");	
			}
		}
		System.out.println();
		System.out.println("count : " + count);

	}



}
