package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class TestNg_class {
	@Test
	public void Test() {
		Validation validate = new Validation();
		int expected_Value = validate.DB_Validation();
		int actual_Value = 1;
		System.out.println("\n\n" + "expected_value = " + expected_Value + "\n" + "actual_Value = " + actual_Value);
		AssertJUnit.assertEquals(actual_Value, expected_Value);

	}

	@Test
	public void Test1() {
		Validation validate = new Validation();
		int exp = validate.Validating_Table();
		int act = 2;
		System.out.println("\n\n" + "expected_value = " + exp + "\n" + "actual_Value = " + act);
		AssertJUnit.assertEquals(act, exp);

	}

	@Test
	public void Test2() {
		Validation validate = new Validation();
		int exp = validate.BookShowValidate();
		int act = 2;
		System.out.println("\n\n" + "expected_value = " + exp + "\n" + "actual_Value = " + act);
		AssertJUnit.assertEquals(act, exp);

	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
