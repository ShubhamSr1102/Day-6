package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.collections.Car;

class CollectionCarSortTest {

	@Test
	void testCollectionCarSort() {
		TreeSet<Car> car = new TreeSet<>();
		car.add(new Car("BMW", "BMW056", 2001, 1_00_00_000));
		car.add(new Car("Swift", "Dzire", 2005, 5_00_000));
		car.add(new Car("Hundai", "Elite", 2008, 5_50_000));
		car.add(new Car("Audi", "A8", 2012, 2_50__00_000));
		car.add(new Car("Swift", "Baleno", 2016, 8_00_000));
		car.add(new Car("Renault", "Duster", 20012, 10_00_000));
		
		Iterator<Car> itr = car.iterator();
		assertEquals("Dzire",itr.next().toString());
		assertEquals("Elite",itr.next().toString());
		assertEquals("Baleno",itr.next().toString());
		itr.next();
		assertEquals("BMW056",itr.next().toString());
	}

}
