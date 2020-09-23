package edi.curso.poo.aulas.aula10;

public class Pessoa
{
    private int idade;
    private String nome;
    private String sexo; 

    public Pessoa(int idade, String nome, String sexo)
    {
        super();
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }
//
//    public Pessoa()
//    {
//        super();
//    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public void fazerAniversario()
    {
        this.idade++;
        System.out.println(this.getNome()+ " fez seu "+this.idade+"º aniversário.");
    }

    @Override
    public String toString()
    {
        return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }
    
    

}
