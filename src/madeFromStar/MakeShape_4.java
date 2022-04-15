package madeFromStar;

import java.util.Scanner;

public class MakeShape_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = 0;
		int h = 0;
		int h_ = 0;
		int cnt = 0;
		int cnt_ = 0;
		int left = 1;
		int right = 0;
		
		System.out.print("width = ");
		w = in.nextInt();
		h = w/2+1;
		h_ = h;
		h += h / 3;
		right = w;
		
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=w; j++) {
				if(i<=h_ && j>=h_ + cnt && j<=h_ - cnt || 
						i>=h_/3 && j>=left+cnt_ && j<=right-cnt_) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			cnt--;
			if(i>=h_/3) {
				cnt_++;
			}
			
		}
	}
}
