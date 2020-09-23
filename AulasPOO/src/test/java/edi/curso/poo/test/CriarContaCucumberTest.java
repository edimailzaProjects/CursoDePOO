package edi.curso.poo.test;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import edi.curso.poo.aulas.aula05.reforco.ContaBanco;
import edi.curso.poo.aulas.aula05.reforco.CriarContaServico;
import edi.curso.poo.aulas.aula05.reforco.GeradorIdsUtils;

public class CriarContaCucumberTest
{
    ContaBanco conta = new ContaBanco();
    CriarContaServico criar = new CriarContaServico();
    
    @Dado("que informo meu {string}")
    public void que_informo_meu(String donoConta) {
        conta.setDono(donoConta);
        
    }

    @Dado("escolho o tipo de {string}")
    public void escolho_o_tipo_de(String tipoConta) {
        conta.setTipo(tipoConta);
        
    }

    @Quando("o gerente inserir o numero da conta")
    public void o_gerente_inserir_o_numero_da_conta() {
        conta.setNumConta(GeradorIdsUtils.gerarId());
        
    }

    @Entao("o sera exibida a {string}")
    public void o_sera_exibida_a(String mensagem) {
        String obtido = criar.abrirConta(conta.getNumConta(), conta.getTipo(), conta.getDono());
        String esperado = mensagem;
        Assert.assertEquals(obtido,esperado);      
    }

}
