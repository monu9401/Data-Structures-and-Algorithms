class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int i:students)
            q.offer(i);
        int j=0;
        while(!q.isEmpty() && check(q,sandwiches[j]))
        {
            if(q.peek()==sandwiches[j])
            {
                q.poll();
                sandwiches[j]=-1;
                j++;
            }
            else
            {
                int x = q.poll();
                q.offer(x);
            }
        }
        return q.size();
    }
    public boolean check(Queue<Integer> q,int x)
    {
        for(int i:q)
        {
            if(i==x)
                return true;
        }
        return false;
    }
}