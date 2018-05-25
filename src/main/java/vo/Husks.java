package vo;

import java.util.Map;

public class Husks<T> {

	private Husks() {

	}

	public Husks(T t) {
		data1 = t;
	}

	public T getData1() {
		return data1;
	}

	private T data1;
	public String message = "";
	public int errCode = -1;
	public int setp = 0;
}
