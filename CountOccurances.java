import java.util.HashMap;

//Q. Count occurrence of each word in given string.

public class CountOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Java community. Welcome to the Java world. And Hello again. Java is magic";
		
		
		String[] words = str.split(" ");// splits the string based on white spaces and create a array of strings
		
		//create a hashmap where we'll add each word and will check occurrence
		HashMap<String, Integer> newMap = new HashMap<String, Integer>();
		for(String eachWord: words) {
			if(newMap.containsKey(eachWord)) {    			// containsKey() check whether word is already there in hashmap or not.
				newMap.put(eachWord, newMap.get(eachWord)+1);	// newMap.get() return the object that contains value associated with the key.
			}else {
				newMap.put(eachWord, 1);  // put method insets the entry in the map.
			}
		}
		System.out.println(newMap); //print the map to show occurences stored in the form of values of each word(key).
		
		

	}

}
