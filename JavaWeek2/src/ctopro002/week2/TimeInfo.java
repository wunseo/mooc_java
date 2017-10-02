package ctopro002.week2;

public class TimeInfo {
	public static final int DAY_MONDAY = 1;
	public static final int DAY_TUESDAY = 2;
	public static final int DAY_WEDNESDAY = 3;
	public static final int DAY_THURSDAY = 4;
	public static final int DAY_FRIDAY = 5;

	private static final String DAY_NAMES[] = { "월", "화", "수", "목", "금" };

	private final int day;
	private final int start;
	private final int finish;

	public TimeInfo(int day, int start, int finish) {
		this.day = day;
		this.start = start;
		this.finish = finish;
	}

	public int getDay() {
		return day;
	}

	public int getStart() {
		return start;
	}

	public int getFinish() {
		return finish;
	}

	public String getTimeInfoString() {
		return String.format("%s: %d:00 - %d:00\n", DAY_NAMES[day - 1], start + 7, finish + 7);
	}
}