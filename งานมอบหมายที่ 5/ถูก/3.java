import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class x {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input your name:");
		StringBuffer sb = new StringBuffer("Welcome ");

		try {
			sb.append(br.readLine());
			br.close();
			System.out.println(sb);

		} catch (IOException e) {
			System.out.println("Error Encountered getting user input:"
					+ e.getMessage());
			e.printStackTrace();
		}
	}
}