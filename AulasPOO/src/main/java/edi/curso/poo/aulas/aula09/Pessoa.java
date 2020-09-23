package edi.curso.poo.aulas.aula09;

public class Pessoa
{
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo)
    {
        super();
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
       this.sexo = sexo;
    }

    public String fazerAniver()
    {
        return "Parabéns pelo seu : " + (this.getIdade()+1) + "º aniversário "+this.getNome() +"!";

    }
    
    public String informarFaixaEtaria() {
        if (this.getSexo() == 'M' && this.getIdade() >= 18)
        {
            return "Um homem ";
            
        }
        else if (this.getSexo() == 'M' && this.getIdade() < 18 && this.getIdade() >= 10)
        {
            return "Um rapaz ";
            
        }
        else if (this.getSexo() == 'M' && this.getIdade() < 10)
        {
            return "Um menino ";
            
        }
        else if (this.getSexo() == 'F' && this.getIdade() >= 18)
        {
            return "Uma mulher ";
            
        }
        else if (this.getSexo() == 'F' && this.getIdade() < 18 && this.getIdade() >= 10)
        {
            return "Uma moça ";
            
        }
        else if (this.getSexo() == 'M' && this.getIdade() < 10)
        {
            return "Uma menina ";
            
        }
        else
            return "Sexo inválido.";
    }

}
