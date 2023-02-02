import java.util.Scanner;
import java.util.Arrays;

public class Practice42 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		int[] cnt = new int[10];
		Arrays.fill(cnt, 0);
		
		for(int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 숫자를 입력하세요 : ");
			arr[i] = input.nextInt();
			cnt[arr[i]]++;
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
		
		System.out.println("\n가장 큰 수는 " + max + "이고, 배열 내에 " + cnt[max] + "번 나타납니다.");
		System.out.println("숫자별로 입력된 횟수는 다음과 같습니다.");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자 " + i + ": " + cnt[i] + "번");
		}
	}
}