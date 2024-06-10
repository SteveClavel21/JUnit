package operacionesmatematicas;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculadoraTest {
Calculadora calculadora;
    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }



    @AfterEach
    void tearDown() {
        calculadora=null;
    }

    @BeforeAll
    static void aliniciarlaspruebas(){
        System.out.println("Iniciar todas las pruebas");
    }
    @AfterAll
    static void alfinalzartodaslaspruebas(){
        System.out.println("Finalizar las pruebas");
    }

    @Test
    @Order(1)
    void sumar() {
        int num1=5;
        int num2=6;
        int resultadoEsperado = 11;

        int resultado = calculadora.sumar(num1,num2);
        assertEquals(resultadoEsperado,resultado);

    }

    @Test
    @Order(2)
    void restar() {

            int num1 = 10;
            int num2 = 6;
            int resultadoEsperado = 4;

            int resultado = calculadora.restar(num1, num2);
            assertTrue(resultadoEsperado == resultado);
        }


    @Test
    @Order(2)
    void multiplicar() {

        int num1 = 10;
        int num2 = 6;
        int resultadoEsperado = 60;

        int resultado = calculadora.multiplicar(num1, num2);
        if (resultadoEsperado != resultado) {
            fail("fallo la multiplicacion");
        }

    }
    @Test
    @Order(2)
    void dividir() {

        int num1=10;
        int num2=0;
        int resultadoEsperado = 0;
if(num2!=0){
        int resultado = calculadora.dividir(num1,num2);
        if (resultadoEsperado!=resultado){
            fail("fallo la division");
        }
}
        else{
        assertThrows(ArithmeticException.class,
                () ->{
            int result = calculadora.dividir(num1,num2);
                });
        }
    }
}
