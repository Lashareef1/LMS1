package lms;


import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import com.infinite.lms.Employ;


public class EmployTest {

	@Test 
	public void testToString() {
		Employ employ3 = new Employ(1, "ABHILASH", "AbhilashP@hexaware.com", "7772021561", Date.valueOf("2017-11-14"), "HEXAVARSITY", 1000, 10);
		String result = "Employ [empId=" + 1 + ", Name=" + "ABHILASH" + ", Email=" + "AbhilashP@hexaware.com" + ", Mob=" + "7772021561" + ", DOJ=" + Date.valueOf("2017-11-14")
				+ ", Dept=" + "HEXAVARSITY" + ", mId=" + 1000 + ", leaveAvail=" + 8 + "]";
		
		assertEquals(result, employ3.toString());
	}
	@Test
	public void testGetterAndSetter(){
		Employ employ1 = new Employ();
		employ1.setEmpId(1);
		employ1.setName("ABHILASH");
		employ1.setDept("HEXAVARSITY");
		employ1.setEmail("AbhilashP@hexaware.com");
		employ1.setMob("7772021561");
		employ1.setDOJ(Date.valueOf("2017-11-14"));
		employ1.setmId(1000);
		employ1.setLeaveAvail(8);
		
		
		assertEquals(1, employ1.getEmpId());
		assertEquals("ABHILASH", employ1.getName());
		assertEquals("HEXAVARSITY", employ1.getDept());
		assertEquals("AbhilashP@hexaware.com", employ1.getEmail());
		assertEquals("7772021561", employ1.getMob());
		assertEquals(Date.valueOf("2017-11-14"), employ1.getDOJ());
		assertEquals(1000 , employ1.getmId());
		assertEquals(8, employ1.getLeaveAvail());
	}
	
	@Test
	public void testConstructor(){
		Employ employ1 = new Employ();
		assertNotNull(employ1);
		
		Employ employ2 = new Employ(1, "ABHILASH ", "AbhilashP@hexaware.com", "7772021561", Date.valueOf("2017-11-14"), "HEXAVARSITY", 1000, 8);
		assertEquals(1, employ2.getEmpId());
		assertEquals("ABHILASH", employ2.getName());
		assertEquals("AbhilashP@hexaware.com", employ2.getEmail());
		assertEquals("7772021561", employ2.getMob());
		assertEquals(Date.valueOf("2017-11-14"), employ2.getDOJ());
		assertEquals("HEXAVARSITY", employ2.getDept());
		assertEquals(1000, employ2.getmId());
		assertEquals(8, employ2.getLeaveAvail()); 
	}
}
