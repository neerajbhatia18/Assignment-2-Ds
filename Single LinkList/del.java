import java.util.*;

class node
{
int data;
node next;//instance variable automatically get null value.

   node(int data1)
   {
     this.data=data1;
   }
}

class LinkedList
{
	node head;
     
    public void insert(int data)
    { 
	   node n=new node(data);

	   if(head==null)
	   {
	   	head=n;
	   }
       else
       {
       	node current;
       	current=head;
       	while(current.next!=null)
       	{
       		current=current.next;
       	}
       	current.next=n;
        }

    }
    	

    	public void traverse()
    	{
    		if(head==null)
    		{
    			System.out.println("List is empty");

    		}
    		else
    		{   node  current;
    			current=head;
    			System.out.println("List Elements are:");
    			while(current!=null)
    			{
    				System.out.println(current.data);
    				current=current.next;

    			}

    		}
    	}



    public void insertPos(int data,int pos)
    {

    }
    public void deleteBeg()
    {
      if(head==null)
      {
        System.out.println("List is empty");
      }
      else
      {
        node temp=head;
        head=temp.next;
        temp.next=null;
      }
    }

    public void deleteEnd()
    {
         if(head==null)
         {

         }
         else
         {
          node current;
          node pre;
          pre=head;
          current=head;

          while(current.next!=null)
          {
            pre=current;
            current=current.next;
          }
             if(pre==current)
            {
                head=null;
            }
            pre.next=null;
            

         }
    }


}

 




class lldel
{
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
    list.deleteBeg();
    list.deleteEnd();
		list.traverse();
		
	}
}
