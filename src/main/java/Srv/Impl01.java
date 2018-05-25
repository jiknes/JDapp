package Srv;

import java.util.Map;

public class Impl01 extends App {

	@Override
	public boolean stop() {
		// TODO Auto-generated method stub
		return _stop;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void doSvc() {
		Map<String, String> data = (Map<String, String>) data1.getData1();
		data.put("test", String.valueOf(data1.setp));
	}

}
