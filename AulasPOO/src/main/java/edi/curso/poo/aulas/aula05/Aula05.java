package edi.curso.poo.aulas.aula05;

public class Aula05
{
    public static void main(String[] args)
    {
        ContaBanco c1 = new ContaBanco();

        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        c1.estatoAtual();
        c1.depositar(10f);
        c1.estatoAtual();
        c1.sacar(5f);
        c1.estatoAtual();
        c1.sacar(55f);
        c1.estatoAtual();
        c1.sacar(56f);
        c1.fecharConta();
        c1.estatoAtual();
        c1.fecharConta();
        c1.estatoAtual();

        ContaBanco c2 = new ContaBanco();

        c2.setNumConta(1111);
        c2.setDono("Creusa");
        c2.abrirConta("CP");
        c2.estatoAtual();
        c2.depositar(10f);
        c2.estatoAtual();
        c2.sacar(5f);
        c2.estatoAtual();
        c2.sacar(55f);
        c2.estatoAtual();
        c2.sacar(56f);
        c2.fecharConta();
        c2.estatoAtual();
        c2.fecharConta();
        c2.estatoAtual();
    }

}
