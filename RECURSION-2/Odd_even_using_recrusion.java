package code;

import java.util.Scanner;

public class Odd_even_using_recrusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5;
		odd(n);
		even(n);
	}
	public static void odd(int n) {
		if(n == 0) {
			return;
		}
		if(n%2 != 0) {
			System.out.println(n);
		}
		odd(n-1);
	}
	public static void even(int n) {
		if(n == 0) {
			return;
		}
		even(n-1);
		if(n%2 == 0) {
			System.out.println(n);
		}
	}

}
