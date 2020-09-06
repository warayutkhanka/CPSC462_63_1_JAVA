import java.io.*;
public class x {
  public static void main(String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    int a[] = { 0, 0, 0, 0, 0 };

    for (int i = 0; i < 5; i++) {
      a[i] = Integer.parseInt(stdin.readLine());
    }
    System.out.println(a[0] + "+" + a[1] + "+" + a[2] + "+" + a[3] + "+" + a[4] +"="+ (a[0] + a[1] + a[2] + a[3] + a[4]));
    System.out.println(a[0] + "-" + a[1] + "-" + a[2] + "-" + a[3] + "-" + a[4] +"="+ (a[0] - a[1] - a[2] - a[3] - a[4]));
    System.out.println(a[0] + "*" + a[1] + "*" + a[2] + "*" + a[3] + "*" + a[4] +"="+ (a[0] * a[1] * a[2] * a[3] * a[4]));
    System.out.println(a[0] + "/" + a[1] + "/" + a[2] + "/" + a[3] + "/" + a[4] +"="+ (a[0] / a[1] / a[2] / a[3] / a[4]));
  }
}