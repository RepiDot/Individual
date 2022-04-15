package madeFromStar;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = 0;
		int w = 0;
		int cnt = 0;
		int left = 0;
		int right = 0;
		
		System.out.print("height = ");
		h = in.nextInt();
		left = h;
		right = h;
		w = 2*h-1;
		
		// for�� 2�� ���
//		for(int i=1; i<=h; i++) {
//			for(int j=1; j<=w; j++) {
//				if(j>=left && j<=right) {
//					System.out.printf("*");
//				} else {
//					System.out.printf(" ");
//				}
//			}
//			System.out.println();
//			left--;
//			right++;
//		}
		
		// for�� 1�� ��� 
//		for(int i=1; i<=w*h; i++) {
//			cnt++;
//			if(cnt>=left && cnt<=right) {
//				System.out.printf("*");
//			} else {
//				System.out.printf(" ");
//			}
//			
//			if(i % w == 0) {
//				System.out.println();
//				left--;
//				right++;
//				cnt = 0;
//			}
//		}
		
		// �׵θ���
//		for(int i=1; i<=w*h; i++) {
//			cnt++;
//			if(cnt >= left && cnt <= left || cnt <= right && cnt >= right) {
//				System.out.printf("*");
//			} else {
//				System.out.printf(" ");
//			}
//			
//			if(i % w == 0) {
//				System.out.println();
//				left--;
//				right++;
//				cnt = 0;
//			}
//		}
		
		// �ﰢ�� �׵θ�
//		for(int i=1; i<=h; i++) {
//			for(int j=1; j<=w; j++) {
//				if(j>=left && j<=left || j<=right && j>=right || i==h) {
//					System.out.printf("*");
//				} else {
//					System.out.printf(" ");
//				}
//			}
//			System.out.println();
//			left--;
//			right++;
//		}
		
		// ���̵�ﰢ��
		left = 1;
		right = w;
		
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=w; j++) {
				if(j>=left && j<=right) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			System.out.println();
			left++;
			right--;
		}
		
		// ������
//		if(h%2==0) {
//			h /= 2;
//		} else {
//			h = h/2+1;
//		}
//		
//		System.out.println(h);
//		for(int i=1; i<=h*2; i++) {
//			for(int j=1; j<=w; j++) {
//				if(j>=left-cnt && j<=right+cnt) {
//					System.out.printf("*");
//				} else {
//					System.out.printf(" ");
//				}
//			}
//			System.out.println();
//			if(i > h-1) {
//				cnt--;
//			} else {
//				cnt++;
//			}
//		}
		
		
		// ���� ���� �ﰢ��
		
	}
}
