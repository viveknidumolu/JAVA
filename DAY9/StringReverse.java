package DAY9;

public class StringReverse {
    public static void main(String[] args){
        String str = "Hello";
        String str2 = "";
        for(int i = str.length()-1;i>=0;i--){
            str2 = str2+str.charAt(i);
        }

        System.out.println("Reversed String: "+str2);
        
    }
}
