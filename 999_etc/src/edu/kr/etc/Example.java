package edu.kr.etc;

import java.util.Scanner;

public class Example {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("끝 숫자 입력 : ");
		int endNum = sc.nextInt();
		
		int[] arr = new int[endNum];
		
		int num = 1;
		int sum = 0;
		
		for(int i = 0 ; i <arr.length; i++) {
			arr[i] = num++;
			sum += arr[i];
			
//			if(arr[i] % 2 == 0 && arr[i] % 3 == 0) {
//				sum += arr[i];
//			}
		}
		System.out.println(sum);
		
	}
	
	
}
