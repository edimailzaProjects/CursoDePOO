package edi.curso.poo.aulas.aula13;

public class AnimalMain
{
    public static void main(String[] args)
    {
        Cachorro cachorro = new Cachorro();
        cachorro.reagir("olá");
        cachorro.reagir(11);
        cachorro.reagir(false);
        cachorro.reagir(2, 12.8f);
        
    }
}