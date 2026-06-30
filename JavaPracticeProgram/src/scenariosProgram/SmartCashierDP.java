package scenariosProgram;
import java.util.*;

public class SmartCashierDP {

    public static void main(String[] args) {

        int[] value = {100, 50, 20, 10, 5, 2, 1};
        int[] quantity = {2, 3, 6, 12, 23, 5, 10};

        int target = 13;

        int totalCash = 0;

        for (int i = 0; i < value.length; i++)
            totalCash += value[i] * quantity[i];

        if (target > totalCash) {
            System.out.println("Exact change unavailable.");
            return;
        }

        if (!solve(target, value, quantity)) {

            System.out.println("\nExact change not possible.");

            int lower = target - 1;

            while (lower >= 0) {

                if (solve(lower, value, quantity)) {

                    int smallest = -1;

                    for (int i = value.length - 1; i >= 0; i--) {
                        if (quantity[i] > 0) {
                            smallest = value[i];
                            break;
                        }
                    }

                    int totalGiven = lower + smallest;

                    System.out.println("Add one ₹" + smallest + " coin");
                    System.out.println("Total Given = ₹" + totalGiven);
                    System.out.println("Please buy something worth ₹" + (totalGiven - target));

                    break;
                }

                lower--;
            }

            if (lower < 0)
                System.out.println("Exact change unavailable.");
        }

    }

    static boolean solve(int target, int[] value, int[] quantity) {

        List<Integer> coins = new ArrayList<>();

        for (int i = 0; i < value.length; i++) {

            for (int j = 0; j < quantity[i]; j++) {
                coins.add(value[i]);
            }

        }

        int n = coins.size();

        int INF = 100000;

        int[] dp = new int[target + 1];
        int[] parent = new int[target + 1];
        int[] usedCoin = new int[target + 1];

        Arrays.fill(dp, INF);

        dp[0] = 0;

        for (int i = 0; i < n; i++) {

            int coin = coins.get(i);

            for (int amount = target; amount >= coin; amount--) {

                if (dp[amount - coin] + 1 < dp[amount]) {

                    dp[amount] = dp[amount - coin] + 1;
                    parent[amount] = amount - coin;
                    usedCoin[amount] = coin;

                }

            }

        }

        if (dp[target] == INF)
            return false;

        System.out.println("\nExact Change:");

        Map<Integer, Integer> result = new TreeMap<>(Collections.reverseOrder());

        int amount = target;

        while (amount > 0) {

            int coin = usedCoin[amount];

            result.put(coin, result.getOrDefault(coin, 0) + 1);

            amount = parent[amount];

        }

        for (int c : result.keySet()) {
            System.out.println("₹" + c + " x " + result.get(c));
        }

        return true;
    }
}
