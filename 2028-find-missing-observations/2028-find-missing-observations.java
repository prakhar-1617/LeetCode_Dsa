class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum += rolls[i];
        }
        int totalSum = mean * (m + n);
        int missingSum = totalSum - sum;

        // ye importat part h
        // Minimum and maximum possible sum with n dice
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }

        int[] arr = new int[n];
        // Give every die minimum value 1
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
            missingSum--;
        }
        // Distribute remaining sum
        int i = 0;
        while (missingSum > 0) {
            int canAdd = Math.min(5, missingSum);
            arr[i] += canAdd;
            missingSum -= canAdd;
            i++;
        }
        return arr;
    }
}
      