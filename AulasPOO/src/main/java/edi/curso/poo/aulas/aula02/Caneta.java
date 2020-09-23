package edi.curso.poo.aulas.aula02;

public class Caneta
{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo: "+this.modelo);
    }
    
    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Erro, caneta tampada");
        }else {
            System.out.println("Estou rabiscando");
        }
        
    }
    
    void tampar() {
        this.tampada = true; //this é o nome do objeto que chamou
        
    }
    
    void destampar() {
        this.tampada = false;
    }

}
