static Node segregate(Node head)
    {
        // add your code here
        Node x=head;
        int c0=0,c1=0,c2=0;
        while(x!=null)
        {
            
         if(x.data==0)
         {
             c0++;
         }
         if(x.data==1)
         {
             c1++;
         }
         if(x.data==2)
         {
             c2++;
         }
            x=x.next;
        }
        Node r=head;
        int u=0;
        int sc=0;
        while(r!=null)
        {
            if(u<c0)
            {
                r.data=0;
                u++;
            }
            else if(u<c1+c0)
            {
                r.data=1;
                u++;
            }
            else if(u<c2+c0+c1)
            {
                r.data=2;
                u++;
            }
            
            r=r.next;
        }

        return head;
    }
