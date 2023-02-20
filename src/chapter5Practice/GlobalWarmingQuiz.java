package chapter5Practice;
/*5.31 (Global Warming Facts Quiz) The controversial issue of global warming has been widely
publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore
and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007
Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge
about man-made climate change.” Research both sides of the issue online. Create a five-question
multiple-choice quiz on global warming, each question having four possible answers (numbered 1–
4). Be objective and try to fairly represent both sides of the issue. Next, write an application that
administers the quiz, calculates the number of correct answers (zero through five) and returns a message
to the user. If the user correctly answers five questions, print “Excellent”; if four, print “Very
good”; if three or fewer, print “Time to brush up on your knowledge of global warming,” and include
 a list of some websites where you found your facts.*/

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Global Warming quiz game. Enter 1 to start or -1 if you wish to exit quiz");

        int answer = 0;
        int answerCounter = 0;

        while (answer != -1){
            answer = input.nextInt();
            switch (answer) {
                case 1 -> {
                    System.out.println("1. The earth is getting warmer\n2.The earth is getting cooler\n3. The earth's temperature is just right");
                    System.out.println("Enter 1,2 or 3 to answer");
                    int answer1 = input.nextInt();
                    System.out.println("Enter no 2 to move to the next question");
                    if (answer1 == 1) {
                        answerCounter++;
                    }
                }
                case 2 -> {
                    System.out.println("Which of these is the cause of global warming?\n1. Swimming in the ocean\n2. Gas released by industries\n3. Planting trees");
                    System.out.println("Enter 1,2 or 3 to answer");
                    int answer2 = input.nextInt();
                    System.out.println("Enter no 3 to move to the next question");
                    if (answer2 == 2) {
                        answerCounter++;
                    }
                }
                case 3 -> {
                    System.out.println("Tundra burning releases:\n1. Organic carbons\n2. Artificial carbons\n3. None of the above");
                    System.out.println("Enter 1,2 or 3 to answer");
                    int answer3 = input.nextInt();
                    System.out.println("Enter no 4 to move to the next question");
                    if (answer3 == 3) {
                        answerCounter++;
                    }
                }
                case 4 -> {
                    System.out.println("What country can be blamed more for the continued uprising of the temperature on earth?\n1. Brazil\n2. China\n3. USA");
                    System.out.println("Enter 1,2 or 3 to answer");
                    int answer4 = input.nextInt();
                    System.out.println("Enter no 5 to move to the next question");
                    if (answer4 == 3) {
                        answerCounter++;
                    }
                }
                case 5 -> {
                    System.out.println("""
                            Greenhouse gas levels are higher now than in the last:
                            1. Three hundred thousand years
                            2. Two thousand years
                            3. Six hundred and fifty thousand years""");
                    System.out.println("Enter 1,2 or 3 to answer");
                    int answer5 = input.nextInt();
                    System.out.println("End of quiz. Enter -1 to quit");
                    if (answer5 == 3) {
                        answerCounter++;
                    }
                }
            }

        }
        if (answerCounter == 5){
            System.out.println("Excellent!");
        }else if (answerCounter == 4){
            System.out.println("Very Good");
        }else System.out.println("Time to brush up on your knowledge on global warming. Click on this website https://www.globalcitizen.org to gain more knowledge on the subject");

   }
}
