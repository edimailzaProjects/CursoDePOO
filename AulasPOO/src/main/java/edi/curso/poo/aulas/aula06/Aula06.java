package edi.curso.poo.aulas.aula06;

public class Aula06
{
    public static void main(String[] args)
    {
        ControleRemotoEdi edi = new ControleRemotoEdi();
        ControleRemotoEdiService s = new ControleRemotoEdiService();
        
        s.desligarMudo();
        System.out.println(edi.isTocando());
        edi.setLigado(true);
        System.out.println(edi.isLigado());
        edi.setTocando(true);
        System.out.println(edi.isTocando());
        edi.setVolume(0);
        System.out.println(edi.getVolume());
        s.abrirMenu();
        
        
        ControleRemotoGuanabara c = new ControleRemotoGuanabara();
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.ligarMudo();
        c.desligarMudo();
        
        
        
    }

}
