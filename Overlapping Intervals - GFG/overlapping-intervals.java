// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i=0;i<Intervals.length;i++)
        {
            if(!tm.containsKey(Intervals[i][0]))
            tm.put(Intervals[i][0],Intervals[i][1]);
            else
            tm.put(Intervals[i][0],Math.max(Intervals[i][1],tm.get(Intervals[i][0])));
        }
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i:tm.keySet())
        {
            if(al.size()==0)
            al.add(new ArrayList<>(Arrays.asList(i,tm.get(i))));
            else
            {
                ArrayList<Integer> current = al.get(al.size()-1);
                if(current.get(1)>=i)
                {
                    al.remove(al.size()-1);
                    al.add(new ArrayList<>(Arrays.asList(current.get(0),Math.max(tm.get(i),current.get(1)))));
                }
                else
                al.add(new ArrayList<>(Arrays.asList(i,tm.get(i))));
            }
        }
        int[][] result = new int[al.size()][2];
        for(int i=0;i<al.size();i++)
        {
            result[i][0]=al.get(i).get(0);
            result[i][1]=al.get(i).get(1);
        }
        return result;
    }
}