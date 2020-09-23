package edi.curso.poo.aulas.aula04;

public class Caneta04
{
    public String cor;
    private float ponta;
    protected int carga;
    public boolean tampada;
    public String modelo;

    
    public Caneta04()
    {
        super();
        
    }

    public Caneta04(String cor, float ponta, int carga, boolean tampada, String modelo)
    {
        super();
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
        this.modelo = modelo;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public float getPonta()
    {
        return ponta;
    }

    public void setPonta(float ponta)
    {
        this.ponta = ponta;
    }

    public int getCarga()
    {
        return carga;
    }

    public void setCarga(int carga)
    {
        this.carga = carga;
    }

    public boolean isTampada()
    {
        return tampada;
    }

    public void setTampada(boolean tampada)
    {
        this.tampada = tampada;
    }

    public void status()
    {
        System.out.println("SOBRE A CANETA");
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo: " + this.modelo);
    }

    public void rabiscar()
    {
        if (this.tampada == true)
        {
            System.out.println("Erro, caneta tampada");
        }
        else
        {
            System.out.println("Estou rabiscando");
        }

    }

    protected void tampar()
    {
        this.tampada = true;

    }

    protected void destampar()
    {
        this.tampada = false;
    }

}
