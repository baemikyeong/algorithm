package one_one;

import java.util.Arrays;
import java.util.Scanner;

public class Zero_Matrix {
	
	public static void main(String[] argv) {
		
		String[] m = new String[2];
		int x,y=0;
		
		System.out.println("행렬의 크기를 입력하세요 ex) 3*4");
		Scanner scan = new Scanner(System.in);
		String size = scan.nextLine();
		m = size.split("\\*");
		x = Integer.parseInt(m[0]);
		y = Integer.parseInt(m[1]);
		int[][] array = new int[x][y];
		int[] check_x = new int[x];
		int[] check_y = new int[y];
		
		Arrays.fill(check_x, 1);
		Arrays.fill(check_y, 1);
		
		System.out.println("행렬을 입력하세요");
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++){
				array[i][j] = Integer.parseInt(scan.next());
				if(array[i][j] == 0) {
					check_x[i] = 0;
					check_y[j] = 0;
				}
			}
		}

		for(int i=0; i<x; i++) {
			if(check_x[i]==0)
			for(int j=0; j<y; j++) {
				array[i][j]=0;
			}
		}

		for(int j=0; j<y; j++) {
			if(check_y[j]==0)
			for(int i=0; i<x; i++) {
				array[i][j]=0;
			}
		}
		
		System.out.println();
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
