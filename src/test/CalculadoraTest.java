package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.Timeout;

import Prueba.Calculadora;
import junit.framework.Assert;

class CalculadoraTest {

	@Test
	void testSuma() {
	
		assertEquals(9,Calculadora.suma(6,3));
	}
	@Test
	void testResta() {
	
		assertEquals(3,Calculadora.resta(9,6));
	}
	@Test
	void testDivision() {
		
		assertEquals(2,Calculadora.divide(8,4));
	}
	@Test
	void testMultiplicacion() {
		
		assertEquals(18,Calculadora.multiplicar(6,3));
	}
	
	
	//FASE 2
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest SUMA CSV SOURCE")
	@CsvSource({"2,3,5","-1,5,4","0,0,0"})
void testAddParameterizedCsvsource(int valor1, int valor2, int esperado) {
		int result = Calculadora.suma(valor1, valor2);
		Assert.assertEquals(result, esperado);
	
}
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest Resta CSV SOURCE")
	@CsvSource({"4,3,1","4,5,-1","0,0,0"})
void testAddParameterizedCsvsource1(int valor1, int valor2, int esperado) {
		int result = Calculadora.resta(valor1, valor2);
		Assert.assertEquals(result, esperado);
	
}
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest Resta CSV SOURCE")
	@CsvSource({"4,3,12","4,5,20","0,0,0"})
void testAddParameterizedCsvsource2(int valor1, int valor2, int esperado) {
		int result = Calculadora.multiplicar(valor1, valor2);
		Assert.assertEquals(result, esperado);
	
}
	
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest Resta CSV SOURCE")
	@CsvSource({"2,2,1","10,2,5","100,10,10"})
void testAddParameterizedCsvsource3(int valor1, int valor2, int esperado) {
		int result = Calculadora.divide(valor1, valor2);
		Assert.assertEquals(result, esperado);
	
}
	
	//FASE 3
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest CSV SOURCE FILE")
	@CsvFileSource(resources = "datos.csv")
	void testAddParameterizedCsvFIleSourceSuma(int valor1, int valor2,int esperado) {
		int result = Calculadora.suma(valor1, valor2);
		Assert.assertEquals(result,esperado);
	}
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest CSV SOURCE FILE")
	@CsvFileSource(resources = "datosResta.csv")
	void testAddParameterizedCsvFIleSourceResta(int valor1, int valor2,int esperado) {
		int result = Calculadora.resta(valor1, valor2);
		Assert.assertEquals(result,esperado);
	}
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest CSV SOURCE FILE")
	@CsvFileSource(resources = "datosMultiplicar.csv")
	void testAddParameterizedCsvFIleSourceMultiplicar(int valor1, int valor2,int esperado) {
		int result = Calculadora.multiplicar(valor1, valor2);
		Assert.assertEquals(result,esperado);
	}
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest CSV SOURCE FILE")
	@CsvFileSource(resources = "datosDividir.csv")
	void testAddParameterizedCsvFIleSourcedividir(int valor1, int valor2,int esperado) {
		int result = Calculadora.divide(valor1, valor2);
		Assert.assertEquals(result,esperado);
	}
	
	//FASE 4
	
	@Test
	@DisplayName("Divisor cero Error")
	void testDivisorCero(){
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, ()-> {
			Calculadora.divide(5, 0);
				});
				}
	

	//FASE 5	
	@Test
    @Timeout(2)
    public void testTemporal() {
        Calculadora calculator = new Calculadora();
        calculator.divide(5, 2);
    }
	
	

}