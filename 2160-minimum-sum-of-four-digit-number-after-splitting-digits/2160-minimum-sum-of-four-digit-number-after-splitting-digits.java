class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[4];
        int c=0;
        while(num!=0)
        {
            int r=num%10;
            arr[c]=r;
            c++;
            num=num/10;
        }
        Arrays.sort(arr);
        int num1 = 10*arr[0]+arr[2];
        int num2 = 10*arr[1]+arr[3];
        return num1+num2;
    }
}