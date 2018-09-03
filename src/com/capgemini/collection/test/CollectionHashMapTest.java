package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

class CollectionHashMapTest {

	@Test
	void testCollectionHashMap() {

		HashMap<String,List<String>> students=new HashMap<>() ;
		students.put("Shubham",Arrays.asList("Mango","Apple","Guava")) ;
		students.put("Spandhana", Arrays.asList("Grapes","Watermelon","Guava")) ;
		assertEquals(Arrays.asList("Mango","Apple","Guava"),students.get("Shubham"));
		List<String> l = Arrays.asList("2");
		System.out.println(l.getClass().getName());

		

	}

}
