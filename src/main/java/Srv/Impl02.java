package Srv;

import java.util.Map;

public class Impl02 extends App {

	@Override
	@SuppressWarnings("unchecked")
	public void doSvc() { 
		Map<String, String> data = (Map<String, String>) data1.getData1();
		data.put("test", String.valueOf(data1.setp));
	}

	@Override
	public boolean stop() {  
		return _stop;
	}

}
