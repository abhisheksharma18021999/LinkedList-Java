 boolean isPalindrome(Node head) 
    {
        //Your code here
        Node x=head;
        int c=0;
        while(x!=null)
        {
            c++;
            x=x.next;
        }
        int arr[]=new int[c];
        x=head;
        int i=0;
         while(x!=null)
        {
           arr[i]=x.data;
           x=x.next;
           i++;
        }
        

       int c8=0;
		int j=c-1;
		for(int ii=0;ii<c;ii++)
		{
			
			
				if(arr[j]!=arr[ii]&&j<ii)
				{
					c8=1;
					break;
				}
				j--;
				
		}
        
        
        if(c8==0)
        {
            return true;
        }
        else
        {
            return false;
        }
         
        
        
    }    
