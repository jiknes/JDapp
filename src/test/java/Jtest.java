

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import Inf.JService;
import Srv.*;
import vo.Husks;
public class Jtest {

	@Test
	public void test() throws Exception {
		/// JShareVo<Map> x = new JShareVo<Map>();
		Husks<Map> data = new Husks(new HashMap());

		// fail("Not yet implemented");
		List<JService> list = new ArrayList();
		list.add(new Impl01());
		list.add(new Impl02());
		list.add(new Impl03());

		RunApp.runService(data, list);

		assertTrue(data.setp == 3);
		assertTrue(data.message.equals(""));

	}

	@Test
	public void test1() throws Exception {
		// JShareVo<Map> x = new JShareVo();

		Husks<Map<String, String>> data = new Husks<Map<String, String>>(new HashMap<String, String>());
		data.getData1().put("test", "0");
		// fail("Not yet implemented");
		List<JService> list = new ArrayList();
		Impl01 t01 = new Impl01();
		Impl01 t02 = new Impl01();
		Impl03 t03 = new Impl03();
		list.add(t01);
		list.add(t02);
		list.add(t03);

		RunApp.runService(data, list);

		// assertTrue(data.setp == 3);
		assertTrue(list.size() == 3);

		assertTrue(data.message.equals(""));
		assertTrue(data.getData1().get("test").equals("3"));

	}

	@Test
	public void test3() throws Exception {

		Husks<List<Map<String, String>>> data = new Husks(new ArrayList());

		// fail("Not yet implemented");
		List<JService> list = new ArrayList();
		ImplA1 t01 = new ImplA1();
		ImplA1 t02 = new ImplA1();
		ImplA1 t03 = new ImplA1();
		list.add(t01);
		list.add(t02);
		list.add(t03);

		RunApp.runService(data, list);

		// assertTrue(data.setp == 3);
		assertTrue(list.size() == 3);

		assertTrue(data.message.equals(""));
		assertTrue(data.getData1().size() == 3);

	}

	@Test(expected = JException.class)
	public void test4() throws Exception {

		Husks<List<Map<String, String>>> data = new Husks(new ArrayList());

		// fail("Not yet implemented");
		List<JService> list = new ArrayList();
		ImplA1 t01 = new ImplA1();

		list.add(t01);
		list.add(t01);
		RunApp.runService(data, list);

		assertTrue(data.message.equals(""));
		assertTrue(data.getData1().size() == 3);

	}

	public static void main(String[] args) {

	}
}
