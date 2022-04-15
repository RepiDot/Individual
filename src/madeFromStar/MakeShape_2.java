package madeFromStar;

import java.util.Scanner;

public class MakeShape_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = 0;
		int w = 0;
		int cnt = 1;
		
		System.out.print("height = ");
		h = in.nextInt();
		w = h/2+1;
		
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=w; j++) {
				if(j<=cnt) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i > h/2) {
				cnt--;
			} else {
				if(i == h/2 && h%2==0) {
					continue;
				}
				cnt++;
			}
		}
	}

}
