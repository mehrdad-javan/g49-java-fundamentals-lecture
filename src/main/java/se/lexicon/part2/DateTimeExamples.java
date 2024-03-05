package se.lexicon.part2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExamples {

    public static void main(String[] args) {
        // LocalDate : Represents a date (year, month, day)
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse("2022-02-25");
        System.out.println("today = " + today);
        System.out.println("birthDate = " + birthDate);
        System.out.println(today.getYear());

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);


        LocalDate currentDate = LocalDate.now();
        LocalDate nextYearDate = currentDate.plusDays(2).plusYears(1);
        Period period = Period.between(currentDate, nextYearDate);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);

        System.out.println(today.plusDays(1));
        System.out.println(today.plusDays(1).plusMonths(1));

        System.out.println(LocalDate.now().isLeapYear());

        LocalTime localTime = LocalTime.parse("08:30");
        System.out.println("localTime = " + localTime);

        //...
        LocalDate feb25 = LocalDate.of(2022,2,25);
        System.out.println(feb25.format(DateTimeFormatter.BASIC_ISO_DATE)); // 20220225
        System.out.println(feb25.format(DateTimeFormatter.ISO_DATE)); // 2022-02-25

    }


}
