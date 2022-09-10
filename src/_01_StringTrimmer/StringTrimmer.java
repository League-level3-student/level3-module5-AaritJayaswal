package _01_StringTrimmer;

public class StringTrimmer {

    /*
     * This method removes the specified number of characters from the right
     * side of the specified string and returns the trimmed string. 
     */
    static public String trimString(String str, int removesLeft) {
        // 1. If there are no removes left
    	StringBuilder stringbuilder = new StringBuilder();
            if(removesLeft==0) {
            // 2. Return the string
return str;
            }
        // 3. Else you need to remove the last letter from the string,
        //    reduce removesLeft by 1, and then call trimString() 
            else {
            	stringbuilder.append(str);
            	stringbuilder.deleteCharAt(str.length()-1);
            	str = stringbuilder.toString();
            	removesLeft--;
            	return trimString(str, removesLeft);
            }
       
    }
}
