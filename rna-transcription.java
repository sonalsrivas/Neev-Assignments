import java.lang.*;
import java.util.*;
class RnaTranscription {

    String transcribe(String s) { 
        StringBuilder a =new StringBuilder();
        for ( int i =0; i<s.length(); i++){
            if (s.charAt(i)=='G'){ a.append('C');}
            else if (s.charAt(i)=='C'){ a.append('G');}
            else if (s.charAt(i)=='T'){ a.append('A');}
            else if (s.charAt(i)=='A'){ a.append('U');}
        }
        return a.toString();
    }
}
