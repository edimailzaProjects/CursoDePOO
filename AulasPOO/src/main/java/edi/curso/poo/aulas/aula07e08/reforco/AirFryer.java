package edi.curso.poo.aulas.aula07e08.reforco;

public class AirFryer implements FritarInterface
{
    private Alimento alimento;

    public Alimento getAlimento()
    {
        return alimento;
    }
    public void setAlimento(Alimento alimento)
    {
        this.alimento = alimento;
    }
    
    @Override
    public void fritar(Alimento alimento, boolean ligada)
    {
        if(!alimento.getEstado().equals(null) || !alimento.getEstado().equals(null)) {
            if(ligada == true) {
                System.out.println("Desligue a AirFryer para colocar o alimento");
            }else if(ligada == false) {
                System.out.println("Fritando: "+ alimento.getNome()+" " +alimento.getEstado() +" com temperatura "+alimento.getTemperatura());
                System.out.println("Alimento saudável frito.");
            }
        }else System.out.println("Não é possível fritar: "+ alimento.getNome());
        
        
    }
    
    

}
