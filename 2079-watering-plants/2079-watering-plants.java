class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0,cc=capacity;
        for(int i=0;i<plants.length;i++)
        {
            if(cc>=plants[i])
            {
                steps++;
                cc=cc-plants[i];
            }
            else
            {
                steps=steps+i+(i+1);
                cc=capacity-plants[i];
            }
        }
        return steps;
    }
}