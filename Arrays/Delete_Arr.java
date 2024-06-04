public class Delete_Arr 
{ static int count = 5; 
  public static void main(String[] args) 
  { int a[]={12,34,45,6,13};
    Delete_Arr obj=new Delete_Arr();
    obj.print(a);

    /* obj.del_from_end(a);
    obj.print(a);
        
    obj.del_value(a,111);
    obj.print(a);
    */
    obj.del_from_pos(a,2);
    obj.print(a);
    
  }

  public void del_from_pos(int a[],int pos)
  { if(pos>count || pos<=0)
    { System.out.println("Invalid Position");
      return;
    }
    for(int i=pos-1;i<count-1;i++)
    { a[i]=a[i+1];
    }
    count--;
  }
    
  public void del_from_end(int a[])
  { if(a.length<=0)
    return;
    count--;
  }
    
  public void del_value(int a[],int val)
  { int i;
    for(i=0;i<count;i++)
    { if(a[i]==val)
      { break; }
    }
    
    if(i==count)
    { System.out.println("Value doesn't exists in array");
      return;
    }
    for(int j=i;j<count-1;j++)
    {  a[j]=a[j+1];
    }
    count--;
  }

  public void print(int a[])
  { for(int i=0;i<count;i++)
    {  System.out.println(a[i]+" ");
    }
    System.out.println();
  }
}  
