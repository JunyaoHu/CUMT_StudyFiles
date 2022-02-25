class HalfDollars{
	public static void main(String[] args){
		int[] denver={15000006,18810000,20752110};
		int[] philadelphia=new int[denver.length];
		int[] total=new int[denver.length];
		int average;
		
		philadelphia[0]=15020000;
		philadelphia[1]=18709000;
		philadelphia[2]=21348000;
		
		total[0]=denver[0]+philadelphia[0];
		total[1]=denver[1]+philadelphia[1];
		total[2]=denver[2]+philadelphia[2];
		average=(total[0]+total[1]+total[2])/3;
		
		System.out.println("1993 production:"+total[0]);
		System.out.println("1994 production:"+total[1]);
		System.out.println("1995 production:"+total[2]);
		System.out.println("Average production:"+average);
	}
}