package Inf;

import Srv.JException;
import vo.Husks;

public interface JService {
	public void append(JService j) throws JException;

	public <T> void run(Husks<T> data);

	public void next(boolean stop);

}
