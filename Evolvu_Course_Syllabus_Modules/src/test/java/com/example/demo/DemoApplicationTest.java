package com.example.demo;


import static org.assertj.core.api.Assertions.assertThat;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class DemoApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@BeforeAll
	 static void setUpBeforeClass() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@AfterAll
	 static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	void testMain() throws Exception {
		// given
		String[] args = new String[]{"TestArgs"};
		// when
		DemoApplication.main(args);
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	void testMain_1() throws Exception {
		// given
		String[] args = new String[]{"TestArgs"};
		// when
		DemoApplication.main(args);
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	void testMain_2() throws Exception {
		// given
		String[] args = new String[]{"TestArgs"};
		// when
		DemoApplication.main(args);
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	void testMain_3() throws Exception {
		// given
		String[] args = new String[]{"TestArgs"};
		// when
		DemoApplication.main(args);
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

}