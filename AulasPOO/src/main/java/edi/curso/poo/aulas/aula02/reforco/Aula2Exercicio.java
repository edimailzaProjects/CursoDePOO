package edi.curso.poo.aulas.aula02.reforco;

public class Aula2Exercicio
{
    public static void main(String[] args)
    {
        Copo copo = new Copo();
        copo.setCor("Turquesa");
        copo.setAdesivo(true);
        copo.setTampa(false);
        copo.setCapacidade("Vazio");       
      
        System.out.println( copo.encher(copo.getCapacidade()));
        System.out.println();
        System.out.println(copo.statusCapacidadeCopo());       
    }
    
}
