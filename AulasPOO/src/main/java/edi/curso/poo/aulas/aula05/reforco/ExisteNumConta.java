package edi.curso.poo.aulas.aula05.reforco;

import java.util.List;

public class ExisteNumConta
{

    // public static boolean existe(Long consultarNumero)
    // {
    // List<ContaBanco> consulta = new ArrayList<>();
    // ContaBanco contaBanco1 = new ContaBanco(consultarNumero);
    //
    // boolean existe = false;
    // for (ContaBanco a : consulta)
    // {
    // if (a.getNumConta().equals(consultarNumero))
    // {
    //
    // existe = true;
    // return existe;
    // }
    // else
    // {
    // consulta.add(contaBanco1);
    // existe = false;
    // }
    // }
    // return existe;

    //}
    //
    // public static boolean existe(Long numConta)
    // {
    // List<ContaBanco> contaBanco = Arrays.asList(new ContaBanco(numConta));
    //
    // ContaBanco conta = contaBanco.stream().filter(x -> numConta.equals(x.getNumConta())).findAny().orElse(null);
    //
    // if (conta.equals(null))
    // {
    // return true;
    // }
    // else
    // return false;
    // }

    // public static boolean existe(Long numConta) {
    // ContaBanco conta = new ContaBanco();
    // DadosBanco dados = new DadosBanco();
    // if(dados.getDados().contains(numConta.equals(conta.getNumConta()))) {
    // return true;
    // }
    // return false;
    // }

    // public static void main(String[] args) {
    // List<ContaBanco> consulta = new ArrayList<>();
    // ContaBanco contaBanco1 = new ContaBanco(11l);
    // ContaBanco contaBanco2 = new ContaBanco(12l);
    // consulta.add(contaBanco1);
    // consulta.add(contaBanco2);
    //
    // for (ContaBanco a : consulta)
    // {
    //
    // System.out.println(a.getNumConta());
    // }
    //
    //
    // }

    // public static boolean existe(Long numConta)
    // {
    // List<ContaBanco> consulta = new ArrayList<>();
    // ContaBanco novaContaBanco = new ContaBanco(numConta);
    // if(consulta.contains(novaContaBanco)) {
    // consulta.add(novaContaBanco);
    // return true;
    // }
    //
    // else return false;
    //
    // }

    public static ContaBanco existe(Long numConta, List<ContaBanco> consulta)
    {
        for (ContaBanco conta : consulta)
        {
            if (conta.getNumConta().equals(numConta))
            {
                System.out.println(conta);
                return conta;
            }
            else
                System.out.println(conta);
            return null;

        }
        return null;
    }

}
