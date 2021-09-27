package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import quiz1.dbOperation1;

class test_select {
int value;
	@Test
	void test() {
		
		String username = "a";
		String passw = "a";
		dbOperation1 db = new dbOperation1();
		String query = "select * from register where username = '"+username+"' and password = '"+passw+"'";
		ResultSet rs = db.select(query);
		value = 0;
		try {
		if (rs.next()){
		value = 1;
		}
		} catch (SQLException throwables) {
		throwables.printStackTrace();
		}
		assertEquals(1,value);


	}

}
