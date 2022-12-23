package src;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets; 
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypter {
    
    private long[] arrayify (String pass, ASCIIDic dic){
        
        long[] convPass = new long[pass.length()];

        for(int i = 0; i < convPass.length; i++)
            convPass[i] = dic.getLetterIndex(pass.charAt(i));

        return convPass;

    }
    

    private long[] multiply (long[] shifted, long uid){
        
        for(int i = 0; i < shifted.length; i++)
            shifted[i] *= uid;
        
        return shifted;
    }


    private String hashPass(long[] oldPass) throws UnsupportedEncodingException, NoSuchAlgorithmException{
        
        String pass = "";
        for (long l : oldPass)
            pass += l;
        
        final MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(pass.getBytes("UTF-8"));
        byte[] digest = m.digest();
        return new String(digest, StandardCharsets.UTF_8);

    }

}