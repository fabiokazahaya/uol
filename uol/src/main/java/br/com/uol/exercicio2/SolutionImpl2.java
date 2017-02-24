package br.com.uol.exercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionImpl2 implements Solution2 {

	@Override
	public Integer getValue(Integer[] ratings) {
		
		List<Integer> list = Arrays.asList(ratings);
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			
			Aluno aluno = new Aluno();
			aluno.setNota(list.get(i));
			aluno.setQuantidadeDoces(list.get(i));
			alunos.add(aluno);
			
		}
		
		return list.stream().mapToInt(Integer::intValue).sum();
	}
	
	private class Aluno {
		
		public Aluno(){}
		
		public void setNota(int nota) {
		}
		
		public void setQuantidadeDoces(int quantidadeDoces) {
		}
	}
	
	public static void main(String args[]) {
		
		SolutionImpl2 solution = new SolutionImpl2();
		System.out.println(solution.getValue(new Integer[] {4, 3, 1, 2}));
		System.out.println(solution.getValue(new Integer[] {1, 2}));
		
	}
}



