package com.ricardofarias.ctc;


import com.ricardofarias.ctc.utils.CriaPalindromo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes para o palíndromo.")
class PalindromoTest {

    private Palindromo palindromo;

    @BeforeEach
    void setUp() {
        palindromo = new Palindromo.PalindromoBuilder().build();
    }

    @Test
    @DisplayName("Retorna mensagem é palíndromo.")
    void deveRetornar_MensagemPalindromoValido() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoValido();

        Assertions.assertEquals("A palavra é palíndromo!", palindromo.resultado());
    }

    @Test
    @DisplayName("Retorna mensagem Não é palíndromo.")
    void deveRetornar_MensagemPalindromoInvalido() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoInValido();

        Assertions.assertEquals("A palavra NÃO é palíndromo!", palindromo.resultado());
    }

    @Test
    @DisplayName("Retorna exception ao informar uma palavra vazia.")
    void deveRetornar_ExceptionPalavravalido_AoInformarUmaPalavraVazia() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoComPalavraEmBranco();

        String resultado = palindromo.resultado();

        Assertions.assertEquals("A palavra não é válida! Por favor, informe outra palavra.", resultado);
    }

    @Test
    @DisplayName("Retorna exception ao informar uma palavra null.")
    void deveRetornar_ExceptionPalavraInvalida_AoInformarUmaPalavraNulla() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoPalavraNull();

        String resultado = palindromo.resultado();

        Assertions.assertEquals("A palavra não é válida! Por favor, informe outra palavra.", resultado);
    }

    @Test
    @DisplayName("Retorna palíndromo VÁLIDO ao infomar o parâmetro case sensitive com true.")
    void deveRetornar_PalindromoValido_ComCaseSensitive() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoValidoComCaseSensitive();

        String resultado = palindromo.resultado();

        Assertions.assertEquals("A palavra é palíndromo!", resultado);
    }

    @Test
    @DisplayName("Retorna palíndromo VÁLIDO ao infomar palavra com case sensitive.")
    void deveRetornar_PalindromoInvalido_ComCaseSensitive() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoInvalidoComCaseSensitive();

        String resultado = palindromo.resultado();

        Assertions.assertEquals("A palavra NÃO é palíndromo!", resultado);
    }

    @Test
    @DisplayName("Retorna palíndromo VÁLIDO ao infomar palavra com espaço em branco.")
    void deveRetornar_PalindromoValido_PalavraComEspacoEmBranco() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoValidoComEspacoEmBranco();

        String resultado = palindromo.resultado();

        Assertions.assertEquals("A palavra é palíndromo!", resultado);
    }

    @Test
    @DisplayName("Retorna palíndromo VÁLIDO ao infomar uma frase palíndromo.")
    void deveRetornar_PalindromoValido_Frase() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoFraseValida();

        String resultado = palindromo.resultado();

        Assertions.assertEquals("A palavra é palíndromo!", resultado);
    }

    @Test
    @DisplayName("Retorna palíndromo VÁLIDO ao infomar uma frase com acentos.")
    void deveRetornar_PalindromoValido_FraseComAcentos() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoFraseValidaComAcentos();

        String resultado = palindromo.resultado();

        Assertions.assertEquals("A palavra é palíndromo!", resultado);
    }

    @Test
    @DisplayName("Retorna palíndromo INVÁLIDO ao infomar uma frase.")
    void deveRetornar_PalindromoInvalido_FraseNãoPalindromo() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoFraseInvalida();

        String resultado = palindromo.resultado();

        Assertions.assertEquals("A palavra NÃO é palíndromo!", resultado);
    }

    @Test
    @DisplayName("Retorna palindromo INVÁLIDO ao infomar palavra com espaço em branco.")
    void deveRetornar_PalindromoInvalido_PalavraComEspacoEmBranco() {
        Palindromo palindromo = CriaPalindromo.criaPalindromoInvalidoComEspacoEmBranco();

        String resultado = palindromo.resultado();

        Assertions.assertEquals("A palavra NÃO é palíndromo!", resultado);
    }
}
