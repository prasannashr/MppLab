package lab5;

import java.util.Calendar;
import java.util.Date;

public class DateRange {

	private Calendar startDate;
	private Calendar endDate;

	public DateRange(Calendar startDate, Calendar endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public boolean isInRange(Date d) {
		if (!(d.before(startDate.getTime()) && !(d.after(endDate.getTime()))))
			return true;
		return false;
	}

	public static int getFirstDayOfMonth(Date date) {
		return 1;

	}

	public static int getLastDayOfMonth(Date date) {

		switch (date.getMonth()) {
		case 0:
		case 2:
		case 4:
		case 6:
		case 7:
		case 9:
		case 11:
			return 31;
		case 1:
			if ((date.getYear() % 400 == 0) || ((date.getYear() % 4 == 0) || (date.getYear() % 100 != 0)))
				return 29;
			return 28;

		}

		return 30;

	}

	public Calendar getStartDate() {
		return startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

}
