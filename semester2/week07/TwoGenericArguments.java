package week07;

class KeyValue<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

public class TwoGenericArguments {
	public static void main(String[] args) {
		// kv1 객체를 생성할 때 K는 String 으로, V는 Integer 로 확정
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("노트북");
		kv1.setValue(1250000);
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key: " + key1 + " | value: " + value1);

		// kv2 객체를 생성할 때 K는 Integer 로, V는 String 으로 확정
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key: " + key2 + " | value: " + value2);

		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키 값만 사용");
		String key3 = kv3.getKey();
		System.out.println("key: " + key3);
	}
}
