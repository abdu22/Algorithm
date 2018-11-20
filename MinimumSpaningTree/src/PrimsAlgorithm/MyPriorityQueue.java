	package PrimsAlgorithm;
	
	public class MyPriorityQueue {
	      // Array based and heap based 
		
		private Vertex[] data;
	
	    private int heapSize;
	
	    public MyPriorityQueue(int size) {
	        data = new Vertex[size];
	        heapSize = 0;
	  }
	
	  public Vertex peek() {
	
	        if (isEmpty())
	              throw new HeapException("Heap is empty");
	        else
	              return data[0];
	  }
	  
	  public boolean isEmpty() {
	        return (heapSize == 0);
	  }
	  
	  private int getLeftChildIndex(int nodeIndex) {
	        return 2 * nodeIndex + 1;
	  }
	  
	  private int getRightChildIndex(int nodeIndex) {
	        return 2 * nodeIndex + 2;
	  }
	  
	  private int getParentIndex(int nodeIndex) {
	        return (nodeIndex - 1) / 2;
	  }
	  
	  public class HeapException extends RuntimeException {
	        public HeapException(String message) {
	              super(message);
	        }
	  }	
	  
	  public void add(Vertex value) {

          if (heapSize == data.length)
                throw new HeapException("Heap's underlying storage is overflow");
          else {
                heapSize++;

                data[heapSize - 1] = value;
                
                siftUp(heapSize - 1);
          }
    }    
   private void siftUp(int nodeIndex) {

          int parentIndex; Vertex tmp;

          if (nodeIndex != 0) {
                parentIndex = getParentIndex(nodeIndex);

                if (data[parentIndex].key > data[nodeIndex].key) {

                      tmp = data[parentIndex];

                      data[parentIndex] = data[nodeIndex];

                      data[nodeIndex] = tmp;

                      siftUp(parentIndex);
                }
          }
    }
   public Vertex poll() {
	   Vertex min;
       if (isEmpty())
             throw new HeapException("Heap is empty");
       else {
    	          min = data[0] ;
             data[0] = data[heapSize - 1];

             heapSize--;

             if (heapSize > 0)

                   siftDown(0);
       }
	return min;
 }
   private void siftDown(int nodeIndex) {

       int leftChildIndex, rightChildIndex, minIndex;
       Vertex tmp;

       leftChildIndex = getLeftChildIndex(nodeIndex);

       rightChildIndex = getRightChildIndex(nodeIndex);

       if (rightChildIndex >= heapSize) {

             if (leftChildIndex >= heapSize)
                   return;
             else
                   minIndex = leftChildIndex;
       } else {
             if (data[leftChildIndex].key <= data[rightChildIndex].key)

                   minIndex = leftChildIndex;
             else
                   minIndex = rightChildIndex;
       }
       if (data[nodeIndex].key > data[minIndex].key) {
    	   
             tmp = data[minIndex];

             data[minIndex] = data[nodeIndex];

             data[nodeIndex] = tmp;

             siftDown(minIndex);
       }

  }
   /*boolean removeEq(Object o) {
       for (int i = 0; i < size; i++) {
           if (o == queue[i]) {
               removeAt(i);
               return true;
           }
       }
       return false;
   }*/
}
