package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;

import org.junit.jupiter.api.Test;

import quiz1.Register;



class test_check {

	@Test
	void test() {
		String password = "ab";
		String confirm_password = "ab";
		Register re = new Register();
		String result =re.check(password,confirm_password);
		assertEquals(password,result);
	}

}
