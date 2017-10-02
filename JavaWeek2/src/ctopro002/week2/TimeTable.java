package ctopro002.week2;


public class TimeTable {
	private static final int MAX_SIZE = 6; // 최대 저장 사이즈

	// TODO 강의가 저장되는 배열 변수 선언
	Lecture[] lecAr = new Lecture[6];
	
	// TODO 현재 저장된 강의 개수를 저장하는 변수 선언
	private static int lecArNum;
	

	// 시간표 상의 강의 배치 상태를 저장하는 이차원 배열
	private int[][] timeTableArray = new int[Lecture.MAX_DAY][Lecture.MAX_TIME];

	public TimeTable() {
		// TODO 변수 초기화
		lecArNum = 0;
	}

	// 강의를 추가한다. 강의를 추가할 수 없거나 추가하여 시간이 겹친 경우 false를 반환한다.
	public boolean addLecture(Lecture lecture) {
		// TODO 강의를 추가하기 전에 배열이 꽉 찼는지 확인한다. 추가할 수 없을 경우 "더 이상 강의를 저장할 수 있는 공간이 없습니다." 메시지를 출력 후 false를 반환한다.
		if( lecArNum >= 6)
		{
			System.out.println("더 이상 강의를 저장할 수 있는 공간이 없습니다.");
			return false;
		}
		
		// TODO 동일한 코드의 강의가 존재하는지 확인한다. 있으면 "이미 존재하는 강의입니다." 메시지를 출력 후 false를 반환한다.
		for( int i=0; i<lecArNum; i++ )
		{
			String lecName = lecAr[i].getName();
			if( lecName.equals(lecture.getName()) )
			{
				System.out.println( "이미 존재하는 강의입니다."+lecture.getName());
				return false;
			}
		}

		// TODO 배열의 새로운 위치에 강의를 저장한다.
		lecAr[lecArNum++] = lecture;


		// 시간표 상에 강의 시간이 겹쳤는지 확인한다
		if (!updateTimeInfo())
			return false;

		// 최종적으로 문제가 없으면 true를 반환한다.
		return true;
	}

	private boolean updateTimeInfo() {
		// 일단 전체를 0으로 초기화 한다
		for (int day = 0; day < Lecture.MAX_DAY; day++) {
			for (int time = 0; time < Lecture.MAX_TIME; time++) {
				timeTableArray[day][time] = 0;
			}
		}

		boolean timeConflicted = false;
		// TODO 모든 강좌의 강의 시간을 시간표에 배치한다 (index 값 + 1을 저장).
		// 배치하려고 하는데 이미 값이 있을 경우 강의 시간이 중복된 것이다.
		

		return timeConflicted;
	}

	public void showTimeTable() {
		System.out.println(" < 수강 과목 정보 >");
		
		// TODO 강의 정보(순번/코드/강의명/강사명/학점, 강의 시간)를 순서대로 출력한다
		for(int i=0; i< lecArNum; i++ )
		{
			System.out.printf("%d. [%s-%d] : %s - %s (%d학점)\n", i+1, lecAr[i].getCode(), i+1, lecAr[i].getName(), lecAr[i].getInstructor(), lecAr[i].getCredit() );
		}

		
		
		System.out.println("Time\t\t월\t화\t수\t목\t금");
		for (int time = 0; time < Lecture.MAX_TIME; time++) {
			System.out.printf("%2d:00 - %2d:00\t", time + 8, time + 9);

			for (int day = 0; day < Lecture.MAX_DAY; day++) {
				// TODO 시간표의 해당 위치에 강의 번호를 출력한다
				System.out.printf( "%d      \t", 1);
			}
			System.out.println();
		}
	}
}