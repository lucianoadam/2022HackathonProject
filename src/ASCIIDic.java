package src;

public class ASCIIDic {
    
    private static final char[] CHARSET = {'!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '>', '=', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', ']', '\\', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '}', '|', '~'};
    private char[] newCharset = new char[CHARSET.length];

    public ASCIIDic(int uid){
        
        for (int i = 0; i < CHARSET.length; i++) {
            newCharset[i] = CHARSET[(i+uid)%CHARSET.length];
        }
    }

    public static int getLetterIndex(char c){

        return newCharset.

    }

}
