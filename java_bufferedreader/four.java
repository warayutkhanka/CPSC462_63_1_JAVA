import java.io.*;
class x {
  public static void main(String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    int a[] = new int[5];
    int max = 0;
    int min = 999;
    int tot = 0;
    double average;
    for (int i = 0; i < 5; i++) {
      a[i] = Integer.parseInt(stdin.readLine());
    }
    for (int i = 0; i < 5; i++) {
      if (a[i] > max) {
        max = a[i];
      }

      if (a[i] < min) {
        min = a[i];
      }
      tot += a[i];
    }
    average = tot / a.length;
    System.out.println("max = " + max);
    System.out.println("min = " + min);
    System.out.println("total = " + tot);
    System.out.println("average = " + average);
  }
}
