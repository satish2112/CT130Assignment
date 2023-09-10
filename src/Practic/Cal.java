package Practic;

import java.util.*;

class Cal {
	public static void main(String[] args) {
		int count = 1;
		String[] day = { "su", "M", "Tu", "W", "Th", "F", "Sa" };
		Scanner in = new Scanner(System.in);
		System.out.print("Simple Input: ");
		String s = in.next();
		int index = 0;
		for (int i = 0; i < day.length; i++) {
			if (s.equals(day[i])) {
				index = i;
			}
		}
		System.out.println(index);
		int flag = 0;
		for (int i = 0; i < 7; i++) {
			System.out.print(day[i]);
			if (flag == 0) {
				for (int j = 0; i < index; i++) {
					System.out.print(" ");
					flag = 1;
				}
			}
			for (int j = 0; i < 6; j++) {
				if (count < 32) {
					System.out.print(count);
					count++;
				}
			}
			System.out.println("");
		}

	}
}