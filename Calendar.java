package bootcamprealtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar {

	private static final String DATE = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		java.util.Date today = calendar.getTime();
		System.out.println(today);
		calendar.add(Calendar.DATE, 1);
		java.util.Date tomorrow = calendar.getTime();
		System.out.println(tomorrow);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d-MMM-yyyy");
		String todaydate = dateFormat.format(today);
		String tomorrowdate = dateFormat.format(tomorrow);
		System.out.println(todaydate);
		System.out.println(tomorrowdate);		
		String[] date = tomorrowdate.split("-");
		System.out.println(date[0]);
	}

	private void add(String date2, int i) {
		// TODO Auto-generated method stub
		
	}

	private Date getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Calendar getInstance() {
		// TODO Auto-generated method stub
		return null;
	}



}
