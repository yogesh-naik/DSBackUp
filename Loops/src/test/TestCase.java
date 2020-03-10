package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import code.fibonacci;

public class TestCase {

	@Test
	public void test1(){
		fibonacci fb = new fibonacci();
		fb.fibo();
	}
}
