package edu.kr.array.parctice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		
		// [실행화면]
		// 1 2 3 4 5 6 7 8 9
		// 짝수 번째 인덱스 합 : 25
		
		int[] arr = new int[9]; // 길이가 9인 배열을 선언 및 할당
		
		for(int i = 0; i < arr.length; i++) { // 순서대로 배열의 각 인덱스 요소에 대입 및 출력
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
		int sum = 0;						 // 윗 for문 안에 if문 추가하여도 됨
		
		for(int i = 0; i < arr.length; i+=2) { // 짝수 번째 인덱스 값의 합 출력 (0은 짝수로 취급)
			sum += arr[i];
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
				
	}
	
	public void practice2() {
		
		int[] arr = new int[9];                // 길이가 9인 배열을 선언 및 할당
		
		int sum = 0 ; // 합계용 변수
		
		for(int i = 0; i < arr.length; i++ ) { // 9 ~ 1 순서대로 인덱스 요소에 대입 및 출력
			arr[i] = arr.length - i;
			
			System.out.print(arr[i] + " ");
			
			if(i%2==1) {                       // 홀수 번째 인덱스 합 출력
				sum+=arr[i];
			}
			
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : "+ sum);
		
	}
	
	public void practice3() {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
		
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i ++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
			
		}
		System.out.print("검색 할 값 : ");
		int input = sc.nextInt();
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(input==arr[i]) {
				System.out.print("인덱스 :" + i + " ");
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		int[] arr = new int[input.length()];
		
		for(int i =0; i < arr.length; i++ ) {
			arr[i] = input.charAt(i);
			
		}
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.print(input+"에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0 ; i < arr.length; i++) {
			
			if(arr[i]==ch) {
				System.out.print(i +" ");
				count++;
			}
		}
		System.out.println("\n" + ch + " 개수 : " + count );
	}
	
	public void practice6() { // for문 2개
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println("\n총 합 : " + sum);
		
	}
	
	public void practice6_1() {  // for문 하나
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		
		String str = "";
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			str += arr[i] + " ";
		}
		System.out.println(str);
		System.out.println("총 합 : " + sum);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char [] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			
			if(i<8) {
				System.out.print(arr[i]);
			}else {
				System.out.print("*");
			}
		}
		
		
	}

	public void practice8() { // 작성 코드
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 3 이상의 수가 입력 될 때 까지 무한 반복
			 		  // -> 3이상이 입력되면 break문으로 종료
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input<3 || input % 2 ==0) { // 3미만 또는 짝수인 경우 -> 반복
				System.out.println("다시 입력 하세요");
				
			} else {
				
				int[] arr = new int[input];
				
				for(int i =0; i < arr.length; i++) {
					
					if(i <= arr.length/2) { // 중간 이전 까지 -> 증가
						arr[i] = i + 1;
						System.out.print(arr[i] +", ");
					}else { // 중간 이후 -> 감소
						arr[i] = arr[i-1] - 1;
					//  arr[i] = input - i;
					}
					if(i == arr.length - 1) {
						System.out.print(arr[i]);
					}else {
						System.out.print(arr[i] + ", ");
					}
				}
				
				break;
			}
		}
		
	}
	
	public void practice8_1() {  // 강의 코드
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 3 이상의 수가 입력 될 때 까지 무한 반복
			 		  // -> 3이상이 입력되면 break문으로 종료
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input<3 || input % 2 ==0) { // 3미만 또는 짝수인 경우 -> 반복
				System.out.println("다시 입력 하세요");
				
			} else {
				
				int[] arr = new int[input];
				
				int num = 0;
				
				for(int i =0; i < arr.length; i++) {
					
					if(i <= arr.length/2) { // 중간 이전 까지 -> 증가
						arr[i] = ++num;
					} else { // 중간 이후 -> 감소
						arr[i] = --num;
					}
					if(i == arr.length - 1) {
						System.out.print(arr[i]);
					}else {
						System.out.print(arr[i] + ", ");
					}
				}
			}
			break;
		}
	}
	// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	// 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for( int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char arr[] = new char[input.length()];
		
		int count = 0; // 카운트용 변수
		
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0 ; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			
			// 중복 검사 + flag
			// application
			// 배열 : { a,p,p,l,i,c,a,t,i,o,n}
			// 화면 : a,p,l,i,c,t,o,n
			// 개수 : 1 2 3 4 5 6 7 8 
			
			boolean flag = true; // 신호용 변수
			
			for( int x = 0; x < i ; x++) {
				
				if(arr[i] == arr[x]) {
					// 현재 대입된 문자가 앞서 대입된 문자와 같다면 == 중복
					flag = false; // 신호용 변수의 값을 false로 변경
					break; 
				}
			}
			
			if(flag) { // flag가 true인 경우 == 중복이 없었다.
				count++;
				if(i == 0) { // 첫 바퀴일 경우
					System.out.print(arr[i]);
				}else { // 첫 바퀴가 아닐 경우
					System.out.print(", " + arr[i]);
				}	
			}
		} // 바깥쪽 for문 끝
		System.out.println("\n문자 개수 : " + count);
		
	}
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+ " ");
		}
		
		int max = arr[0]; 	
		int min = arr[0]; // 값이 0이면 안됨
		
		for(int i = 0; i < arr.length; i++) {
			for(int x = 0; x < i; x++) {
				if( arr[x] >  max) {
					max = arr[x];
				}
				if(arr[x] < min ) {
					min = arr[x];
				}
			}
			
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random()*10+1);
			
			arr[i] = random;
			
			for(int x = 0; x < i; x++) {
				if(random == arr[x]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice12() {
	
			
		int[] lotto = new int[6];
		
		for(int i =0; i < lotto.length; i++) {
			
			int random = (int)(Math.random()*45 + 1);
			lotto[i] = random;
			
			for(int x = 0; x < i; x++) {
				
				if(random == lotto[x]) {
					i--;
					break;
				}
			}
		} 
		Arrays.sort(lotto);
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼 개행 문자 제거
		
		String[] arr = new String[size];
		
		int start = 0; // while문 내 for문의 초기식에 사용될 변수
		
		while(true) {
			
			for(int i = start ; i < arr.length; i++) {
				System.out.print((i+1)+"번째 문자열 :");
				arr[i] = sc.nextLine(); 
			}
			
			System.out.print("더 값을 입력하시겠습니까? (y/n) : ");
			char input = sc.nextLine().charAt(0);
			
			if(input == 'y' || input == 'Y') {
				
				start = arr.length;
				// 추가 입력 받기 위한 추가 배열 부분의 시작 위치
				
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				sc.nextLine();
				
				// 증가된 크기의 배열을 생성하여 arr 배열 깊은 복사
				String[] copyArr = new String[arr.length+add];
				
//				for(int x = 0; x < arr2.length; x++) {
//					if(x<arr.length) {
//						arr2[x] = arr[x];
//					}else {
//						System.out.print((x+arr.length)+"번째 문자열 : ");
//						arr2[x]= sc.nextLine();
//					}     // -- > 이 경우 while 문 밖에서 arr2 출력 불가능
//				}
				
				// 배열 깊은 복사
				
				for(int i = 0; i < arr.length; i ++) { // 기존 배열 크기 만큼만 반복
					copyArr[i] = arr[i]; // 복사 배열에 기존 배열 값을 같은 인덱스에 대입
				}
				
				// 배열 얕은 복사
					
				arr = copyArr; 
				// arr이 참조하는 주소 값을
				// copyArr의 주소 값으로 바꿔서
				// arr이 참조하는 배열의 크기가 증가한 것 처럼 보이게 함
				
			}else {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
}
