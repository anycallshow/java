package edu.kr.etc;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Practice {

	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		System.out.print("문자 : ");
		char input2 = sc.nextLine().charAt(0);
		
		
		char[] arr = new char[input.length()];
		
		int count = 0;
		
		String str = "";
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			if(input2==arr[i]) {
				str += i + " ";
				count++;
			}
		}
		
		
		for(int i =0; i < arr.length; i++) {
		}
		
		System.out.println(input+"에 "+input2+"가 존재하는 위치(인덱스) : " + str);
		System.out.println(input2+"개수 : "+ count);
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			
			boolean flag = true;
			
			for(int x = 0; x < i; x++) {
				if(arr[i]==arr[x]) {
				flag = false;
			}
			}
			if(flag) {
				if(i==0) {
					System.out.print(arr[i]);
				}else {
					System.out.print(", " + arr[i]);
				}
				count++;
			}
		}
		System.out.println("\n문자 개수 : " + count);
		
	}
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		
		int start = 0;
		
		while(true) {
		
			for(int i = start; i < arr.length; i++) {
				System.out.print(i+1+"번째 문자열");
				String input = sc.nextLine();
				arr[i] = input;
			}
			
			System.out.print("더 값을 입력하시겠습니까? (y/n) : ");
			char ok = sc.nextLine().charAt(0);
			
			if(ok=='y'||ok=='Y') {
				start = arr.length;
				
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				sc.nextLine();
				
				String[] arr2 = new String[size + add];
				
				for(int i = 0; i < arr.length; i++) {
					arr2[i] = arr[i];
				}
				arr=arr2;
			}
			else {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	public void ex6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("nextInt() : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("next() : ");
		String b = sc.nextLine();

		System.out.print("nextLine() : ");
		String c = sc.nextLine();

		System.out.println(a+b+c);
	}
	
	
	
}
