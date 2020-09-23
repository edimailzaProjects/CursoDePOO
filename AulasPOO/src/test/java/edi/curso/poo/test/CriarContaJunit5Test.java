package edi.curso.poo.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import edi.curso.poo.aulas.aula05.reforco.CriarContaServico;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class CriarContaJunit5Test
{    
    @Mock
    CriarContaServico criar;   
    
    @Test
    @DisplayName("Deve inserir um numero de conta válido")
    public void inserirNumeroConta_numeroValido_ok() {
        Mockito.when(criar.inserirNumeroConta(100l)).thenReturn("Numero da conta: 100.");     
    }
    
    @Test
    @DisplayName("Deve impedir um numero de conta nulo")
    public void inserirNumeroConta_valorNulo_nok() { 
        Mockito.when(criar.inserirNumeroConta(null)).thenReturn("null não é um dado válido.");
    }
    
    @Test
    @DisplayName("Deve impedir um numero de conta inválido")
    public void inserirNumeroConta_valorInvalido_nok() { 
        Mockito.when(criar.inserirNumeroConta(-1l)).thenReturn("-1 não é um dado válido.");
    }
    
    @Test
    @DisplayName("Deve inserir um nome válido")
    public void inserirNome_nomeValido_ok() {
        Mockito.when(criar.inserirDonoConta("Mamute")).thenReturn("Nome do proprietario: Mamute. ");     
    }
    
    @Test
    @DisplayName("Deve impedir um nome nulo")
    public void inserirNome_nomeNulo_nok() {
        Mockito.when(criar.inserirDonoConta(null)).thenReturn("Insira um nome válido. ");     
    }
    
    @Test
    @DisplayName("Deve impedir um nome em branco")
    public void inserirNome_nomeEmBranco_nok() {
        Mockito.when(criar.inserirDonoConta("")).thenReturn("Insira um nome válido. ");     
    }
    

}
