package edi.curso.poo.aulas.aula11;

public class Visitante extends Pessoa //é instanciável mesmo sendo folha. Herança pobre.
{

    public Visitante(int idade, String nome, String sexo)
    {
        super(idade, nome, sexo);
    }

    @Override
    public String toString()
    {
        return "Visitante [getIdade()=" + getIdade() + ", getNome()=" + getNome() + ", getSexo()=" + getSexo()
                + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + "]";
    } 
    
    

}
