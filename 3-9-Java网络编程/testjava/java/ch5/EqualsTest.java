class EqualsTest{
	public static void main(String[] arguments){
		String str1,str2;
		str1="Free the bound periodicals.";
		str2=str1;
		
		System.out.println("String1: "+str1);
		System.out.println("String2: "+str2);
		System.out.println("Same object? "+(str1==str2));
		
		str2=new String(str1);
		
		System.out.println("String1: "+str1);
		System.out.println("String2: "+str2);
		System.out.println("Same object? "+(str1==str2));
		System.out.println("Same value? "+str1.equals(str2));
		
		String str3,str4;
		str3="busy";
		str4="busy";
		System.out.println("String3: "+str3);
		System.out.println("String4: "+str4);
		System.out.println("Same object? "+(str3==str4));
		System.out.println("Same value? "+str3.equals(str4));
		
		String str5,str6;
		str5="str5busy";
		str6="str6busy";
		System.out.println("String5: "+str5);
		System.out.println("String6: "+str6);
		System.out.println("Same object? "+(str5==str6));
		System.out.println("Same value? "+str5.equals(str6));
		
	}
}