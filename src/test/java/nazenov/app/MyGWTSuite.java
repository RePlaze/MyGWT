package nazenov.app;

import nazenov.app.client.MyGWTTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MyGWTSuite extends GWTTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("Tests for MyGWT");
		suite.addTestSuite(MyGWTTest.class);
		return suite;
	}
}
