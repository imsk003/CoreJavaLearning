import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution {

    private static String[] result = new String[10000];
    public static void main(String[] args) {
        String[] boxSet = new String[1000];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        int[] child = new int[10000] ;
        try {
            t = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int n = 0; n < t; n++) {
            try {
                boxSet[n] = br.readLine();
                child[n] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            String[] boxes = boxSet[n].split(" ");
            int[] separateBoxes = new int[boxes.length];
            for (int i = 0; i < boxes.length; i++) {
                try {separateBoxes[i] = Integer.parseInt(boxes[i]);}
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            result[n]=printAllSubsets(separateBoxes, separateBoxes.length, child[n]);
        }
        for (int n = 0; n < t; n++) {
            System.out.print(result[n] + "\n");
        }
    }

    private static boolean[][] dp;
    private static String res = null;
    private static void display()
    {
        res = "YES";
    }


    private static void printSubsetsRec(int[] arr, int i, int sum,
                                        ArrayList<Integer> p)
    {

        if (i == 0 && sum != 0 && dp[0][sum])
        {
            p.add(arr[i]);
            display();
            p.clear();
            return;
        }

        if (i == 0 && sum == 0)
        {
            display();
            p.clear();
            return;
        }


        if (dp[i-1][sum])
        {
            ArrayList<Integer> b = new ArrayList<>(p);
            printSubsetsRec(arr, i-1, sum, b);
        }

        if (sum >= arr[i] && dp[i-1][sum-arr[i]])
        {
            p.add(arr[i]);
            printSubsetsRec(arr, i-1, sum-arr[i], p);
        }
    }


    private static String printAllSubsets(int[] arr, int n, int sum)
    {
        if (n == 0 || sum < 0)
            return null;


        dp = new boolean[n][sum + 1];
        for (int i=0; i<n; ++i)
        {
            dp[i][0] = true;
        }


        if (arr[0] <= sum)
            dp[0][arr[0]] = true;

        for (int i = 1; i < n; ++i)
            for (int j = 0; j < sum + 1; ++j)
                dp[i][j] = (arr[i] <= j) ? (dp[i-1][j] ||
                        dp[i-1][j-arr[i]])
                        : dp[i - 1][j];
        if (!dp[n - 1][sum])
        {
            res = "NO";
        }

        ArrayList<Integer> p = new ArrayList<>();
        printSubsetsRec(arr, n-1, sum, p);
        return res;
    }

}