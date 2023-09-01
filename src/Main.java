import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the DARK FOREST !!");
        System.out.println("Try to survive in 10 steps by Jumping (j), Ducking (d), or Moving forward (m) to not be injured by the forest animals");
        System.out.println("You can only be wounded by the forest animals 5 times before you die, so be careful");
        System.out.println("You now have 5 lives");
        System.out.println("--------------------------------------------------------------------");



        List<String> itemList1 = new ArrayList<>();
        itemList1.add("have been scratched by a monkey");
        itemList1.add("hit a beehive");
        itemList1.add("an owl poked your eye");
        itemList1.add("you hit a tree branch");
        itemList1.add("");
        itemList1.add("");
        itemList1.add("");
        itemList1.add("");
        itemList1.add("");


        List<String> itemList2 = new ArrayList<>();
        itemList2.add("were slapped by a penguin");
        itemList2.add("came face to face with a lion");
        itemList2.add("a hundred ants instantly crawled up on you");
        itemList2.add("a badger attacked your face");
        itemList2.add("");
        itemList2.add("");
        itemList2.add("");
        itemList2.add("");
        itemList2.add("");


        List<String> itemList3 = new ArrayList<>();
        itemList3.add("stepped into a crocodile's mouth");
        itemList3.add("stepped on a snake's head so it bit you");
        itemList3.add("fell into quicksand");
        itemList3.add("ram your foot into a log and tripped");
        itemList3.add("");
        itemList3.add("");
        itemList3.add("");
        itemList3.add("");
        itemList3.add("");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int totalIterations = 0;
        int lives = 5;

        for (int steps = 9; steps >= totalIterations; steps--) {
            int randomIndex1 = random.nextInt(itemList1.size());
            int randomIndex2 = random.nextInt(itemList2.size());
            int randomIndex3 = random.nextInt(itemList3.size());

            String randomItem1 = itemList1.get(randomIndex1);
            String randomItem2 = itemList2.get(randomIndex2);
            String randomItem3 = itemList3.get(randomIndex3);

            System.out.print("Type 'j' 'd' or 'm' to perform an action: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("j")) {
                if (!randomItem1.equalsIgnoreCase("")) {
                    System.out.println("You jumped and " + randomItem1);
                    lives--;
                    if (steps == 1) {
                        System.out.println("You have " + steps + " step left to get out");
                    } else {
                        System.out.println("You have " + steps + " steps left to get out");
                    }
                    if (lives == 1) {
                        System.out.println("You now have " + lives + " life");
                    } else {
                        System.out.println("You now have " + lives + " lives");
                    }
                    System.out.println("--------------------------------------------------------------------");
                }
                else {
                    System.out.println("You moved without being injured");
                    if (steps == 1) {
                        System.out.println("You have " + steps + " step left to get out");
                    } else {
                        System.out.println("You have " + steps + " steps left to get out");
                    }
                    if (lives == 1) {
                        System.out.println("You now have " + lives + " life");
                    } else {
                        System.out.println("You now have " + lives + " lives");
                    }
                    System.out.println("--------------------------------------------------------------------");

                }
            }
            if (userInput.equalsIgnoreCase("d")) {
                if (!randomItem2.equalsIgnoreCase("")) {
                    System.out.println("You ducked and " + randomItem2);
                    lives--;
                    if (steps == 1) {
                        System.out.println("You have " + steps + " step left to get out");
                    } else {
                        System.out.println("You have " + steps + " steps left to get out");
                    }
                    if (lives == 1) {
                        System.out.println("You now have " + lives + " life");
                    } else {
                        System.out.println("You now have " + lives + " lives");
                    }
                    System.out.println("--------------------------------------------------------------------");
                }
                else  {
                    System.out.println("You moved without being injured");
                    if (steps == 1) {
                        System.out.println("You have " + steps + " step left to get out");
                    } else {
                        System.out.println("You have " + steps + " steps left to get out");
                    }
                    if (lives == 1) {
                        System.out.println("You now have " + lives + " life");
                    } else {
                        System.out.println("You now have " + lives + " lives");
                    }
                    System.out.println("--------------------------------------------------------------------");
                }
            }
            if (userInput.equalsIgnoreCase("m")) {
                if (!randomItem3.equalsIgnoreCase("")) {
                    System.out.println("You moved forward and " + randomItem3);
                    lives--;
                    if (steps == 1) {
                        System.out.println("You have " + steps + " step left to get out");
                    } else {
                        System.out.println("You have " + steps + " steps left to get out");
                    }
                    if (lives == 1) {
                        System.out.println("You now have " + lives + " life");
                    } else {
                        System.out.println("You now have " + lives + " lives");
                    }
                    System.out.println("--------------------------------------------------------------------");
                }
                else {
                    System.out.println("You moved without being injured");
                    if (steps == 1) {
                        System.out.println("You have " + steps + " step left to get out");
                    } else {
                        System.out.println("You have " + steps + " steps left to get out");
                    }
                    if (lives == 1) {
                        System.out.println("You now have " + lives + " life");
                    } else {
                        System.out.println("You now have " + lives + " lives");
                    }
                    System.out.println("--------------------------------------------------------------------");
                }
            }
            else if (!userInput.equalsIgnoreCase("j") && !userInput.equalsIgnoreCase("d") && !userInput.equalsIgnoreCase("m")){
                System.out.println("You have to type either 'j', 'd' or 'm'");
                System.out.println("--------------------------------------------------------------------");
            }

            if (lives == 0) {
                System.out.println("You have 0 lives and have died from injury infections");
                System.out.println("GAMEOVER");
                break;
            }

            if (steps==totalIterations) {
                System.out.println("YOU GOT OUT OF THE FOREST SAFELY!! YAYYY!!!");
                break;
            }
        }
    }
}