package com.test;

import java.util.ArrayList;
import java.util.List;

public class IPV4OrIPV6 {

	public static void main(String[] args) {
		String[] arr = {  "this line has junk text", "121.18.19.20", "1050:1000:1000:a000:5:600:300c:326b" };
		
		String[] response = check_IP(arr);
		for (int i = 0; i < response.length; i++) {
			String string = response[i];
			System.out.println(string);
		}
		
	}
	
    static String[] check_IP(String[] s) {
    	
    	List<String> response = new ArrayList<>();
    	for (int i = 0; i <= s.length -1; i++) {
			String string = s[i];
			if(isIPV4(string)) {
				response.add("IPv4");
			} else if(isIPV6(string)) {
				response.add("IPv6");
			} else {
				response.add("Neither");
			}
		}

    	return response.toArray(new String[response.size()]);
    }
    
    static boolean isIPV4(String s) {
    	try {
    		String[] split = s.split("\\.");
    		if(split.length != 4) {
    			return false;
    		}
    		
    		// Se todos sao inteiros.
    		for (String string : split) {
				Integer i = new Integer(string);
				if(i < 0 || i > 255) {
					return false;
				}
			}
    		
    		return true;
    	} catch (Exception e) {
    		return false;
    	}
    }
    
    static boolean isIPV6(String s) {
    	try {
    		String[] split = s.split(":");
    		if(split.length != 8) {
    			return false;
    		}
    		
    		// Se todos sao hexas.
    		for (String string : split) {
				long i = Long.parseLong(string, 16);
			}
    		
    		return true;
    	} catch (Exception e) {
    		return false;
    	}
    }
}
