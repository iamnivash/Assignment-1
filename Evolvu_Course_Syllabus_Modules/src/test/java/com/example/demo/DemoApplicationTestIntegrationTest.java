package com.example.demo;


import static org.assertj.core.api.Assertions.assertThat;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(MockitoExtension.class)
class DemoApplicationTestIntegrationTest {

	@InjectMocks
	DemoApplicationTest underTest;

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
	void testSetUp() throws Exception {
		// given
		// when
		underTest.setUp();
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	void testSetUpBeforeClass() throws Exception {
		// given
		// when
		DemoApplicationTest.setUpBeforeClass();
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	void testTearDown() throws Exception {
		// given
		// when
		underTest.tearDown();
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	void testTearDownAfterClass() throws Exception {
		// given
		// when
		DemoApplicationTest.tearDownAfterClass();
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	void testTestMain() throws Exception {
		// given
		// when
		underTest.testMain();
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	void testTestMain_1() throws Exception {
		// given
		// when
		underTest.testMain_1();
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

	@Test
	void testTestMain_2() throws Exception {
		// given
		// when
		underTest.testMain_2();
		// then
		// TODO check for expected side effect (i.e. service call, changed parameter or exception thrown)
		// verify(mock).methodcall();
		// TestUtils.assertTestFileEquals("someMethod/ParamType_updated.json", TestUtils.objectToJson(param));
		// assertThrows(SomeException.class, () -> underTest.someMethod());
	}

}