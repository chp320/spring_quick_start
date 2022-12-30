package core.jspbean;

import java.net.Inet4Address;
import java.time.LocalDate;
import java.util.Date;

public class Today {
    private String year;
    private String month;
    private String day;

    public Today() {
        // 오늘의 날짜 설정 (java8 이전은 Date 사용, 이후는 LocalDate 로 사용)
        LocalDate date = LocalDate.now();
        year = Integer.toString(date.getYear());
        month = Integer.toString(date.getMonthValue());
        day = Integer.toString(date.getDayOfMonth());
        System.out.println("year: " + year + ", month: " + month + ", day: " + day);
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
}
