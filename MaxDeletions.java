import java.util.Scanner;

public class MaxDeletions {

    public static int maxDeletions(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (s.substring(i - j, i).equals(s.substring(i - 2 * j, i - j))) {
                    dp[i] = Math.max(dp[i], dp[i - j] + 1);
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = scanner.nextLine();

        System.out.println("Maximum deletions for \"" + s + "\": " + maxDeletions(s));

        scanner.close();
    }
}
