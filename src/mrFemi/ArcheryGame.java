//package mrFemi;
//
///*7.20 (Archery Game) A group of four friends visit a sports club and they decide to practice archery. Each player gets 3 chances and in every chance they can score between 0 to 10 points. The
//player with the maximum score after adding the scores obtained in all 3 chances wins. Write an application that simulates this game and prints the scores of all four players in a tabular format and
//also prints which player won.
//Each line in the table should contain the following:
//1) The player number
//2) Their first chance score
//3) Their second chance score
//4) Their third chance score
//5) Their score after all three chances
//Use multidimensional arrays to store the scores of players in each chance.
//Use the secure random-number generation mechanism learnt in the previous chapter to generate
//scores between 0 and 10 for each player chance.*/
//
//import java.util.Arrays;
//
//public class ArcheryGame {
//    private Player[] players;
//    public ArcheryGame(int numberOfArchers){
//        players = new Player[numberOfArchers];
//        Player[] archers = addPlayers(numberOfArchers);
//        players = Arrays.copyOf(archers, archers.length);
//    }
//
//    public Player[] getPlayers() {
//        return players;
//    }
//    private static void addPlayers(int numberOfArcher){
//
//        for (int i = 0; i < numberOfArcher; i++) {
//            Player player = new Player();
//
//        }
//    }
//}
