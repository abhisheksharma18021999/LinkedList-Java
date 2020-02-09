   int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	
    	Node x=head;
    	int c=0;
    	while(x!=null)
    	{
    	    x=x.next;
    	    c++;
    	}
    	if(n<=c)
    	{
    	         x=head;
    	    	int key=c-n;
    	for(int i=1;i<=key;i++)
    	{
    	    x=x.next;
    	}
    	return x.data;
    	}
    	return -1; 
    
    }
