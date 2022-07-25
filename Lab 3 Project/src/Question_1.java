import java.util.Stack;

public class Question_1 
{
	public static boolean checkBracketsBalanced(String expression)
	{
		Stack<Character> stack= new Stack<Character>();
	    for(int index = 0; index<expression.length();index++)
	    {
	    	char Character = expression.charAt(index);
	    	if(Character == '(' || Character == '{' || Character == '[')
	    	{
	    		stack.push(Character);
	    		continue;
	    	}
	    	if(stack.isEmpty())
	    		return false;
	    	char c;
	    	switch(Character)
	    	{
	    	case '}': 
	    		c = stack.pop();
	    		if(c =='(' || c =='[' )
	    			return false;
	    		break;
	    	case ')': 
	    		c = stack.pop();
	    		if(c =='[' || c =='{' )
	    			return false;
	    		break;
	    	case ']': 
	    		c = stack.pop();
	    		if(c =='(' || c =='{' )
	    			return false;
	    		break;
	    	}
	    }return (stack.isEmpty());
	}

	public static void main(String[] args) {
		System.out.println(checkBracketsBalanced("(({{[]}}))".trim()));

	}

}
