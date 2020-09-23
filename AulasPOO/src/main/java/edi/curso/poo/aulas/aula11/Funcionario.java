package edi.curso.poo.aulas.aula11;

public class Funcionario extends Pessoa
{
    private String setor;
    private boolean trabalhando;

    public Funcionario(int idade, String nome, String sexo)
    {
        super(idade, nome, sexo);
    }

    public String getSetor()
    {
        return setor;
    }

    public void setSetor(String setor)
    {
        this.setor = setor;
    }

    public boolean isTrabalhando()
    {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando)
    {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(boolean trabalhando)
    {
        this.trabalhando =! trabalhando;
        System.out.println(this.trabalhando);
    }

}
