package com.dong.springProject;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {


	@Test
	void test2() throws Exception {

		int i;

		i = 2 * 2;

		if (i == 3) {
			System.out.println(111);
		} else {
			System.out.println(2222);
		}
	}
}
