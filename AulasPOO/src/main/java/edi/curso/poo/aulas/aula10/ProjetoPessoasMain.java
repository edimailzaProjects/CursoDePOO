package edi.curso.poo.aulas.aula10;

public class ProjetoPessoasMain
{
    public static void main(String[] args)
    {
        Pessoa p1 = new Pessoa(50, "Carla", "Feminino");
        Aluno p2 = new Aluno(18, "João", "Masculino");
        Professor p3 = new Professor(28, "Carlos", "Masculino");
        Funcionario p4 = new Funcionario(50, "Vicente", "Masculino");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
         p1.fazerAniversario();   
         p2.setCurso("Matemática");
         p2.matricular();
         p2.cancelarmatricula();
         p2.fazerAniversario();
         p3.setSalario(1000f);
         p3.reveberAum(100f); 
         p4.isTrabalhando();
         

    }

}
