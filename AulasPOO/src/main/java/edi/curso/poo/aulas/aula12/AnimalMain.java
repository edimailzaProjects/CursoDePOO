package edi.curso.poo.aulas.aula12;

public class AnimalMain
{
    public static void main(String[] args)
    {
        Ave ave = new Ave();
        Mamifero mamifero = new Mamifero();
        Peixe peixe = new Peixe();
        Reptil reptil = new Reptil();
        
        mamifero.setIdade(5);
        mamifero.setCorPelo("Caramelo");
        mamifero.setMembros(4);
        mamifero.setPeso(10f);
        mamifero.emitirSom();
        mamifero.alimentar();
        mamifero.locomover();
        System.out.println(mamifero.toString());        
        
        Mamifero m = new Canguru(); // <--------- ATENÇÃO
        m.setIdade(8);
        m.setCorPelo("Bege");
        m.setMembros(4);
        m.setPeso(100f);
        m.emitirSom();
        m.alimentar();
        m.locomover();
        System.out.println(m.toString());
        
        ave.setIdade(15);
        ave.setCorPena("Verde");
        ave.setPeso(0.2f);
        ave.setMembros(2);
        ave.emitirSom();
        ave.alimentar();
        ave.locomover();
        System.out.println(ave.toString());        
        
        peixe.setIdade(3);
        peixe.setCorEscama("Dourada");
        peixe.setMembros(0);
        peixe.setPeso(0.2f);
        peixe.emitirSom();
        peixe.alimentar();
        peixe.locomover();
        System.out.println(peixe.toString());
        
        reptil.setIdade(3);
        reptil.setCorEscama("Verde");
        reptil.setMembros(0);
        reptil.setPeso(0.2f);
        reptil.emitirSom();
        reptil.alimentar();
        reptil.locomover();
        System.out.println(reptil.toString());
    }

}
