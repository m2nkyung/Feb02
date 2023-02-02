//0부터  9까지의  정수를  5번  입력  받은  후  아래와  같이  동작하는  프로그램을  작성하여라

import java.util.Scanner;
public class Practice41 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 숫자를 입력하세요 : ");
			arr[i] = input.nextInt();
		}
		
		System.out.println("입력된 숫자는 다음과 같습니다.");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n역순 출력입니다.");
		
		for(int i = 4; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		int max = arr[0];
		for(int i = 1; i < 5; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("\n가장 큰 수는 " + max + "다");
	}
}