package programming;

import java.util.*;

public class ipset {
	public static ArrayList<String> createip(String ipcollection, int length) {
		if(ipcollection.length()<3||ipcollection.length()>12)
			return (new ArrayList<>());
		return(createiplist(ipcollection,length));
	}
	
	public static ArrayList<String> createiplist(String ipcollection, int length){
		ArrayList<String> resultlist=new ArrayList<String>();
		String snew=ipcollection;
		
		for(int i=1;i<length-2;i++) {
			for(int j=i+1;j<length-1;j++) {
				for(int k=j+1;k<length;k++) {
					
					snew=snew.substring(0,k)+"."+snew.substring(k);
					snew=snew.substring(0,j)+"."+snew.substring(j);
					snew=snew.substring(0, i)+"."+snew.substring(i);
					
					if(isValid(snew)) {
						resultlist.add(snew);
					}
					
					snew=ipcollection;
				}
			}
		}
		
		Collections.sort(resultlist, new Comparator<String>() 
		{
			public int compare(String s1, String s2) {
				String[] snew1=s1.split("[.]");
				String[] snew2=s2.split("[.]");
				
				int result=-1;
				for(int i=1;i<4&&result!=0;i++) {
					result=snew1[i].compareTo(snew2[i]);
				}
				
				return result;
			}
		});
		
		return resultlist;
	}
	
	public static boolean isValid(String oneip) {
		String[] oneipset=oneip.split("[.]");
		for(String s: oneipset) {
			int num=Integer.parseInt(s);
			if(s.length()>3||num<0||num>255)
				return false;
			if(s.length()>1 && num==0)
				return false;
			if(s.length()>1 && num!=0 && s.charAt(0)=='0')
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		String ipcollection="25525511135";
		int length=ipcollection.length();
		System.out.println("Set of valid ip addresses are:"+(createip(ipcollection,length).toString()));
		System.exit(0);

	}

}
