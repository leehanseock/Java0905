package ch11.ex11_07;

//상수 사용예제
public interface DayInterface {
    // 인터페이스 내에서는 상수만 사용되기 때문에 'public static final'을 생략할 수 있다
    // final은 처음에 초기화를 한 후에는 다른 값으로 변경할 수 없음을 의미
    // static은 인터페이스명을 .앞에 붙여서 상수를 사용할 수 있게한다.
    public static final String MONDAY = "월요일";
    String TUESDAY = "화요일";
    String WEDNESDAY = "수요일";
    String THURSDAY = "목요일";
    String FRIDAY = "금요일";
    String SATURDAY = "토요일";
    String SUNDAY = "일요일";
}
