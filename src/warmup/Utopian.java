package warmup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ranitd
 * Time: 01-01-2015
 * Project: HackerRank
 */
public class Utopian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int growCycle;
        growCycle = in.nextInt();

        for (int i = 0; i < growCycle; i++) {
            int cycle = in.nextInt();
            int treeHgt = 1;
            for (int j = 1; j <= cycle; j++) {
                if ( j%2 == 0 )
                    treeHgt += 1;
                else
                    treeHgt *= 2;
            }
            System.out.println(treeHgt);
        }
    }
}
