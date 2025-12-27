package com.rays.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		q.add("Ram");
		q.add("Ram");
		q.add("Rawan");
		q.add(2);
		q.add(4.5);

		System.out.println(q);
		System.out.println("q is remove Rawan:" + q.poll());
		

	}
}