package node;
import java.util.*;



	class llist
	{
		class Node
		{
			int data;
			Node next;
			
		}
		Node head;
		public void add(int data)
		{
			Node node =new Node();
			node.data=data;
			node.next=null;
			  
			if(head==null)
			{
				head=node;
			}
			else
			{
				Node x=head;
				
				while(x.next!=null)
				{
					x=x.next;
				}
				x.next=node;
			}
			
		}
		
		public void show()
		{

			Node x=head;
			
			while(x.next!=null)
			{
				System.out.println(x.data);
				x=x.next;
			}
			System.out.println(x.data);
		}
		public void addbeg(int data)
		{
			Node node=new Node();
			node.data=data;
			node.next=null;
			node.next=head;
			head=node;
		}
		public void insertAt(int index,int data)
		{
			Node node=new Node();
			node.data=data;
			node.next=null;
		    
			if(index==1)
			{
				addbeg(data);
				
			} 
			else
			{
			Node x=head;
			for(int i=0;i<index-2;i++)
			{
				x=x.next;
			}
			node.next=x.next;
			x.next=node;
			}

	}
		public void deletebeg()
		{
			if(head==null)
			{
				System.out.println("list is empty");
			}
			else
			{
				Node temp=head;
				head=head.next;
				temp.next=null;
			}
			
			
			
		}
		
		public void deleteAt(int index)
		{
			if(index==0)
			{
				head=head.next;
				
			}
			else
			{
				Node x=head;
				for(int i=0;i<index-1;i++)
				{
					x=x.next;
				}
				Node n=null;
				n=x.next;
				x.next=n.next;
				n.next=null;
				System.out.println("n was     =  "+ n.data);
				
				
			}
		}
		public int size()
		{ 
			Node x=head;
			int count=0;
			if(head==null)
			{
				System.out.println("no item");
			}
			else
			{
			while(x.next!=null)
			{
				x=x.next;
				 count++;
			}
			//x.next=null;
			count++;
			System.out.println(count+" kk   ");
			return count;
			
			}
			return 0;
		}
		public void delete()
		{
			if(head==null)
			{
				System.out.println("nothing on list");
			}
			
			else
			{
				
				Node x=head;
			//	int count=0;
				if(head==null)
				{
					System.out.println("no item");
				}
				else
				{
//				while(x.next!=null)
//				{
//					x=x.next;
//				//	 count++;
//				}
					int j=size();
				for(int i=0;i<j-2;i++)
				{
					x=x.next;
				}
			//x=x.next;
				x.next=null;
			//	count++;
				System.out.println(" kk  done ");
				
				}
				
			}
			
		}
	}


public class Linked_list_node {

	public static void main(String[] args)
	{
		llist ll=new llist();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
	    ll.add(777);
     	ll.addbeg(555); 	
		ll.deletebeg();
      	ll.insertAt(2,333); 	
		ll.show();

	}

}
