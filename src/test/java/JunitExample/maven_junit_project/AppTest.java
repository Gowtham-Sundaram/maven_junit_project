package JunitExample.maven_junit_project;

import java.time.LocalDateTime;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	static calculator calculator;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before all test");
	}

	@Before
	public void beforeEach() {
		System.out.println("Before each test");
	}

	@Test
	public void test1() {
		System.out.println("Test 1 executed at "+LocalDateTime.now());
	}
	@Test
	public void test2() {
		System.out.println("Test 1 executed at "+LocalDateTime.now());
	}

	@After
	public void afterEach() {
		System.out.println("After each test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After all test");
	}

}
