package one_one;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class Palindrome_Permutation {
	
	public static void main(String[] args) {
		String message;
		Hashtable<String, Integer> h = new Hashtable<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("메세지를 입력하세요");
		int a = 0;
		int check =0;
		char alphabet;
		int mid;
		message = scan.nextLine();
		
		for (int i=0; i<message.length(); i++) {
			if(message.charAt(i)>='a')
				alphabet = (char) (message.charAt(i)-32);
			else
				alphabet = message.charAt(i);
			
			if(h.get(String.valueOf(alphabet)) == null) {
					h.put(String.valueOf(alphabet), 1);
			}
			else {
				mid = h.get(String.valueOf(alphabet));
				h.put(String.valueOf(alphabet), mid+1);
			}
		}
		
		
		for( String key : h.keySet() ) {

			int value = h.get( key );

		    if(value %2 == 1) {
		    	check++;
		    }
		    if(check >1) {
		    	System.out.println("Output : False");
		    	return;
		    }
		}
		System.out.println("Output : True");
	}
	
}
