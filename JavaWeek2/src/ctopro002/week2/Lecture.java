package ctopro002.week2;

public class Lecture {
	public static final int MAX_DAY = 5;
	public static final int MAX_TIME = 9;

	// TODO 강의 정보를 저장하기 위해 필요한 변수를 선언한다

	public Lecture(String code, String name, String instructor) {
		// TODO 변수를 초기화 한다
	}

	// 강의 코드 반환
	public String getCode() {
		// TODO 해당되는 메소드 변수 값 반환
		return null;
	}

	// 강의명 반환
	public String getName() {
		// TODO 해당되는 메소드 변수 값 반환
		return null;
	}

	// 강사 반환
	public String getInstructor() {
		// TODO 해당되는 메소드 변수 값 반환
		return null;
	}

	// 학점 반환
	public int getCredit() {
		// TODO 해당되는 메소드 변수 값 반환
		return 0;
	}

	// 학점 설정
	public void setCredit(int value) {
		// TODO 해당되는 메소드 변수 값 설정. 유효한 학점 값인지 확인한다.
	}

	// 강의 등록
	public void addLectureTime(int day, int start, int finish) {
		// 매개변수가 유효한 범위 내에 있는지 확인한다
		if (!(TimeInfo.DAY_MONDAY <= day && day <= TimeInfo.DAY_FRIDAY && 1 <= start && start <= MAX_TIME
				&& start < finish && finish <= MAX_TIME + 1)) {
			System.out.println("강의 시간이 올바르지 않습니다.");
			return;
		}

		// TODO 새로운 강의 시간 클래스의 인스턴스를 만들어서, 해당되는 메소드 변수에 저장한다
	}

	// 강의 시간 수를 반환
	public int getTimeCount() {
		// TODO 해당되는 메소드 변수 값 반환
		return 0;
	}

	// 강의 시간 정보를 반환
	public TimeInfo getTimeInfo(int index) {
		// TODO 해당되는 메소드 변수 값 반환
		return null;
	}
}