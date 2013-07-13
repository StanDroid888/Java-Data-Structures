
public class PalidromeEvaluator {
	
	String stringToEvaluate;
	boolean isPaladrome = false;
	Stack<Object> charStack = new Stack<Object>(); 
	
	public PalidromeEvaluator(String stringToEvaluate) {
		super();
		this.stringToEvaluate = stringToEvaluate;
		this.isPaladrome = false;
		formatString();
		fillStack();
	}
	
	private String formatString() {
		String formattedString = stringToEvaluate.replaceAll(
				"([a-z]+)[?:!.,;\\s]*", "$1");

		System.out.println("FORMATTED:" + formattedString);

		return formattedString;
	}

	private void fillStack() {
		// TODO Auto-generated method stub
		
	}
	public String getStringToEvaluate() {
		return stringToEvaluate;
	}
	public void setStringToEvaluate(String stringToEvaluate) {
		this.stringToEvaluate = stringToEvaluate;
	}
	
	
	@Override
	public String toString() {
		return "PalidromeEvaluator [stringToEvaluate=" + stringToEvaluate
				+ ", isPaladrome=" + isPaladrome + ", charStack=" + charStack
				+ "]";
	}
	
	
	
	

}
