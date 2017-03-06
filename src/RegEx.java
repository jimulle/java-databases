import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
	  // String to be scanned to find the pattern.
      String line1 = "This order was placed for QT3000! OK?";
      String line2 = "This order was placed for QTX3000! OK?";
      String line3 = "This order was placed for QT3000 and RS56! OK?";
      
      String pattern = "\\s(([a-zA-Z]{2})(?=\\d)(\\d+))";
      
      OutputMatches(pattern, line1);
      OutputMatches(pattern, line2);
      OutputMatches(pattern, line3);
	}
	
	public static void OutputMatches(String pattern, String line) {
	  // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object for line
      Matcher m = r.matcher(line);
      
      System.out.println("Line: '" + line + "'");
      
      // Check for at least one match
      if (m.find( )) {
    	 // match found, process the first match
    	 do {
    		 // loop through and output the capture groups
	    	 for(int i=1; i<=m.groupCount(); i++) {
	    		 System.out.println("Found value (" + i + "): " + m.group(i) );
	    	 }
    	 } while (m.find( ));
    	 // if another match exists, repeat the loop
      } else {
	     // no match found in the string
         System.out.println("NO MATCH");
      }
      
      System.out.println();
      
	}

}
