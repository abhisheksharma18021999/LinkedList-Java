   
    public boolean isIdentical (Node head1, Node head2)
    {
   
       while (head1 != null && head2!= null)
       {
       if((head1.data & head2.data) != head1.data )
       return false;
       head1 =head1.nxt;
       head2 = head2.next;
       }
        return true;  
    }
