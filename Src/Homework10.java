import java.util.Arrays;
import java.util.Random;

public class Homework10 {

    public static final int TEAM_COUNT = 25;
    public static final int AGE_MIN = 18;
    public static final int AGE_MAX = 40;
    public static void main(String[] args) {
        Random random = new Random();
        int[] teamA = new int[TEAM_COUNT];
        int sumTeamA = 0;
        int[] teamB = new int[TEAM_COUNT];
        int sumTeamB = 0;
        for(int i = 0; i < TEAM_COUNT; i++) {
            teamA[i] = random.nextInt(AGE_MAX - AGE_MIN) + AGE_MIN;
            teamB[i] = random.nextInt(AGE_MAX - AGE_MIN) + AGE_MIN;
            sumTeamA += teamA[i];
            sumTeamB += teamB[i];
            double avgAgeteamA = (double) sumTeamA / teamA.length;
            double avgAgeteamB = (double) sumTeamB / teamB.length;
            System.out.println(Arrays.toString(teamA));
            System.out.println("Average age team A " + avgAgeteamA);
            System.out.println(Arrays.toString(teamB));
            System.out.println("Average age team B " + avgAgeteamB);




        }
    }
}
