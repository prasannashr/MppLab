package lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountWordsLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = new ArrayList();
		str.add("apple");
		str.add("banan");
		str.add("Orang");
		str.add("asdfg");
		System.out.println(countWords(str,'a','r',5));
	}
	public static int countWords(List<String> words, char c, char d, int len){

		
		int counter = (int) words.stream()
		.filter(word -> word.length() == len)
		.filter(word -> (word.indexOf(c) >= 0))
		.filter(word -> (word.indexOf(d) == -1))
		.count();
		
		return counter;
	}

}
