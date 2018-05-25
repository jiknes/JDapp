package Srv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImplA1 extends App {

	@SuppressWarnings("unchecked")
	@Override
	public void doSvc() { 
		List<Map<String, String>> data = (List<Map<String, String>>) data1.getData1();
		data.add(new HashMap()); 
	}

	@Override
	public boolean stop() {
		return _stop;
	}

}
