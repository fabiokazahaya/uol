package br.com.uol.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class SolutionImpl1 implements Solution1 {

	@Override
	public boolean getValue(String input) {
		
		List<Long> listOfCountChars = new ArrayList<Long>();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			listOfCountChars.add(input.chars().filter(ch -> ch == c).count());
		}
		
		return !(listOfCountChars.stream().mapToLong(Long::intValue).sum() > listOfCountChars.size());
		
	}
}



