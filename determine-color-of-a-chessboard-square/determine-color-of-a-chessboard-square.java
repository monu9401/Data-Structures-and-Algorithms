class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x=coordinates.charAt(0)-'a' + 1;
        int y = Integer.valueOf(coordinates.substring(1));
        if((x%2==0 && y%2==0) || (x%2==1 && y%2==1))
            return false;
        else
            return true;
    }
}