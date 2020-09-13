class x {
    public static void main(String[] args) {
        String name = "aknahK tuyaraW";
        int len = name.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
   
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = 
                name.charAt(i);
        } 
        
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j];
        }
        
        String reversename =
            new String(charArray);
        System.out.println(reversename);
    }
}