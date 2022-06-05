class MedianFinder {
    PriorityQueue<Integer> maxHeap;//first half
    PriorityQueue<Integer> minHeap; //2nd half

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        //if top of the maxHeap is greater than number
        if(maxHeap.size() == 0 || maxHeap.peek() > num) {
            maxHeap.add(num);
            //if top of the manHeap is less than number
        } else if(minHeap.size() == 0 || minHeap.peek() < num) {
            minHeap.add(num);
        } else {
            minHeap.add(num);
        }
        ////the size of the heaps has to be almost equal(diff in size should be less than or equal to 1)
        
        if(maxHeap.size()  -  minHeap.size() > 1){
            minHeap.add(maxHeap.poll());
            
        } else if(minHeap.size()  -  maxHeap.size() > 1) {
            maxHeap.add(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        if( minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        } else if ( minHeap.size() < maxHeap.size()) {
            return maxHeap.peek();
        } else {
            int num1=maxHeap.peek();
            int num2=minHeap.peek();
            double ans=(double)(num1+num2)/2;
            return ans;
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */