

public class MysteryQuestion {

  public static String function(String s) {
     if (s.length() != 10) {
       throw new RuntimeException();
     }


    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < 10; i++) {
      if (i == 0) { // Check if it's the first iteration 
        sb.append('('); // Append the char '(' to StringBuffer
      } else if (i == 3) { // Check if it's the third iteration 
        sb.append(')'); // Append the char ')' to StringBuffer
      } else if (i == 6) { // Check if it's the sixth iteration
        sb.append('-'); // Append the char '-' to StringBuffer
      }
      char c = s.charAt(i); // Retrieves the character according to the iteration
      if (Character.isDigit(c)) { // Check if it's the char 'c' is a Digit
        sb.append(c); // Append the char to StringBuffer
      } else if (Character.isLetter(c)) { // Check if it's the char 'c' is a Letter 
        char c1 = (char) (Character.toLowerCase(c) - 'a'); // Convert char c to lower case and after get the decimal value according ASCII and subtraction of decimal ASCII value of char 'a' = 97 
        char c2 = (char) (((int) '2') + (c1 / 3)); // Get the decimal ASCII value of char '2' = 50 and add to result of the int value of the result c1/3 and than get the final ASCII value 
        sb.append(c2); // Append the char ‘c2’ to StringBuffer
      } else {
        throw new RuntimeException();
      }
    }
    return sb.toString(); // Return the phone number
  }
}


