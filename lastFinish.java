public class LongestRoute {
    public static void main(String[] args) {
        int numBlocks = 4;
        int numHousesPerBlock = 64;

        int totalHouses = numBlocks * numHousesPerBlock;
        int[] route = new int[totalHouses];

        // Initialize the route with a sequential order of houses.
        for (int i = 0; i < totalHouses; i++) {
            route[i] = i;
        }

        // Shuffle the route to make it random.
        for (int i = 0; i < totalHouses; i++) {
            int j = (int) (Math.random() * totalHouses);
            int temp = route[i];
            route[i] = route[j];
            route[j] = temp;
        }

        // Reverse the order to ensure you are the last to finish.
        for (int i = 0; i < totalHouses / 2; i++) {
            int temp = route[i];
            route[i] = route[totalHouses - 1 - i];
            route[totalHouses - 1 - i] = temp;
        }

        // Print the shuffled and reversed route.
        for (int house : route) {
            System.out.print(house + " ");
        }
    }
}
