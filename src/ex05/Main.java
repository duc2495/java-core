package ex05;

public class Main {

	public static void main(String[] args) {
		Dictionary<Integer, Integer, Integer> dict = new Dictionary<Integer, Integer, Integer>();
		dict.put(1, 1, 2);
		if (dict.containsKey(1, 1)) {
			System.out.println("1 + 1 = " + dict.get(1, 1));
		}
		dict.put(1, 1, 3);
		
		System.out.println("1 + 1 < " + dict.get(1, 1));
		dict.put(1, 2, 3);
		System.out.println(dict.get(1, 2));
	}
}
