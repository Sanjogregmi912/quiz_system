package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import quiz1.dbOperation1;

class test_update {

	@Test
	void test() {
		int value;
		String f_name ="a";
		String l_name = "b";
		String sql = "update register set first_name ='"+f_name+"',last_name='"+l_name+"' where user_id =1";
					
		String query = "select first_name from register where user_id = 1";	
		dbOperation1 db = new dbOperation1();
		int ans = db.update(sql);
		ResultSet rs = db.select(query);
		value = 0;
		try {
		if (rs.next()){
		value = 1;
		}
		} catch (SQLException throwables) {
		throwables.printStackTrace();
		}
		assertEquals(1,ans);


	}
	}


