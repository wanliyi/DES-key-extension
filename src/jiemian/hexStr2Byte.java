package jiemian;

public class hexStr2Byte {
	public int[] h2bdeal(char[] hex,int lenth) {
	    int i=0;
	    int[] bt=new int[lenth];
	    for(int j=0;j<16;j++)
	    {
	    	if(hex[j]=='0')
	    	{
	    		bt[i]=0;
	    		bt[i+1]=0;
			    bt[i+2]=0;
			    bt[i+3]=0;
		    }
		    if(hex[j]=='1')
		    {
			    bt[i]=0;
			    bt[i+1]=0;
		        bt[i+2]=0;
			    bt[i+3]=1;
			}
		    if(hex[j]=='2')
		    {
			    bt[i]=0;
			    bt[i+1]=0;
			    bt[i+2]=1;
			    bt[i+3]=0;
		    }
		    if(hex[j]=='3')
		    {
			    bt[i]=0;
			    bt[i+1]=0;
			    bt[i+2]=1;
			    bt[i+3]=1;
		    }
			if(hex[j]=='4')
			{
				bt[i]=0;
				bt[i+1]=1;
				bt[i+2]=0;
				bt[i+3]=0;
			}
			if(hex[j]=='5')
			{
				bt[i]=0;
				bt[i+1]=1;
				bt[i+2]=0;
				bt[i+3]=1;
			}
			if(hex[j]=='6')
			{
				bt[i]=0;
				bt[i+1]=1;
				bt[i+2]=1;
				bt[i+3]=0;
			}
			if(hex[j]=='7')
			{
				bt[i]=0;
				bt[i+1]=1;
				bt[i+2]=1;
				bt[i+3]=1;
			}
			if(hex[j]=='8')
			{
				bt[i]=1;
				bt[i+1]=0;
				bt[i+2]=0;
				bt[i+3]=0;
			}
			if(hex[j]=='9')
			{
				bt[i]=1;
				bt[i+1]=0;
				bt[i+2]=0;
				bt[i+3]=1;
			}
			if(hex[j]=='A')
			{
				bt[i]=1;
				bt[i+1]=0;
				bt[i+2]=1;
				bt[i+3]=0;
			}
			if(hex[j]=='B')
			{
				bt[i]=1;
				bt[i+1]=0;
				bt[i+2]=1;
				bt[i+3]=1;
			}
			if(hex[j]=='C')
			{
				bt[i]=1;
				bt[i+1]=1;
				bt[i+2]=0;
				bt[i+3]=0;
			}		
			if(hex[j]=='D')
			{
				bt[i]=1;
				bt[i+1]=1;
				bt[i+2]=0;
				bt[i+3]=1;
			}
			if(hex[j]=='E')
			{
				bt[i]=1;
				bt[i+1]=1;
				bt[i+2]=1;
				bt[i+3]=0;
			}
			if(hex[j]=='F')
			{
				bt[i]=1;
				bt[i+1]=1;
				bt[i+2]=1;
				bt[i+3]=1;
			}
			i=i+4;
	    }
		return bt;
	}
}
