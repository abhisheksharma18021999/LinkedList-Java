public void sort()
	{
		Node x=head;
		
		Node y=head.next;
		while(x!=null&&y!=null)
		{
		
			while(y!=null)
			{
				if(x.data>y.data)
				{
					int temp=0;
					temp=y.data;
					y.data=x.data;
					x.data=temp;
				}
				y=y.next;
			}
			
			x=x.next;
			y=x.next;
		}
	}
