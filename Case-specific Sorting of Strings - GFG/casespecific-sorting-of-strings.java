// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends


class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        ArrayList<Character> al1 = new ArrayList<>();
        ArrayList<Character> al2 = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            al1.add(ch);
            else
            al2.add(ch);
        }
        Collections.sort(al1);
        Collections.sort(al2);
        StringBuilder result = new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                result.append(al1.get(0));
                al1.remove(0);
            }
            else
            {
                result.append(al2.get(0));
                al2.remove(0);
            }
        }
        return result.toString();
    }
}

// { Driver Code Starts.

class GFG {
    
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        System.out.println(sortedStr);
    	    }
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
  // } Driver Code Ends