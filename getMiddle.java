 int getMiddle(Node head)
   {
       Node s=head;
       Node f=head;
       while(f!=null&&f.next!=null)
       {
            s=s.next;
            f=f.next.next;
       }
         return s.data;
   }
