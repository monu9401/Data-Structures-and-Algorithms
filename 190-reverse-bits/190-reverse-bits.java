public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        while(sb.length()!=32)
            sb.insert(0,'0');
        sb=sb.reverse();
        return (int)Long.parseLong(sb.toString(),2);
    }
}