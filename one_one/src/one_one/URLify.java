package one_one;

import java.util.Arrays;
import java.util.Scanner;

public class URLify {
public static void main(String[] args) {
		
		String message1;
		String[] message;
		String[] number;
		char[] array1;

		int limit;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 메세지를 입력하세요");
		message1 = scan.nextLine();
		System.out.println(message1);

		message = message1.split(",");
		number = message[1].split(" ");
		
		limit = Integer.parseInt(number[1]);
		
		message[0] = message[0].substring(1, limit+1);
		message[0] = message[0].replace(" ", "%20");
		System.out.println("\""+message[0]+"\"");
		
				
	}
}
