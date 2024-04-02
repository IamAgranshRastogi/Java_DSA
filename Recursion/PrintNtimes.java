import java.util.ArrayList;
import java.util.List;
public class PrintNtimes {
    public static List<String> printNtimes(int n) {
        List<String> result = new ArrayList<>();
        printNtimesHelper(n, result);
        return result;
    }

    private static void printNtimesHelper(int n, List<String> result) {
        if (n == 0)
            return;
        result.add("Coding World ");
        printNtimesHelper(n - 1, result);
    }

    public static void main(String[] args) {
        int n = 5; // Example: Print "Coding World" 5 times
        List<String> output = printNtimes(n);
        for (String s : output) {
            System.out.print(s);
        }
    }
}
