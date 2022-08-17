package com.mindgate.main;

import com.mindgate.pojo.time;

public class TimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		time t1= new time(1, 50);
		time t2= new time(2,30);
		
		time t3=t1.sum(t2);
		t3.showtime();
		System.out.println(t1+" "+t2+ " "+t3);
	

	}

}
