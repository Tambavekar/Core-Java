package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Empoyee;

public class CollectionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList<>();
		nameList.add("Sarika");
		nameList.add("Prajakta");
		nameList.add("Vipul");
		nameList.add("Tambavekar");

		System.out.println(nameList.size());
		System.out.println();
		System.out.println(nameList);
		nameList.remove(0);
		System.out.println(nameList.size());
		System.out.println();
		System.out.println(nameList);

		System.out.println();
		List<Empoyee> employeeList = new ArrayList();

		Empoyee employee1 = new Empoyee(01, "Dinesh", 25000);
		Empoyee employee2 = new Empoyee(02, "Amol", 23000);
		Empoyee employee3 = new Empoyee(03, "Vipul", 22000);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		for (Empoyee e : employeeList) {
			System.out.println(e);
		}
		System.out.println();

		System.out.println(employeeList);
		System.out.println();

		Set<String> nameset = new HashSet<>();

		nameset.add("Vipul");
		nameset.add("Rohit");
		nameset.add("Aishwarya");
		nameset.add("Janhvi");
		nameList.add(null);
		nameset.add(null);
		nameset.add("Vipul");
		nameset.add("Vipul");
		System.out.println(nameset);
		System.out.println();
		SortedSet<String> sortedname = new TreeSet<>();
		sortedname.add("Vipul");
		sortedname.add("Rohit");
		sortedname.add("Aishwarya");
		sortedname.add("Janhvi");
		System.out.println(sortedname);
		System.out.println();
		HashMap<Integer, String> employemap = new HashMap<>();

		employemap.put(001, "Vipul");
		employemap.put(002, "Sarika");
		employemap.put(003, "Dinesh");
		employemap.put(004, "Nisha");
		System.out.println(employemap);

		Integer i = 50;
		System.out.println(i.hashCode());

		System.out.println();

		SortedMap<Integer, String> employeesortedMap = new TreeMap<>();
		employeesortedMap.put(1, "Test 1");
		employeesortedMap.put(2, " Test 2");
		employeesortedMap.put(3, "Test 3");
		employeesortedMap.put(4, "Test 4");
		System.out.println(employeesortedMap);
	}

}
