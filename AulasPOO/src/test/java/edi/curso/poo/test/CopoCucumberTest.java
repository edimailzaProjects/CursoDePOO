package edi.curso.poo.test;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import edi.curso.poo.aulas.aula02.reforco.Copo;


public class CopoCucumberTest
{
    Copo copo = new Copo();
    
    @Dado("que o copo adesivado de cor {string} esta destampado")
    public void que_o_copo_adesivado_de_cor_esta_destampado(String cor) {
        copo.setAdesivo(true);
        copo.setCor(cor);
        copo.setTampa(false);
        
    }

    @Quando("preencher o copo {string}")
    public void preencher_o_copo(String estadoCopo) {
        copo.setCapacidade(estadoCopo);
        
    }

    @Entao("o sera exibida a mensagem {string}")
    public void o_sera_exibida_a_mensagem(String mensagem) {
        
        String obtido = copo.encher(copo.getCapacidade());
        String esperado = mensagem;
        System.out.println(obtido);
        System.out.println(esperado);
        
        
        Assert.assertEquals(obtido,esperado);
    }

    @Entao("o copo estara com {string}")
    public void o_copo_estara(String capacidade) {
        String obtido = copo.statusCapacidadeCopo();
        String esperado = capacidade;
        Assert.assertEquals(obtido,esperado);
    }
    
    @Dado("que o copo adesivado de cor {string} esta tampado")
    public void queOCopoAdesivadoDeCorEstaTampado(String cor) {
        copo.setAdesivo(true);
        copo.setCor(cor);
        copo.setTampa(true);
    }

}
