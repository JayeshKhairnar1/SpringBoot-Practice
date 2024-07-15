package mypack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {
	private Scanner sc = new Scanner(System.in);
	private Sample s = new Sample();

	@Test
	public void testSqr() {
		System.out.println("Enter input");
		int input = sc.nextInt();
		System.out.println("Enter expected Result");
		int result = sc.nextInt();
		assertEquals(result, s.sqr(input));
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Testing");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Testing");
	}

}
