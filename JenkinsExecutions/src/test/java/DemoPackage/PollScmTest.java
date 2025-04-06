package DemoPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PollScmTest {
	@Test
	public void tset() {
		Reporter.log("Poll scm pass ",true);
		Reporter.log("Poll SCM again", true);
	}

}
