package ex04;

import java.util.Scanner;

public class Bai04 {
	private static Scanner input;

	public static void main(String[] args) {
		String result = new String();
		System.out.println("Nhập vào chuỗi ký tự [a-z]: ");
		input = new Scanner(System.in);
		String str = input.nextLine();
		while (str.equals("")) {
			System.out.println("Nhập lại: ");
			str = input.nextLine();
		}
		result = findString(str);
		if (result.length() > 0) {
			System.out.println(result);
		} else {
			System.out.println("Không tìm thấy chuỗi thỏa mãn");
		}
	}

	public static String findString(String str) {
		if (str == null) {
			return null;
		}
		if (str.equals("")) {
			return "";
		}
		StringBuffer result = new StringBuffer();
		// Nếu chuỗi có 1 ký tự in ra ký tự đó
		if (str.length() == 1) {
			return str;
		}
		// Nếu ký tự đầu tiên và ký tự thứ 2 khác nhau thì ta bắt đầu chuỗi
		// cần tìm từ ký tự đầu tiên
		if (str.charAt(0) != str.charAt(1)) {
			// Thêm ký tự thỏa mãn vào chuỗi giá trị
			result.append(str.charAt(0));
		}
		int i;
		for (i = 1; i < str.length() - 1; i++) {
			// Nếu ký tự đang xét khác ký tự trước và sau nó thì thỏa mãn
			// chuỗi cần tìm
			if (str.charAt(i - 1) != str.charAt(i) && str.charAt(i) != str.charAt(i + 1)) {
				// Thêm ký tự thỏa mãn vào chuỗi giá trị
				result.append(str.charAt(i));
			} else {
				// Nếu vi phạm điều kiện và đã tìm được chuỗi thỏa mãn thì
				// dừng vòng lặp
				if (result.length() != 0)
					break;
			}
		}
		// Xét ký tự cuối cùng của chuỗi có thỏa mãn hay không
		if (i == (str.length() - 1) && str.charAt(i - 1) != str.charAt(i)) {
			result.append(str.charAt(i));
		}
		return result.toString();
	}
}
