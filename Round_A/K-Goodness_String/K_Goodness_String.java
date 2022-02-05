import java.util.Scanner;

public class K_Goodness_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            char[] word = sc.next().toCharArray();
            int count = 0;

            for (int j = 0; j < N / 2; j++) {
                if (j != N - j - 1 && word[j] != word[N - j - 1]) {
                    count++;
                }
            }

            if (count == K) {
                System.out.println("Case #" + i + ": 0");
            } else {
                System.out.println("Case #" + i + ": 1");
            }
        }
        sc.close();
    }
}