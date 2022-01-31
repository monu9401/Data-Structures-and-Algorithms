class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        
        int real1=getRealPart(num1);
        int real2=getRealPart(num2);
        int img1=getImaginaryPart(num1);
        int img2=getImaginaryPart(num2);
        
        int totalReal = real1*real2 + img1*img2*-1;
        int totalImaginary = real1*img2 + real2*img1;
        String st=String.valueOf(totalReal)+"+"+String.valueOf(totalImaginary)+"i";
        return st;
    }
    public int getRealPart(String s)
    {
        int i = s.indexOf('+');
        String x = s.substring(0,i);
        return Integer.valueOf(x);
    }
    public int getImaginaryPart(String s)
    {
        int i = s.indexOf('+');
        String x = s.substring(i+1,s.length()-1);
        return Integer.valueOf(x);
    }
}