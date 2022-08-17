package com.mindgate.pojo;

public class time {
	int hours;
	int Minutes;

	public time(int hours, int minutes) {
		super();
		this.hours = hours;
		Minutes = minutes;
	}

	public void settime(int hours, int minutes) {
		this.hours = hours;
		this.Minutes = minutes;
	}

	public void showtime() {
		System.out.println("hours=" + hours + ", Minutes=" + Minutes);
	}

	public time sum(time time) {
		time t = new time(hours, Minutes);

		int totalhours = this.hours + time.hours;
		int totalMinutes = this.Minutes + time.Minutes;

		t.settime(totalhours, totalMinutes);

		return t;
	}

	@Override
	public String toString() {
		return "time [hours=" + hours + ", Minutes=" + Minutes + "]";
	}

}
