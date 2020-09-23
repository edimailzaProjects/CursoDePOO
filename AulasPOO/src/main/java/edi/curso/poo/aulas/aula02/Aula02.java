package edi.curso.poo.aulas.aula02;

public class Aula02
{
    public static void main(String[] args)
    {
        //Naturalidade
        
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = (float) 0.5;
        c1.modelo = "Bic";
        
        c1.rabiscar();
        c1.tampar();
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.cor = "Verde";
        c2.ponta = (float) 1.0;
        c1.modelo = "Stabillo";
        
        c2.destampar();
        c2.rabiscar();
        c2.status();
        
        
        
    }

}
