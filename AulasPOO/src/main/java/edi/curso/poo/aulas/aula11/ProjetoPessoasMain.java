package edi.curso.poo.aulas.aula11;

public class ProjetoPessoasMain
{
    public static void main(String[] args)
    {
        // Pessoa p1 = new Pessoa(50, "Carla", "Feminino"); Não é mais possível, pois é classe abstrata

        Professor p3 = new Professor(28, "Carlos", "Masculino");
        System.out.println(p3.toString());
        p3.setSalario(1000f);
        p3.reveberAum(100f);

        Funcionario p4 = new Funcionario(50, "Vicente", "Masculino");
        System.out.println(p4.toString());

        p4.isTrabalhando();

        Visitante v1 = new Visitante(38, "Leia", "Feminino");
        System.out.println(v1.toString());

        Aluno p2 = new Aluno(18, "João", "Masculino");
        p2.setMatricula(1111);
        p2.setCurso("Informática");
        p2.matricular();
        p2.pagarMensalidade(100);
        p2.fazerAniversario();
        p2.cancelarmatricula();

        Bolsista b1 = new Bolsista(22, "Victória", "Feminino");
        System.out.println(b1.toString());
        b1.setBolsa(2222);
        b1.pagarMensalidade(0);

    }

}
