package com.chapter1.pg173;

public class StringWithUniqueCharactersWithOutExtraSpace {

	public static void main(String[] args) {
		
		String str3 = "Aa";
		String str2 = "Bab";
		String str1 = "aa";
		String str4 = "abcd";
	
		
		System.out.println("st1 has unique characters: " + uniqueCharacters(str1));
		System.out.println("st2 has unique characters: " + uniqueCharacters(str2));
		System.out.println("st3 has unique characters: " + uniqueCharacters(str3));
		
		System.out.println("st4 has unique characters: " + uniqueCharacters(str4));
	

		System.out.println( 1 << -32);
		System.out.println( 1 << 0);
	}

	//Not sure how this logic works
	//Need to revist. 
	private static boolean uniqueCharacters(String str) {
		if(str==null){
			return false;
		}
		str = str.trim();
		int[] hash  = new int[256];
		for(int i=0;i<str.length();i++){
			hash[str.charAt(i)]++;
			if(hash[str.charAt(i)]>1)
				return false;
		}
		return true;
	}

}
