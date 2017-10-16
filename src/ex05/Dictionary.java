package ex05;

import java.util.HashMap;

public class Dictionary<K1, K2, Value> {

	private HashMap<K1, HashMap<K2, Value>> dict;

	// Sử dụng HashMap lồng nhau để tạo class có 2 key với 1 value
	public Dictionary() {
		dict = new HashMap<K1, HashMap<K2, Value>>();
	}

	// Lấy ra giá trị ứng với bộ key (k1,k2) trong Dict
	public Value get(K1 k1, K2 k2) {
		if (dict.get(k1) != null) {
			HashMap<K2, Value> hashMap = dict.get(k1);
			return hashMap.get(k2);
		}
		return null;
	}

	// Kiểm tra bộ key (k1,k2) đã có trong Dict chưa
	// Nếu tồn tại key trả về true, ngược lại trả về false
	public boolean containsKey(K1 k1, K2 k2) {
		boolean bool = false;
		if (dict.get(k1) != null) {
			HashMap<K2, Value> hashMap = dict.get(k1);
			if (hashMap.get(k2) != null) {
				bool = true;
			}
		}
		return bool;
	}

	// Lưu bộ key với value tương ứng vào Dict
	public Value put(K1 k1, K2 k2, Value value) {
		if (dict.containsKey(k1)) {
			HashMap<K2, Value> m = dict.get(k1);
			return m.put(k2, value);
		} else {
			HashMap<K2, Value> hashMap = new HashMap<K2, Value>();
			hashMap.put(k2, value);
			dict.put(k1, hashMap);
			return null;
		}
	}
}