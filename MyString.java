public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";
        for (int i =0; i<str.length();i++){
			char curentChar= str.charAt(i);
			 if ((curentChar>=65) && (curentChar <=90)){
				newStr += (char) (curentChar+32);
            }
            else{
                newStr += curentChar;
            }
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length()>str1.length()){
            return false;
        }
        if (str2.length()==0){
            return true;
        }
       for (int i=0; i<str1.length(); i++){
                for (int j=0; j<str2.length(); j++){
                    if (j+i <=str1.length()){
                        if (str1.charAt(j+i)!= str2.charAt(j)){
                            break;
                        }
                        if (j== str2.length()-1){
                            return true;
                        }
                    }   
                }
        
    }
    return false;
}
}
// str1 = hello
// str2 = low