/* Problem S1: Crazy Fencing
    15/15
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    double[] heights = new double[n+1];
    double[] widths = new double[n];

    for (int i = 0; i <= n; i++) {
      heights[i] = s.nextDouble();
    }
    s.nextLine();
    for (int i = 0; i < n; i++) {
      widths[i] = s.nextDouble();
    }
    s.nextLine();


    double sum = 0;

    for (int i = 0; i < n; i++) {
      sum += widths[i] * ((heights[i]+heights[i+1])/2);
    }

    System.out.println(sum);
  }
}
