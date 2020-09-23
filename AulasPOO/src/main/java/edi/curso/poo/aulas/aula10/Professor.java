package edi.curso.poo.aulas.aula10;

public class Professor extends Pessoa
{
    private String especialidade;
    private float salario;

    public Professor(int idade, String nome, String sexo)
    {
        super(idade, nome, sexo);
    }

    public String getEspecialidade()
    {
        return especialidade;
    }

    public void setEspecialidade(String especialidade)
    {
        this.especialidade = especialidade;
    }

    public float getSalario()
    {
        return salario;
    }

    public void setSalario(float salario)
    {
        this.salario = salario;
    }

    public void reveberAum(float aumento)
    {
        System.out.println("O salário de "+ this.getNome() + " era de: R$"+ this.getSalario()+"0 .");
        this.salario +=aumento;
        System.out.println("Com o almento de " + aumento + " agora passou a ser: R$"+ this.getSalario()+"0 .");

    }

}
