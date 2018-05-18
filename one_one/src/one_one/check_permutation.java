package one_one;

import java.util.Arrays;
import java.util.Scanner;

public class check_permutation {

	public static void main(String[] args) {
		
		String message1;
		String message2;
		char[] array1;
		char[] array2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 메세지를 입력하세요");
		message1 = scan.nextLine();
		
		System.out.println("두번째 메세지를 입력하세요");
		message2 = scan.nextLine();
		
		array1 = message1.toCharArray();
		array2 = message2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2))
			System.out.println("same!");
		else
			System.out.println("no permutation");
				
	}
}
