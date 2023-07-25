package com.conversation;
public class NumberSeriesCal {

	public static String getNumberSeriesValues(String opt, String range1, String range2) throws NumberFormatException {
		// TODO Auto-generated method stub
		int op=Integer.parseInt(opt);
		int r2=Integer.parseInt(range2);
		int r1=Integer.parseInt(range1);
		String res="";
		if(op==301) {
			for(int i=r1;i<r2;i++) {
				int count=0;
				for(int j=1;j<i;j++) {
					if(i%j==0){
						count++;
					}
				}
				if(count==1) {
					res=res+" "+i;
				}
			}
			return res;
		}
		else if(op==302) {
			for(int i=r1;i<=r2;i++) {
				if(i%2!=0) {
					res=res+" "+i;
				}
			}
			return res;
		}
		else if(op==303) {
			for(int i=r1;i<=r2;i++) {
				if(i%2==0) {
					res=res+" "+i;
				}
			}
			return res;
		}
		else if(op==304) {
			for(int i=r1;i<=r2;i++) {
				res=res+" "+i;
			}
			return res;
		}
		else if(op==305) {
			int sum=0;
			for(int i=r1;i<=r2;i++) {
				sum+=i;
			}
			return res+sum;
		}
		else if(op==306) {
			int n1=0,n2=1,n3;
			for(int i=0;i<r2-1;i++) {
				n3=n1+n2;
				n1=n2;
				n2=n3;
				res=res+" "+n3;
			}
			return "Note:it wil return "+r2+" no of series"+"\n : 0 1 "+res;
		}
		else if(op==307) {
			int rem,sum;
			for(int i=r1;i<r2;i++) {
				sum=0;
				while(i>0) {
					rem=i%10;
					sum=sum*10+rem;
					i/=10;
					
				}
				res+=" "+sum;
			}
			return res;
		}
		else {
			
			return "palin"+res;
		}
		
	}

}
