package one_one;

// 앞으로 메인문은 생략할 예정

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class String_Compression {
	
	public void String_Compression_main(String a){
		
		char[] array1;
		int a_length;
		Enumeration<String> keys;
		String key;
		int key_size=0;
		
		Hashtable<String, Integer> h = new Hashtable<>();
		
		array1 = a.toCharArray();
		a_length = a.length();
		Arrays.sort(array1);
		
		for (int i=0; i<a_length; i++) {
			if(h.get(String.valueOf(array1[i])) == null) {
				h.put(String.valueOf(array1[i]), 1);
				key_size++;
			}
			else {
				int mid = h.get(String.valueOf(array1[i]));
				h.put(String.valueOf(array1[i]), mid+1 );
			}
		}
	
		keys = h.keys();
		
		if(key_size*2 > a_length) {
			System.out.println(a);
			return;
		}
		
		while(keys.hasMoreElements()) {
			key = (String)keys.nextElement();
			System.out.print(key + h.get(key));
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String message1;
		System.out.println("첫번째 메세지를 입력하세요");
		message1 = scan.nextLine();
		String_Compression a = new String_Compression();
		a.String_Compression_main(message1);
	}
}
