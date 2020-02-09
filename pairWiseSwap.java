void pairWiseSwap(int x, int y) 
    { 
        	// Nothing to do if x and y are same 
		Node z=head;
		while(z.data!=x)
		{
			z=z.next;
		}
		z.data=y;
	      z=head;
		while(z.data!=y)
		{
			z=z.next;
		}
		z.data=x;
    } 
