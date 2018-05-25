package Srv;

import java.util.List;
import java.util.Map;

import Inf.JService;
import vo.Husks;
import vo.JShareVo;

public class RunApp {

	public static <T> void runService(Husks<T> data, List<JService> svc) throws JException {

		int _appSz = svc.size();
		for (int i = 0; i < _appSz; i++) {
			for (int j = 0; j < _appSz; j++) {
				if(i!=j) {
					if( svc.get(i).equals(svc.get(j))) {
						throw new JException(svc.get(i).getClass().getName() + " Duplicate instances");
					}
				}
			}
		}
		
		for (int i = 0; i < _appSz; i++) {
			if (i < (_appSz - 1)) {
				svc.get(i).append(svc.get(i + 1));
			}
		}
		svc.get(0).run(data);

	}

}
