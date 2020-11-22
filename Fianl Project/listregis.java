import java.io.*;
class list {
  public static void main (String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Wait id : ");
    String getid = stdin.readLine();
    int i = 1;
    String b; 
    String[] fields;
    String patternStr = ",";
    FileReader fin = new FileReader("regis.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(patternStr);
      if(fields[0].equals(getid)){
      System.out.println("subject : " + fields[1]);
      System.out.println("grade : " + fields[2]);
      }
    i = i + 1;
    }
    fin.close();
  }
}