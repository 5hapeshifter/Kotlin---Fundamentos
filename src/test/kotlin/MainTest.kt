//import org.junit.jupiter.api.*
//import kotlin.test.fail
//
//class MainTest {
//
//    @Test
//    @DisplayName("Teste metodo xxoo")
//    fun testCountXO() {
//        // forma de fazer varios asserts
//        Assertions.assertAll(
//            {Assertions.assertTrue(countXO("xxoo"))},
//            {Assertions.assertEquals(true, countXO("xxoo"))},
//            {Assertions.assertEquals(true, countXO("xxoo"))}
//        )
//
//    }
//
//    @Test
//    @Disabled
//    fun naoImplementada() {
//
//    }
//
//    @Test
//    fun testesParaFalhar() {
//        fail("Não posso terminar os testes sem esse metodo")
//    }
//
//    /*
//        Funcao assumption serve para a gente fazer o teste de um metodo usando o resultado trazido por outro metodo.
//        Quando o resultado nao for o esperado o teste nao falha, somente nao executa.
//     */
//    @Test
//    fun assumption() {
//        //Assumptions.assumeTrue(countXO("xxo"))
//        Assumptions.assumeTrue(countXO("xxoo"))
//        Assertions.assertTrue(abc())
//    }
//
//    @Test
//    fun exception() {
//        assertThrows<NullPointerException> { lancaException() }
//    }
//
//
//
//}