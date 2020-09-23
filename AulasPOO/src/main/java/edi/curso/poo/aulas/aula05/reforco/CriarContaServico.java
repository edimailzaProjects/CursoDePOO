package edi.curso.poo.aulas.aula05.reforco;

import java.util.ArrayList;
import java.util.List;


public class CriarContaServico
{
    ContaBanco conta = new ContaBanco();
    List<ContaBanco> consulta = new ArrayList<>();

    public String abrirConta(Long numConta, String tipoConta, String donoConta)
    {      
            if (this.inserirNumeroConta(numConta).endsWith("Numero da conta: " + conta.getNumConta().toString() + ". "))
              {
                  this.inserirNumeroConta(numConta);
                  if (this.inserirDonoConta(donoConta).endsWith("Nome do proprietario: " + conta.getDono() + ". "))
                  {
                      this.inserirDonoConta(donoConta);
                      if (this.exibirSaldo(tipoConta).endsWith("com saldo de: " + conta.getSaldo() + ". "))
                      {
                          this.exibirSaldo(tipoConta);
                          this.exibirStatus();
  
                          return this.inserirNumeroConta(numConta) + this.inserirDonoConta(donoConta)
                                  + this.exibirSaldo(tipoConta) + this.exibirStatus();
                      }
                      else
                      {
                          return this.exibirSaldo(tipoConta);
                      }
                  }
                  else
                  {
                      return this.inserirDonoConta(donoConta);
                  }
              }
              else
                  return this.inserirNumeroConta(numConta);
    }

    public String inserirNumeroConta(Long numConta)
    {
        if (numConta > 0 && numConta < 1000 && !numConta.equals(null))
        {
            conta.setNumConta(numConta);
            return "Numero da conta: " + conta.getNumConta().toString() + ". ";
        }

        return conta.getNumConta().toString() + " não é um dado válido.";
    }

    public String inserirDonoConta(String donoConta)
    {

        if (!donoConta.equals("") && !donoConta.equals(null))
        {
            conta.setDono(donoConta);
            return "Nome do proprietario: " + conta.getDono() + ". ";
        }
        else
            return "Insira um nome válido. ";
    }

    public String exibirSaldo(String tipoConta)
    {
        if (((tipoConta.equals("cc") || tipoConta.contentEquals("cp"))) && !tipoConta.equals(null))
        {
            conta.setTipo(tipoConta);

            if (conta.getTipo().contentEquals("cc"))
            {
                conta.setSaldo(50f);
                conta.setStatus(true);
                return "Conta do tipo " + conta.getTipo() + " -> conta corrente, com saldo de: " + conta.getSaldo()
                        + ". ";

            }
            else
            {
                conta.setSaldo(150f);
                conta.setStatus(true);
                return "Conta do tipo " + conta.getTipo() + " -> conta poupança, com saldo de: " + conta.getSaldo()
                        + ". ";

            }
        }
        else
            return "O tipo de conta deve ser apenas cc ou cp. ";
    }

    public String exibirStatus()
    {
        if (conta.isStatus() == true)
        {
            return "Conta criada com sucesso! ";
        }
        else
            return "Não foi possível criar a conta. ";
    }
}
