package one_one;

import java.util.Hashtable;
import java.util.Scanner;

public class IsUnique {

	public static void first_attempt() {
		
		String message;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�޼����� �Է��ϼ���");
		
		message = scan.nextLine();
		
		for (int i=0; i<message.length(); i++) {
			for(int j=0; j<i; j++) {
				if(message.charAt(i) == message.charAt(j)) {
					System.out.println("���� �ܾ �ֽ��ϴ�.");
				return;
				}
		}
	}
		System.out.println("��� �ٸ� �ܾ�� �����Ǿ� �ֽ��ϴ�.");
	}
	
	public static void second_attempt() {
		
		String message;
		Hashtable<String, String> h = new Hashtable<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("�޼����� �Է��ϼ���");
		int a = 0;
		
		message = scan.nextLine();
		
		for (int i=0; i<message.length(); i++) {
			if(h.get(String.valueOf(message.charAt(i))) == null) {
				h.put(String.valueOf(message.charAt(i)), String.valueOf(message.charAt(i)));
				System.out.println(message.charAt(i));
			}
			else {

				System.out.println("not unique");
				return;
			}
		}
		
		System.out.println("unique");
	}
	
	public static void main(String[] args) {
		second_attempt();
	}
}
