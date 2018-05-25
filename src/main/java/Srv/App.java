package Srv;

import Inf.JService;
import vo.Husks;

abstract class App implements JService {

	public Husks data1;

	public boolean _stop = false;

	public abstract void doSvc();

	public abstract boolean stop();

	@Override
	public <T> void run(Husks<T> data) {

		this.data1 = data;
		this.data1.setp++;
		try {
			System.out.println("doSvc() " + this.getClass().getName() + "[" +this.hashCode()+"] is Started");
			doSvc();
			System.out.println("doSvc() " + this.getClass().getName() + "[" +this.hashCode()+"] End");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			next(stop());

		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void next(boolean stop) { 

		if (!stop && _nextSvc != null) { 
			_nextSvc.run(data1);

		}
	}

	private JService _nextSvc;

	@Override
	public void append(JService j) throws JException {

		_nextSvc = j;
	}

}
