public class RokPrzestepny {
    public static void main(String[] args) {
        int year = 1985;
        boolean isDivBy4 = (year % 4 == 0);
        boolean isNotDivBy100 = (year % 100 != 0);
        boolean isDivBy400 = (year % 400 == 0);
        boolean isLeapYear = (isDivBy4 && isNotDivBy100) || isDivBy400;
        System.out.println("Czy rok "+ year + " jest rokiem przestępnym?" + isLeapYear);
    }
}