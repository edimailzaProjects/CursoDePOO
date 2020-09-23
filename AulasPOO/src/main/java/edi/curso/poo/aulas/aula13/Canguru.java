package edi.curso.poo.aulas.aula13;

public class Canguru extends Mamifero
{
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    
    @Override
    public void locomover() { //só vai funcionar para Canguru
        System.out.println("Saltando");
    }

}
