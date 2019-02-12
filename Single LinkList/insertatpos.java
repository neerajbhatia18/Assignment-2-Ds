import java.util.*;

class node
{
 
int data;

node next;

   node(int data1)
   {
     this.data=data1;
   }
}

class LinkedList
{   Scanner s=new Scanner(System.in);
	node head;
  int count=0;
     
    public void insert(int data)
    { 
	   node n=new node(data);

	   if(head==null)
	   {
	   	head=n;
      count++;
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
        count++;
        }

    }
    
    	

    	public void traverse()
    	{
    		if(head==null)
    		{
    			System.out.println("List is empty");

    		}
    		else
    		{ node  current;
    			current=head;
    			System.out.println("List Elements are:");
    			while(current!=null)
    			{
    				System.out.println(current.data);
    				current=current.next;

    			}

    		}
    	}

      public void insertatpos(int p){
        
        if((count+1)>=p && p>1)
        {  
           System.out.println("Inset data value for new node");
        node l=new node(s.nextInt());
           node current;
           current=head;
           for(int i=1;i<(p-1);i++)
           {
            current=current.next;
           }
           l.next=current.next;
           current.next=l;
        }
         else
         {
          if(p>(count+1))
          {System.out.println("Position is greator than the size of LinkedList");}
          if(p<0)
          {System.out.println("Insert position greator than 0");}
          
         }        
       }

    	
}

 




class llinsatpos
{   
	public static void main(String[] args) 
	{ Scanner s=new Scanner(System.in);
		LinkedList list=new LinkedList();
    System.out.println("How many Nodes you want");
    int n=s.nextInt();
    System.out.println("Enter Elements");
    for(int i=0;i<n;i++)
    {
      list.insert(s.nextInt());
    }
		System.out.println("Insert Pos at which u want to insert Element");
    int p=s.nextInt();
    list.insertatpos(p);
	  list.traverse();
		}
}
