package br.com.fiap.calculadora.dominio;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	Calculadora calculadora = new Calculadora();

	@Test
	void testSomarDoisNumeros() {
		double soma = calculadora.somar(1, 2);	
		assertEquals(3, soma, 0);
	}
	@Test
	void testSubtrairDoisNumeros() {
		double subtracao = calculadora.subtrair(5, 2);
		assertEquals(3, subtracao, 0);
	}
	@Test
	void testMultiplicacaoDoisNumeros() {
		double multiplicacao = calculadora.multiplicar(2, 2);
		assertEquals(4, multiplicacao, 0);
	}
	@Test
	void testDivisaoDoisNumeros() {
		double divisao = calculadora.dividir(10, 2);
		assertEquals(5, divisao, 0);
	}
	
}
