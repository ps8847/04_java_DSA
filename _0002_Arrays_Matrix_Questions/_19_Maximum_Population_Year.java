import java.util.Arrays;

public class _19_Maximum_Population_Year {
    public static void main(String[] args) {
        // int[][] logs1 = {{1993, 1999}, {2000, 2010}};
        // int result1 = maximumPopulation(logs1);
        // System.out.println("Output for Example 1: " + result1); // Expected output: 1993

        int[][] logs2 = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        int result2 = maximumPopulation(logs2);
        System.out.println("Output for Example 2: " + result2); // Expected output: 1960
    }

    public static int maximumPopulation(int[][] logs) {
        int[] populationChange = new int[101]; // Initialize an array to track population changes

        // Update population changes based on birth and death years in the logs
        for (int[] log : logs) {
            int birthYear = log[0] - 1950; // Convert birth year to array index
            System.out.println("birthyear : " + log[0] + " , brith year is : " + birthYear);
            int deathYear = log[1] - 1950; // Convert death year to array index
            System.out.println("deadthyear : " + log[1] + " , deadth year is : " + deathYear);
            for (int i = birthYear; i < deathYear; i++) {
                populationChange[i]++;
            }

            System.out.println("populationChange inside : ");
            System.out.println(Arrays.toString(populationChange));
        }

        System.out.println("populationChange outside: ");
        System.out.println(Arrays.toString(populationChange));

        int maxPopulation = 0;
        int maxPopulationYear = 0;

        // Find the year with the maximum population
        for (int i = 0; i < populationChange.length; i++) {
            if (populationChange[i] > maxPopulation) {
                maxPopulation = populationChange[i];
                System.out.println("maxPopulation : " + maxPopulation);
                maxPopulationYear = i + 1950; // Convert array index back to year
                System.out.println("maxPopulationYear : " + maxPopulationYear);
            }
        }

        return maxPopulationYear;
    }

}
