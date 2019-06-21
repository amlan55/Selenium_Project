package TestngFeatures;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.Test;

public class MercuryApp {
	@Test(priority=1)
	public void openBrowser() {
		System.out.println("This is an openbrowser");

	}
	@Test(priority=2)

	public void OpenUrl() {
		System.out.println("This is an OpenURL");
	}
	@Test(priority=3)

	public void login() {
		System.out.println("This is an Login");
	}
	@Test(priority=4,enabled=false)

	public void searchFlight() {
		System.out.println("This is an serachflight");
	}
	@Test(priority=5)

	public void bookFlight() {
		System.out.println("This is an bookflight");
	}
	@Test(priority=6)

	public void logout() {
		System.out.println("This is an logout");
	}
	@Test(priority=7)

	public void close() {
		System.out.println("This is an closebrowser");
	}






}
