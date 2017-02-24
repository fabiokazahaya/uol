package br.com.uol.testes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import br.com.uol.exercicio1.SolutionImpl1;

@RunWith(JUnitPlatform.class)
public class TesteSolution1 {
	
	@Test
	public void teste() {
		
		SolutionImpl1 solution = new SolutionImpl1();
		
		assertTrue(solution.getValue("abcdef"));
		assertFalse(solution.getValue("abcdefb"));
		assertTrue(solution.getValue("abc"));
		assertFalse(solution.getValue("abcb"));
		assertFalse(solution.getValue("hhjalkaia"));
		assertTrue(solution.getValue("hijklmnop"));
		
	}
}



