package com.conversation;

public class ConversationNumber {
	public static String getValues(String operation, String number) {
		Conversion cc = new Conversion();
		Long ll = (long) Integer.parseInt(operation);
		String res1="";
		if (ll == 101) {
			Long l = (long) Integer.parseInt(number);
			String bin = "";
			Long rem;
			while (l > 0) {
				rem = l % 2;
				bin = rem + bin;
				l /= 2;
			}
			return bin;
		} else if (ll == 102) {
			Long l = (long) Integer.parseInt(number);
			long res = cc.Convert(l);
			if (res == -1) {
				return l + " is not a BINARY NUMBER";

			} else {
				return res+"";
			}
		} else if (ll == 103) {
			float l = Float.valueOf(number);
			String le = String.valueOf(l * 100);
			String lem = le.substring(0, 7);
			return lem + "%";

		} else if (ll == 104) {
			float l = Float.valueOf(number);
			String lee = String.valueOf(l / 100);
			return lee;

		} else if (ll == 105) {
			char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
			int rem;
			String hexd = "";
			int l = Integer.parseInt(number);
			while (l > 0) {
				rem = l % 16;
				hexd = ch[rem] + hexd;
				l /= 16;
			}
			return hexd;

		} else if (ll == 106) {

			char ch;
			int k = number.length() - 1;
			long sum = (long) 0;
			for (int i = 0; i < number.length(); i++) {
				ch = number.charAt(i);
				int c = (int) ch - 48;
				if (c <= 9) {
					sum += (long) ((long) c * Math.pow(16, k));
					k--;
				} else {
					c = c - 7;
					sum += (long) ((long) c * Math.pow(16, k));
					k--;
				}
			}
			return sum + " ";
		} else if (ll == 107) {
			char ch;
			int k = number.length() - 1;
			long sum = (long) 0;
			for (int i = 0; i < number.length(); i++) {
				ch = number.charAt(i);
				int c = (int) ch - 48;
				if (c <= 9) {
					sum += (long) ((long) c * Math.pow(16, k));
					k--;
				} else {
					c = c - 7;
					sum += (long) ((long) c * Math.pow(16, k));
					k--;
				}
			}
			String bin = "";
			Long rem;
			while (sum > 0) {
				rem = sum % 2;
				bin = rem + bin;
				sum /= 2;
			}
			return bin;
		}
		else if(ll==108) {
			Long l = (long) Integer.parseInt(number);
			long res = cc.Convert(l);
			char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
			int rem;
			String hexd = "";
			int hex =(int) (res);
			while (hex > 0) {
				rem = hex % 16;
				hexd = ch[rem] + hexd;
				hex /= 16;
			}
			return hexd;
			
		}
		else if(ll==109) {
			char ch=number.charAt(0);
			return (int)ch+"";
			
		}
		else if(ll==110) {
			Long l = (long) Integer.parseInt(number);
			for(int i=1;i<=l;i++) {
				if(l%i==0) {
					res1=res1+" "+i;
				}
			}
			return res1;
		}
		else if(ll==111) {
			Long l=(long) Integer.parseInt(number);
			int sum=0;
			for(int i=1;i<=l;i++) {
				if(l%i==0) {
					sum+=i;
				}
			}
			return sum+"";
		}
		else {
			return "error";
		}

	}

}

class Conversion {
	public long Convert(long n) {
		long sum = 0, k = -1, rem;

		while (n > 0) {
			rem = n % 10;
			if (rem > 1) {
				return -1;
			}
			k++;
			if (rem == 1) {
				sum = (long) Math.pow(2, k) + sum;
			}
			n = n / 10;
		}
		return sum;

	}
}