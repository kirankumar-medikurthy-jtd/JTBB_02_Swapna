/*Write a program to cipher the string?
 Example : input : str = “aabccdddee”
                  Output : a2b1c2d3e2*/
                  
/*public class ciperString {
    public static void main(String[] args) {
        String str = "ggsskk";
        
        String cipher = "";
        char currentChar = str.charAt(0);
        int count = 1;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                cipher += currentChar + "" + count;
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        
        cipher += currentChar + "" + count;
        System.out.println("Ciphered string: " + cipher);
    }
}*/




public class ciperString{
    public static void main(String[] args) {
        String str = "abbcccdddd";
        
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            boolean counted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    counted = true;
                    break;
                }
            }
            if (counted==false) {
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(j) == str.charAt(i)) {
                        count++;
                    }
                }
                System.out.println(str.charAt(i) /*+ " occurs " */+":"+ count /*+ " times."*/);
            }
        }
    }
}

