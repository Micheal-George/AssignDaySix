package com.Masai;

public class Cla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		   
	       

	        if(args.length==1)
	        {
	        	String s0 = args[0];
	        	int S1 = Integer.parseInt(s0);	
	        	int tot=1;
	        	for(int i=1;i<=S1;i++)
	        	{
	        	tot=tot*i;	
	        	}
	        	System.out.println(tot);
	        }
	        else if(args.length==2)
	        {String s0 = args[0];
	        String s1 = args[1];
	        	int S1 = Integer.parseInt(s0);
	        	int S2 = Integer.parseInt(s1);
	        	int S=S1-S2;
	        	if(S<0)
	        	{
	        		S=S*-1;
	        	}
	        	int tot=1;
	        	for(int i=1;i<=S;i++)
	        	{
	        	tot=tot*i;	
	        	}
	        	System.out.println(tot);
	        	
	        }
	        else if(args.length>2)
	        {
	        	System.out.println("Error");
	        }
//	        
//	        int i1 = Integer.parseInt(s1);
//	        System.out.println(i0 + i1);
	        
	}

}
