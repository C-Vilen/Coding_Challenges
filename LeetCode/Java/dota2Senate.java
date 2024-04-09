import java.util.LinkedList;
import java.util.Queue;

/**
 * 649. Dota2 Senate
 * In the world of Dota2, there are two parties: the Radiant and the Dire.
 * The Dota2 senate consists of senators coming from two parties. Now the Senate wants to decide on a change in the Dota2 game. The voting for this change is a round-based procedure. In each round, each senator can exercise one of the two rights:
 *  - Ban one senator's right: A senator can make another senator lose all his rights in this and all the following rounds.
 *  - Announce the victory: If this senator found the senators who still have rights to vote are all from the same party, he can announce the victory and decide on the change in the game.
 * Given a string senate representing each senator's party belonging. The character 'R' and 'D' represent the Radiant party and the Dire party. Then if there are n senators, the size of the given string will be n.
 * The round-based procedure starts from the first senator to the last senator in the given order. This procedure will last until the end of voting. All the senators who have lost their rights will be skipped during the procedure.
 * Suppose every senator is smart enough and will play the best strategy for his own party. Predict which party will finally announce the victory and change the Dota2 game. The output should be "Radiant" or "Dire".
 */
public class dota2Senate {
    // Runtime 11ms beats 71.49%, Memory 45.62 MB beats 30.71%
    public static String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        int n = senate.length();
        for(int i = 0;i < n;i++){
            if(senate.charAt(i) == 'R') qr.add(i);
            else qd.add(i);
        }
        for(;!qr.isEmpty() && !qd.isEmpty();){
            int r_i = qr.poll();
            int d_i = qd.poll();
            if(r_i < d_i) qr.add(r_i + n);
            else qd.add(d_i + n);
        }
        return qr.size() > qd.size() ? "Radiant" : "Dire";
    }

    // Runtime 3ms beats 98.86%, Memory 41.95 MB beats 99.55%
    public static String predictPartyVictoryFast(String senate) {
        boolean R = true, D = true;
        char[] chars = senate.toCharArray();
        int flag = 0, n = chars.length;
        while(R && D) {
            R = false;
            D = false;
            for(int i = 0; i < n; i++) {
                char c = chars[i];
                if(c  == 'R') {
                    if(flag < 0) {
                        chars[i] = 0;
                    } else {
                        R = true;
                    }
                    flag++;
                } else if(c == 'D') {
                    if(flag > 0) {
                        chars[i] = 0;
                    } else {
                        D = true;
                    }
                    flag--;
                }
            }
        }   
        return R == true ? "Radiant" : "Dire";
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + predictPartyVictory("RD") + " = Radiant");
        System.out.println("Example 2: " + predictPartyVictory("RDD") + " = Dire");
        System.out.println("Example 3: " + predictPartyVictory("DDRRR") + " = Dire");
        System.out.println("-------------------");
        System.out.println("Example 1: " + predictPartyVictoryFast("RD") + " = Radiant");
        System.out.println("Example 2: " + predictPartyVictoryFast("RDD") + " = Dire");
        System.out.println("Example 3: " + predictPartyVictoryFast("DDRRR") + " = Dire");
    }
}
