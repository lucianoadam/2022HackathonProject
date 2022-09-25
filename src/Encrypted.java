package src;

public class Encrypted {
    
    
    private int[] convPass;
    private ASCIIDic dic = new ASCIIDic(1); //change this when we have firebase

    
    public void arrayify (String pass){
        convPass = new int[pass.length()];

        for(int i = 0; i< pass.length(); i++){
            convPass[i] = dic.getLetterIndex(pass.charAt(i));
        }

    }
    




    

}

