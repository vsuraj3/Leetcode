package leetode;

import java.util.ArrayList;
import java.util.List;

class MinStack
{
	List<Integer> al;
	int min;
    public MinStack() 
    {
        this.al=new ArrayList<Integer>();
        this.min=Integer.MAX_VALUE;
    }
    
    public void push(int x) 
    {
      this.al.add(x);  
      if(x<this.min) 
      {
    	min=x;  
      }
    }
    
    public void pop() 
    {
       int pop=al.remove(al.size()-1);
       if(pop==min) 
       {
    	this.min=Integer.MAX_VALUE;
    	for(int list:al) 
    	{
    		if(list<this.min)
    			this.min=list;
    	}
       }
    }
    
    public int top()
    {
    	return al.get(al.size()-1);
    }
    
    public int getMin() 
    {
        return this.min;
    }
}


