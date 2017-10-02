package ctopro002.week2;

public class TimeTableManagement {
	public static void main(String[] args) {
		Lecture lec1 = new Lecture("EDU_JAVA", "난 정말 Java를 공부한 적이 없다구요", "윤성우");
		lec1.addLectureTime(TimeInfo.DAY_MONDAY, 1, 3); // 월 8시 ~ 10시
		lec1.addLectureTime(TimeInfo.DAY_TUESDAY, 1, 3); // 화 8시 ~ 10시
		lec1.setCredit(2);

		Lecture lec2 = new Lecture("EDU_PYTHON", "Python 언어 기초", "홍길동");
		lec2.addLectureTime(TimeInfo.DAY_MONDAY, 8, 10); // 월 15시 ~ 17시
		lec2.addLectureTime(TimeInfo.DAY_WEDNESDAY, 8, 10); // 월 15시 ~ 17시
		lec2.setCredit(1);

		Lecture lec3 = new Lecture("EDU_JAVA", "열혈강의 자바 프로그래밍", "김승현");
		lec3.addLectureTime(TimeInfo.DAY_WEDNESDAY, 4, 6); // 수 11시 ~ 13시
		lec3.addLectureTime(TimeInfo.DAY_FRIDAY, 4, 6); // 금 11시 ~ 13시
		lec3.setCredit(3);

		Lecture lec4 = new Lecture("EDU_C", "C언어 기초1", "윤성우");
		lec4.addLectureTime(TimeInfo.DAY_THURSDAY, 1, 3); // 목 8시 ~ 10시
		lec4.addLectureTime(TimeInfo.DAY_FRIDAY, 7, 9); // 금 14시 ~ 16시
		lec4.setCredit(3);

		TimeTable timetable1 = new TimeTable();
		timetable1.addLecture(lec1);
		timetable1.addLecture(lec2);
		timetable1.addLecture(lec3);
		timetable1.addLecture(lec4);
		timetable1.showTimeTable();
	}
}