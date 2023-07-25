package com.conversation;

public class timeconversationfile {

	public static String getTimeValues(String opt, String num) {
		// TODO Auto-generated method stub
		int opttype=Integer.parseInt(opt);
		double number=(long) Integer.parseInt(num);
		double res;
		if(opttype==201) {
			res=number/60;
			return res+" min";
		}
		else if(opttype==202) {
			res=number*60;
			return res+" sec";
		}
		else if(opttype==203) {
			res=(number/60)/60;
			return res+" hour";
			
		}
		else if(opttype==204) {
			res=number*60*60;
			return res+" sec";
			
		}
		else if(opttype==205) {
			res=number/60;
			return res+" hour";
		}
		else if(opttype==206) {
			res=number*60;
			return res+" min";
		}
		else if(opttype==207) {
			res=number*24;
			return res+" hours";
		}
		else if(opttype==208) {
			res=number*24*60;
			return res+" min";
		}
		else if(opttype==209) {
			res=number*24*60*60;
			return res+" sec";
		}
		else {
		
		return "error";
		}
	}

}
