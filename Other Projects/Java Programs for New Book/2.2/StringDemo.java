public class StringDemo{
	public static void main(String[] args){
		String sentence = "Text processing is hard!";
		int position = sentence.indexOf("hard");
		System.out.println(sentence);
		System.out.println("The word \"hard\" starts at index " + position);

		sentence = sentence.substring(0, position) + "easy!";
		System.out.println(sentence);
	}
}