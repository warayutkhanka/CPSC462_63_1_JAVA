import java.io.*;
class j0701 {
  public static void main (String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String getid = stdin.readLine();
    int i = 1;
    //int tot = 0;
    String b; 
    String[] fields;
    String patternStr = ",";
    FileReader fin = new FileReader("data1.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(patternStr);
      if(fields[1].equals(getid)){
     // System.out.println("Id : " + fields[0]);
     // System.out.println("zip : " + fields[1]);
     // System.out.println("province : " + fields[2]);
    //  System.out.println("district : " + fields[3]);
      System.out.println("lat : " + fields[4]);
      System.out.println("lng : " + fields[5]);
      }
      //System.out.println("Status : " + fields[4]);
      //tot = tot + Integer.parseInt(fields[3]);
    i = i + 1;
    }
    //System.out.println("Total : " + tot);
    fin.close();
  }
}