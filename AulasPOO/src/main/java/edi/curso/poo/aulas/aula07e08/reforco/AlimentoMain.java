package edi.curso.poo.aulas.aula07e08.reforco;

public class AlimentoMain
{
    public static void main(String[] args)
    {
        Alimento alimento[]=new Alimento [3];
                
        alimento[0]= new Alimento("Frango", "Congelado", "Fria");
        
        AirFryer airFryer = new AirFryer();
        airFryer.fritar(alimento[0], false);
        
        //falta corrigir os caminhos "Não felizes"
    }

}
