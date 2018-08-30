package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.collections.Student;

class CollectionTreeSetTest {

	@Test
	void testCollectionTreeSet() {
		//TreeSet<Student> student = new TreeSet<>((s1,s2)->{return s1.compareTo(s2);});
		TreeSet<Student> student = new TreeSet<>();
		student.add(new Student("Shubham",11));
		student.add(new Student("Shivani",14));
		student.add(new Student("Nitish",19));
		student.add(new Student("Pranav",9));
		student.add(new Student("Shivendra",10));
		student.add(new Student("Archit",8));
		student.add(new Student("Aditya",7));
		student.add(new Student("Eklavya",6));
		
		Iterator<Student> itr = student.iterator();
		assertEquals("Aditya",itr.next().toString());
		assertEquals("Archit",itr.next().toString());
		assertEquals("Eklavya",itr.next().toString());
		itr.next();
		assertEquals("Pranav",itr.next().toString());
//		for(Student stu : student)
//		{
//			assertEquals("Aditya",stu.toString());
//			assertEquals("Eklavya",stu.toString());
//		}
	}

}
