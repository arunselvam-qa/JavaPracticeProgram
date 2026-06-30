package scenariosProgram;

import java.util.Arrays;

public class SmartCashier {

    static int[] values = {100, 50, 20, 10, 5, 2, 1};
    static int[] stock = {2, 3, 6, 12, 23, 5, 10};

    static int[] best;
    static int[] current;
    static int minCoins;

    public static void main(String[] args) {

        int target = 9;

        process(target);
    }

    static void process(int target) {

        int totalCash = getTotalCash();

        if (target > totalCash) {
            System.out.println("Exact change unavailable.");
            return;
        }

        best = new int[values.length];
        current = new int[values.length];
        minCoins = Integer.MAX_VALUE;

        backtrack(0, target, 0);

        if (minCoins != Integer.MAX_VALUE) {

            System.out.println("Exact Change:");
            printSolution(best);

        } else {

            System.out.println("Exact change not possible.");

            int lower = -1;

            for (int amount = target - 1; amount >= 0; amount--) {

                best = new int[values.length];
                current = new int[values.length];
                minCoins = Integer.MAX_VALUE;

                backtrack(0, amount, 0);

                if (minCoins != Integer.MAX_VALUE) {
                    lower = amount;
                    break;
                }
            }

            if (lower == -1) {
                System.out.println("Exact change unavailable.");
                return;
            }

            int smallestIndex = getSmallestCoin();

            if (smallestIndex == -1) {
                System.out.println("Exact change unavailable.");
                return;
            }

            best[smallestIndex]++;

            int totalGiven = lower + values[smallestIndex];

            System.out.println("\nCoins Given:");

            printSolution(best);

            System.out.println("Total Given = ₹" + totalGiven);
            System.out.println("Please buy something worth ₹" + (totalGiven - target));
        }
    }

    static void backtrack(int index, int remaining, int coinsUsed) {

        if (remaining == 0) {

            if (coinsUsed < minCoins) {

                minCoins = coinsUsed;
                best = Arrays.copyOf(current, current.length);

            }

            return;
        }

        if (index == values.length)
            return;

        int coin = values[index];

        int maxUse = Math.min(stock[index], remaining / coin);

        for (int use = maxUse; use >= 0; use--) {

            current[index] = use;

            backtrack(index + 1,
                    remaining - use * coin,
                    coinsUsed + use);

            current[index] = 0;
        }
    }

    static int getTotalCash() {

        int total = 0;

        for (int i = 0; i < values.length; i++)
            total += values[i] * stock[i];

        return total;
    }

    static int getSmallestCoin() {

        for (int i = values.length - 1; i >= 0; i--) {

            if (stock[i] > 0)
                return i;
        }

        return -1;
    }

    static void printSolution(int[] ans) {

        for (int i = 0; i < ans.length; i++) {

            if (ans[i] > 0) {
                System.out.println("₹" + values[i] + " x " + ans[i]);
            }

        }

    }

}
