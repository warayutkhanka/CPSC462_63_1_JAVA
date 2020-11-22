import java.io.*;
import java.lang.*;
import java.util.regex.*;
class updtxt { 
  public static void main(String args[]) throws IOException {
    String waitopt;
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));    
    String buf; 
    waitopt  = "Wait your choice [menu, bye, 0, 1, 2, 3, 4, 5, 6 ,7 ,8 ,9 ,10 ,11] : ";
    displaymenu();
    System.out.print(waitopt);
    buf = stdin.readLine();
    while (!buf.equals("0")) {
      if (buf.equals("0") || buf.equals("bye")) {
        System.out.println("Bye Bye");  
        break;
      } else if (buf.equals("1")){
        addstd();
        buf = " ";
      } else if (buf.equals("2")){
        addsub();
        buf = " ";
      } else if (buf.equals("3")){
        addreg();
        buf = " ";
      } else if (buf.equals("4")){
        listnum();
        buf = " ";
      } else if (buf.equals("5")){
        editstd();
        buf = " ";
      } else if (buf.equals("6")){
        editsub();
        buf = " ";
      } else if (buf.equals("7")){
        editrgt();
        buf = " ";
      } else if (buf.equals("8")){
        deletestd();
        buf = " ";
      } else if (buf.equals("9")){
        deletesub();
        buf = " ";
      } else if (buf.equals("10")){
        deletergt();
        buf = " ";
      } else if (buf.equals("11")){
        aboutme();
        buf = " ";
      } else if (buf.equals("menu") || buf.equals("m")) {
        displaymenu();
        buf = " ";
      } else {
        System.out.print(waitopt);
        buf = stdin.readLine();
      }
    }
  }
  static void displaymenu () {
    System.out.println("0 : exit");
    System.out.println("1 : Add Student");
    System.out.println("2 : Add Subject");
    System.out.println("3 : Add Register");
    System.out.println("4 : List Data");
    System.out.println("5 : Edit Student ");
    System.out.println("6 : Edit Subject");
    System.out.println("7 : Edit Register");
    System.out.println("8 : Delete Student");
    System.out.println("9 : Delete Subject");
    System.out.println("10 : Delete Register");
    System.out.println("11 : About me");
    System.out.println("");  
  }
  public static void aboutme () throws IOException{
      System.out.println("___________________________________________");
      System.out.println("|                                          |");
      System.out.println("|  Hello !!! My name is Warayut Khanka.    |");
      System.out.println("|  My nick name is Nueng.                  |");
      System.out.println("|  I'm age 21.                             |");
      System.out.println("|  I'm study Nation University.            |");
      System.out.println("|  My Facebook is Nueng SP.                |");
      System.out.println("|__________________________________________|");
  }
    public static void addstd () throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      String bufid,bufname;
      System.out.print("Wait id : ");
      bufid = stdin.readLine();
      System.out.print("Wait name : ");
      bufname = stdin.readLine();
      String b;
      String ar[] = new String[10];
      FileReader fin = new FileReader("student.txt");
      BufferedReader bin = new BufferedReader (fin);
      int i = 0;
      while ((b =  bin.readLine()) != null) {      
          ar[i] = b; 
          i = i + 1;
      }    
      fin.close();
      int tot = i;
      FileOutputStream fout = new FileOutputStream("student.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      PrintStream pout = new PrintStream(bout);
      i = 0;
      while (i < tot) {      
          pout.println(ar[i]);     
          i = i + 1;
      }
      pout.println(bufid + "," + bufname);
      System.out.println("Add : completely");
      pout.close();
    }
    public static void addsub () throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      String subj,subjname;
      System.out.print("Wait Subjectid : ");
      subj = stdin.readLine();
      System.out.print("Wait Subject : ");
      subjname = stdin.readLine();
      String b;
      String ar[] = new String[10];
      FileReader fin = new FileReader("subject.txt");
      BufferedReader bin = new BufferedReader (fin);
      int i = 0;
      while ((b =  bin.readLine()) != null) {      
          ar[i] = b; 
          i = i + 1;
      }    
      fin.close();
      int tot = i;
      FileOutputStream fout = new FileOutputStream("subject.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      PrintStream pout = new PrintStream(bout);
      i = 0;
      while (i < tot) {      
          pout.println(ar[i]);     
          i = i + 1;
      }
      pout.println(subj + "," + subjname);
      System.out.println("Add : completely");
      pout.close();
  }
  public static void addreg () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String stdid,subjname,subgrade;
    System.out.print("Wait id : ");
    stdid = stdin.readLine();
    System.out.print("Wait subject : ");
    subjname = stdin.readLine();
    System.out.print("Wait grade : ");
    subgrade = stdin.readLine();
    String b;
    String ar[] = new String[2];
    FileReader fin = new FileReader("regis.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
        ar[i] = b; 
        i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("regis.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
        pout.println(ar[i]);     
        i = i + 1;
    }
    pout.println(stdid + "," + subjname + "," + subgrade);
    System.out.println("Add : completely");
    pout.close();
  }
  public static void listnum () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String buf;
    System.out.print("Wait filename to listing : ");
    buf = stdin.readLine();
    int n = 0;
    int l = 1;
    byte b[] = new byte[125];
    FileInputStream fin = new FileInputStream(buf);
    System.out.print(l + " : "); 
    l = l + 1;
    while ((n = fin.read(b)) != -1) {
      for(int i=0;i<n;i++) {
        if (b[i] != 13) {  
          if (b[i] == 10) {
             System.out.println(); 
             System.out.print(l + " : "); 
             l = l + 1;
          } else System.out.print((char)b[i]);
        }  
      }
    }
    fin.close();
    System.out.println();
    System.out.println("==================================="); 
  }
  public static void editstd () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String stdid,stdname;
    System.out.print("Wait id : ");
    stdid = stdin.readLine();
    System.out.print("Wait name : ");
    stdname = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("student.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("student.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (stdid.equals(ar[i].substring(0,3))) {
        pout.println(stdid + "," + stdname);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  public static void editsub () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String subjid,subjname;
    System.out.print("Wait id : ");
    subjid = stdin.readLine();
    System.out.print("Wait name : ");
    subjname = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subject.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("sublect.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (subjid.equals(ar[i].substring(0,3))) {
        pout.println(subjid + "," + subjname);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  public static void editrgt () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String stdid,subj,subgrade;
    System.out.print("Wait id : ");
    stdid = stdin.readLine();
    System.out.print("Wait subject : ");
    subj = stdin.readLine();
    System.out.print("Wait grade : ");
    subgrade = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("regis.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("regis.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (stdid.equals(ar[i].substring(0,3))) {
        pout.println(stdid + "," + subj + "," + subgrade);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  public static void deletestd () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String stdid;
    System.out.print("Wait id : ");
    stdid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("student.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("student.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (stdid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  public static void deletesub () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String stdid;
    System.out.print("Wait id : ");
    stdid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("subject.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("subject.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (stdid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  public static void deletergt () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String stdid;
    System.out.print("Wait id : ");
    stdid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("regis.txt");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    int tot = i;
    FileOutputStream fout = new FileOutputStream("regis.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (stdid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }

}