package one_one;

import java.util.Arrays;
import java.util.Scanner;

public class One_Away {
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
		//Arrays.sort(array1);
		//Arrays.sort(array2);
		
		if(message1.length() == message2.length()) {
			int diff=0;
			for(int i=0; i<message1.length(); i++) {
				if(array1[i] != array2[i])
					diff++;
			}
			if(diff == 1) System.out.println("true");
			else System.out.println("false");
			return;
		}
		else if(Math.abs(message1.length()-message2.length()) == 1){
			int diff = 0;
			int j=0;
			if(message1.length() > message2.length()) {
				for(int i=0; i<message2.length() ; i++) {
					if(array1[j] != array2[i]) {
						diff++;
						i--;
					}
					j++;
				}
				if(diff == 1) System.out.println("true");
				else System.out.println("false");
				return;
			}
			else {
				for(int i=0; i<message1.length(); i++) {
					if(array1[i] != array2[j]) {
						diff++;
						i--;
					}
					j++;
				}
				if(diff == 1) System.out.println("true");
				else System.out.println("false");
				return;
			}
		
		}
		else {
			System.out.println("false");
			return;
		}
			
	}

}
