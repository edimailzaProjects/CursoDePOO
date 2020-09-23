package edi.curso.poo.aulas.aula03;

public class Caneta03
{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    public boolean tampada;
    
    public void status() {
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo: "+this.modelo);
    }
    
    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Erro, caneta tampada");
        }else {
            System.out.println("Estou rabiscando");
        }
        
    }
    
    protected void tampar() {
        this.tampada = true; 
        
    }
    
    protected void destampar() {
        this.tampada = false;
    }

}
