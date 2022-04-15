package madeFromStar;

import java.util.Scanner;

public class MakeShape_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = 0;
		int w = 0;
		int cnt = 0;
		
		System.out.print("height = ");
		h = in.nextInt();
		w = h*4-1;
		
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=w; j++) {
				if(j>=h*2-cnt && j<=h*2+cnt) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i<=3*h/4 && i%2==0) {
				cnt++;
			} else if(i>3*h/4){
				cnt+=7;
			}
			
		}
	}

}
