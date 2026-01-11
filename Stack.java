public class Stack
{
    static final int MAXSIZE = 10;
	static int[] stack = new int[MAXSIZE];
	static int top = -1;
	static void push(int val){
	    if(top>=MAXSIZE){
	        System.out.println("Satck Overflow");
	        return;
	    }
	    stack[++top] = val;
	    System.out.println(val + " is pushed in the stack");
	}
	static void pop(){
	    if(top == -1){
	        System.out.println("Stack is Empty");
	        return;
	    }
	    System.out.println(stack[top--] + " is Popped");
	}
	static void peek(){
	    if(top == -1){
	        System.out.println("Stack is Empty");
	        return;
	    }
	    System.out.println(top +" is top of stack");
	}
	public static void main(String[] args) {
	    push(10);
	    push(3);
	    pop();
	    peek();
	}
}