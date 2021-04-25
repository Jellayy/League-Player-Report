import java.util.ArrayList;
import java.util.Scanner;
public class LeaguePlayerReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //The following code will be the development of a League of Legends Player Report

        //Collect the name of the player
        System.out.println("What is your first and last name");
        String fullName = input.nextLine();

        //Collect Player Username
        System.out.println("What is your username");
        String userName = input.nextLine();
        System.out.println("What is your level in game");
        int level;
        level = input.nextInt();

        //Collect the two main roles played by the user
        System.out.println("List your favorite role to play");
        ArrayList<String> roles = new ArrayList<>();
        while (input.hasNextLine()) {
            String lane = input.nextLine();
            if(lane.equals("q"))
                break;
            else if (input.hasNextLine()) {
                roles.add(lane);
            }
        }

        //Collect Favorite Champions in that role/each role
        System.out.println("List your favorite champions to play");
        ArrayList<String> favoriteChampions = new ArrayList<>();
        while (input.hasNextLine()) {
            String champs = input.nextLine();
            if(champs.equals("q"))
                break;
            else if (input.hasNextLine()) {
                favoriteChampions.add(champs);
            }
        }
        report(fullName, userName, level, roles, favoriteChampions);
        final String homie = "Matt Karp";
        final int powerLevel = 9000;
        goat(homie, 9000);

    }
    //Generate Report
    public static void report(String fullName, String userName, int level, ArrayList<String> playerRoles, ArrayList<String> playerFavoriteChampions) {
        System.out.println("=== LEAGUE PLAYER REPORT ===");
        System.out.println("Full Name: " + fullName);
        System.out.println("Username: " + userName);
        System.out.println("Level: " + level);
        System.out.println(playerRoles);
        System.out.println(playerFavoriteChampions);
    }
    public static void goat(String status, int pi) {
        System.out.println(status);
        System.out.println(pi);
    }
}
