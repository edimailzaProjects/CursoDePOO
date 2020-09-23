package edi.curso.poo.aulas.aula11;

public class Bolsista extends Aluno
{
    private int bolsa;
    
    
    
    public int getBolsa()
    {
        return bolsa;
    }



    public void setBolsa(int bolsa)
    {
        this.bolsa = bolsa;
    }



    public Bolsista(int idade, String nome, String sexo)
    {
        super(idade, nome, sexo);
    }

    
    
    public void renovarBolsa() {
        System.out.println("A bolsa de " + this.getNome() + " foi renovada com sucesso");
    }
    
    
    
    @Override
    public void pagarMensalidade(float valor) { //polimorfismo: pagar mensalidade de duas formas diferentes
        if(valor == 0f)
        System.out.println(this.getNome() + " é bolsista, logo paga R$"+valor+".");
        else
            System.out.println("O aluno não é bolsista");
    }

}
