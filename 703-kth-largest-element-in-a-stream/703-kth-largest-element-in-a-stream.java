class KthLargest {
    
    int arr[];
    int k;
    PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        this.arr=nums;
        this.k=k;
        pq = new PriorityQueue<>();
        for(int i:arr)
        {
            if(pq.size()<k)
                pq.offer(i);
            else
            {
                if(pq.peek()<i)
                {
                    pq.poll();
                    pq.offer(i);
                }
            }
        }
    }
    
    public int add(int val) {
        if(!pq.isEmpty())
        {
            if(pq.size()<k)
            {
                pq.offer(val);
            }
            else if(val>pq.peek())
            {
                pq.poll();
                pq.offer(val);
            }
        }
        else
        {
            pq.offer(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */