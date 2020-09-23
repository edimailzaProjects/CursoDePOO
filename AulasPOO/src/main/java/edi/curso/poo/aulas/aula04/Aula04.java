package edi.curso.poo.aulas.aula04;



public class Aula04
{
    public static void main(String[] args) {
        Caneta04 c1 = new Caneta04(); // construtor vazio, pois se fizer só o outro ele fica como o de baixo
        Caneta04 c2 = new Caneta04("Verde", 0, 0, false, null);// construtor com parâmetros
        
        c1.status();
        c2.status();      
        
    }
  

}
