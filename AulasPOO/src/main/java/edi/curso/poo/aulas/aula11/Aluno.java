package edi.curso.poo.aulas.aula11;

public class Aluno extends Pessoa
{
    private int matricula;
    private String curso;

    public Aluno(int idade, String nome, String sexo)
    {
        super(idade, nome, sexo);

    }

    public int getMatricula()
    {
        return matricula;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }
    
    public void matricular() {
        System.out.println(this.getNome()+" está matriculado no curso: "+this.getCurso()+".");
    }

    public void cancelarmatricula()
    {
        System.out.println("A matrícula " + this.matricula + " do aluno " + this.getNome() + " será cancelada.");

    }
    
    public void pagarMensalidade(float valor) {
        System.out.println("A mensalidade de "+ this.getNome() + " no valor de R$"+valor+" foi paga.");
    }
    
    

}
