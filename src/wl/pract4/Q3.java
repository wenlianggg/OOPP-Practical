package wl.pract4;

import java.util.Scanner;

public class Q3 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Message msg = new Message("Wen Liang", "Robert Tan");
		for (int i = 0; i < 1; i = 0) {
			System.out.print("Append to message body (exit to stop): ");
			String appendable = sc.next();
			if (appendable.equalsIgnoreCase("exit"))
				break;
			msg.append(appendable);
		}
		System.out.print(msg.toString());
	}
}
