import java.io.*;
class x {
public static void main(final String args[]) throws IOException {
    final BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    final int a[] = { 0, 0, 0, 0, 0 };
    final int b[] = { 0, 0, 0, 0, 0 };
    for (int i = 0; i < 5; i++) {
        a[i] = Integer.parseInt(stdin.readLine());
        b[i] = Integer.parseInt(stdin.readLine());
    }
    for (int i = 0; i < 5; i++) {
        try {
            System.out.println(a[i] / b[i]);
        } catch (final ArithmeticException e) {
System.out.println("OHO");
}
}
}
}
