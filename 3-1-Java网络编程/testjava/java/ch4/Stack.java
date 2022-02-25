public class Stack
{
	char[] stack;
	int size;
	int tos=0;
	
	Stack(int s){
		size=s;
		stack=new char[size];
		
	}
	
	void push(char ch){
		if(tos==size){
			System.out.println("The stack is full");
			return;}
			stack[tos++]=ch;
	}
	
	char pop(){
		if(tos==0){
			System.out.println("The stack is empty");
			return 0;}
			tos--;
			return stack[tos];
	}
	
	public static void main(String[] args){
		Stack s=new Stack(26);
		for(char ch='a';ch<='z';ch++)
		   s.push(ch);
		for(int i=0;i<26;i++)
		   System.out.print(s.pop()+" ");
	}
}