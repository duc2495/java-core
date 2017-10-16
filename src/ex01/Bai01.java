package ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Bai01 {
	private static Scanner input;

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		System.out.println("Nhập vào xâu ký tự: ");
		input = new Scanner(System.in);
		String str = input.nextLine();
		while (str.equals("")) {
			System.out.println("Nhập lại: ");
			str = input.nextLine();
		}
		hm = addHashMap(str);
		showHashMap(hm);
		hm.clear();
	}

	// Chuyển mảng chuỗi vào hashmap với key là chuỗi,
	// value là số lần xuất hiện của chuỗi trong mảng
	public static HashMap<String, Integer> addHashMap(String str) {
		if (str == null) {
			return null;
		}
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// Cắt chuỗi đầu vào bởi space
		String[] strArr = str.split("\\s");
		for (String strArr1 : strArr) {
			// Loại bỏ các ký tự space thừa
			if (!strArr1.isEmpty()) {
				if (hm.get(strArr1) == null) {
					hm.put(strArr1, 1);
				} else {
					int i = hm.get(strArr1) + 1;
					hm.put(strArr1, i);
				}
			}
		}
		return hm;
	}

	// In ra conlose toàn bộ cặp giá trị <key,value> trong hashmap
	public static void showHashMap(HashMap<String, Integer> hm) {
		// Lấy một tập hợp các entry
		Set<Entry<String, Integer>> set = hm.entrySet();
		// Lấy một iterator
		Iterator<Entry<String, Integer>> i = set.iterator();
		// Hiển thị các phần tử
		while (i.hasNext()) {
			Map.Entry<String, Integer> me = (Map.Entry<String, Integer>) i.next();
			System.out.print("Ký tự \"" + me.getKey() + "\" xuất hiện ");
			System.out.println(me.getValue() + " lần");
		}
	}
}