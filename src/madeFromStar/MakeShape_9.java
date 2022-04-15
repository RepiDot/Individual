package madeFromStar;

import java.util.Scanner;

public class MakeShape_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = 20;
		int w = h*4-1;
		int cnt = 0;
		
		
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
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=w; j++) {
				if(j>=h*2-cnt && j<=h*2+cnt) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i>h/4 && i%2==0) {
				cnt--;
			} else if(i<=h/4){
				cnt-=7;
			}
			
		}
	}

}
