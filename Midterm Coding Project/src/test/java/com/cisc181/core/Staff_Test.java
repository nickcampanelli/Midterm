package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	static ArrayList<Staff> staff = new ArrayList<Staff>();

	public static Date setDate(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		return cal.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {

		staff.add(new Staff("Jessica", "Alyssa", "Albrecht", setDate(8, 30, 1978), "Green Street", "(215)-456-7899",
				"Jessica@gmail.com", "M 9:05-9:55am", 3, 55000, setDate(9, 10, 2010), eTitle.MS));
		staff.add(new Staff("Bianca", "Emily", "Myers", setDate(6, 6, 1981), "Red Street", "(329)-102-4673",
				"Bianca@gmail.com", "F 10:10-11:00am", 2, 60000, setDate(1, 19, 2009), eTitle.MRS));
		staff.add(new Staff("Samantha", "Christine", "Smith", setDate(4, 9, 1986), "Blue Street", "(610)-974-3436",
				"Samantha@gmail.com", "W 2:30-3:20pm", 1, 59000, setDate(6, 30, 2014), eTitle.MS));
		staff.add(new Staff("Billy", "Ellis", "Brown", setDate(2, 24, 1973), "Yellow Street", "(484)-134-3756",
				"Billy@gmail.com", "R 5:30-6:45pm", 4, 78000, setDate(2, 12, 2007), eTitle.MR));
		staff.add(new Staff("Randy", "Leo", "O'Connor", setDate(3, 2, 1980), "Orange Street", "(213)-146-1463",
				"Randy@gmail.com", "T 2:00-2:50pm", 2, 97000, setDate(8, 7, 2000), eTitle.MR));
	}

	@Test
	public void testStaffSalary() throws PersonException {
		double sum = 0;
		for (Staff avg : staff) {
			sum += avg.getSalary();
		}
		double average = sum / staff.size();
		assertEquals(average, 69800, .01);
	}

	@Test(expected = PersonException.class)
	public void testDOBException() throws PersonException {

		new Staff("Paul", "Eric", "Davis", setDate(11, 23, 1492), "Brown Street", "(555)-123-4567", "Paul@gmail.com",
				"T 8:00-8:50am", 1, 63000, setDate(1999, 10, 28), eTitle.MR);
	}

	@Test(expected = PersonException.class)
	public void testPhoneNumberException() throws PersonException {
		new Staff("John", "Reece", "McKendrick", setDate(12, 18, 1989), "Purple Street", "2150642769", "John@gmail.com",
				"R 4:00-7:00pm", 1, 82000, setDate(5, 2, 2013), eTitle.MR);
	}

}