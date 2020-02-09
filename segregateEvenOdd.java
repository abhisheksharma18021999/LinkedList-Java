void segregateEvenOdd() throws NullPointerException
	{ 
	
		 int c1=0,c2=0;
		 Node x=head;
		 
		 while(x!=null)
		 {
			 if(x.data%2==0)
			 {
				 c1++;
			 }
			 else if(x.data%2!=0&&x.data!=0)
			 {
				 c2++;
			 }
			 x=x.next;
		 }

		 int arr1[]=new int[c1];
		 int arr2[]=new int[c2];
		 int i=0;
		 int j=0;
	       Node temp=head;
	       while(temp!=null)
	       {
	    	   if(temp.data%2==0)
	    	   {
	    		   arr1[i]=temp.data;
	    		   i++;
	    	   }
	    	   else if((temp.data%2!=0)&&temp.data!=0)
	    	   {
	    		   arr2[j]=temp.data;
	    		   j++;
	    	   }
	    	   temp=temp.next;
	       }
	        Node r=head;
	        c1=c1-1;
	        c2=c2-1;
	         while(c1!=-1)
	         {
	        	 r.data=arr1[c1];
	        	 c1--;
	        	 r=r.next;
	         }
	         
	         while(c2!=-1)
	         {
	        	 r.data=arr2[c2];
	        	 c2--;
	        	 r=r.next;
	         }
	          
	} 
