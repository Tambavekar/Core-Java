package com.mindgate.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.mindgate.pojo.Empoyee;

public class HsahSetWorkingMain {
public static void main(String[] args) {
	Empoyee e1 = new Empoyee(0, "X", 10);
	Empoyee e2 = new Empoyee(1, "Y", 20);
	Set<Empoyee> empset = new HashSet<>();
	empset.add(e1);
	empset.add(e2);
}

}
