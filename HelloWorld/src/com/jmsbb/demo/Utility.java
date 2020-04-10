package com.jmsbb.demo;

import java.util.Calendar;
import java.util.Date;

public class Utility {
	public Date getSysDate() {
		Calendar calendar= Calendar.getInstance();
		return calendar.getTime();
	}
}
