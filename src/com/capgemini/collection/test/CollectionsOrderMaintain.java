package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


class CollectionsOrderMaintain {

	@Test
	void testCollectionsOrderMaintain() {
		ArrayList<String> student = new ArrayList<String>();
		student.add("Shubham");
		student.add("Shivani");
		student.add("Nitish");
		student.add("Pranav");
		student.add("Shivendra");
		student.add("Archit");
		student.add("Aditya");
		student.add("Eklavya");
		
		assertEquals("Shubham", student.get(0));	
		assertEquals("Shivendra", student.get(4));
		assertEquals("Archit", student.get(5));
		assertEquals("Nitish", student.get(2));
		
	}

}
