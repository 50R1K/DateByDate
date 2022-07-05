import com.TreatTime.DateByDate.DateToCode;
import com.TreatTime.DateByDate.DaysOfWeek;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter day");
        int day = scanner.nextInt();
        double dayOfWeek = DateToCode.dateToCode(year, month, day);
        DaysOfWeek[] days = DaysOfWeek.values();
        System.out.println("This was "+days[(int)dayOfWeek]);
    }
}
