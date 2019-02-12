//This Code contains functions to add or delete at a specific Position in a Linked List

import java.util.*;

class node
{
node pre;
int data;
node next;//instance variable automatically get null value.

   node(int data1)
   {
     this.data=data1;
   }
}

class DoublyLinkedList
{
	node head;
  node tail;
    

     

        public void traverse()
    	{
    		 if(head==null)
    		 {
    		 	System.out.println("List is empty");

    		 }
    		 else
    		 {  node  current;
    			 current=head;
    			 System.out.println("List Elements are:");
    			 while(current!=null)
    			 {
    				System.out.println(current.data);
    				current=current.next;
           }

    		 }
    	}

      public void insertBeg(int data)
      {
          node n=new node(data);
         if(head==null)
         {
          head=n;
          tail=n;
         }
         else
         {  head.pre=n;
            n.next=head;
            head=n;

         }   
      }

    	

      public void insertEnd(int data)
      { 
        node n=new node(data);
        if(head==null)
        {
          head=n;
          tail=n;
        }
        else
        {
          tail.next=n;
          n.pre=tail;
          tail=n;
        } 
      }

      public void deleteBeg()
      {
         if(head==null)
          {
             System.out.println("List is Empty");
          }
          else if(head==tail){
            head=null;
            tail=null;
          }
          else
          {
            node current;
            current=head.next;
            head=current;
            head.pre=null;
          } 
      }

      public void deleteEnd()
      {
         if(head==null)
          {
             System.out.println("List is Empty");
          }
         else if(head.next==null)
         {
          head=null;
          tail=null;
         }
          else
          {
            tail.pre.next=null;
            tail=tail.pre;
          } 
      }
   
}

 




class MyLinkList
{
	public static void main(String[] args) 
	{ 

		DoublyLinkedList list=new DoublyLinkedList();
    Scanner s=new Scanner(System.in);
    System.out.println("How many Nodes You Want?");
    int n=s.nextInt();
    System.out.println("Enter Elements");
    for(int i=0;i<n;i++)
    {
      list.insertEnd(s.nextInt());
    }
    list.insertBeg(5);
    list.traverse();
    System.out.println("Delete fuctions Starts!");
    list.deleteBeg();
    list.deleteEnd();
    list.traverse();
   

	}
}
