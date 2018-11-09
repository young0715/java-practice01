package practice01;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요:");
			int number = scanner.nextInt();
			int number_scanner=0;
			int sum=0;
			
			if(number % 2 != 0) {
				number_scanner = 1;
			}
			else {
				number_scanner = 2;
			}
			
			for(int i=number_scanner; i<=number; i+=2) {
				System.out.print(i);
				if(i == number) {
					System.out.print(" = ");
				}
				else {
					System.out.print(" + ");
				}
				sum += i;
			}
			System.out.print(sum);
			/* 코드를 완성합니다. */
			scanner.close();
			return;
		}
	}
}
