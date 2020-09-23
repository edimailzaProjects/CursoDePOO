package edi.curso.poo.aulas.aula05;

public class ContaBanco
{
    public int numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private boolean status;

    public void estatoAtual()
    {
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status:" + this.isStatus());
    }

    public void abrirConta(String t)
    {
        this.setTipo(t);
        this.setStatus(true);
        if (this.tipo.equals("CC"))
        {
            this.setSaldo(50f);
        }
        else if (this.tipo.equals("CP"))
        {
            this.setSaldo(150f);

        }
        System.out.println("Conta aberta com sucesso.");

    }

    public void fecharConta()
    {
        if (this.getSaldo() > 0f)
        {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro.");
        }
        else if (this.getSaldo() < 0f)
        {
            System.out.println("A conta não pode ser fechada pois tem débito.");

        }
        System.out.println("Conta fechada com sucesso.");
    }

    public void depositar(float v)
    {
        if (this.isStatus())
        {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de: " + this.getDono());
        }
        else
        {
            System.out.println("Impossível depositar em conta fechada!");

        }
    }

    public void sacar(float v)
    {
        if (this.isStatus())
        {
            if (this.getSaldo() >= v)
            {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            }
            else
                System.out.println("Saldo insuficiente!");
        }
        else
        {
            System.out.println("Impossível sacar em conta fechada!");

        }
    }

    public void pagarmensal()
    {
        int v;
        if (this.getTipo().contentEquals("CC"))
        {
            v = 12;
        }
        else
        {
            v = 20;

        }

        if (this.isStatus())
        {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade de: " + this.getDono() + " paga com sucesso");
        }
        else
            System.out.println("Impossível pagar uma conta fechada");

    }

    public ContaBanco()
    {
        this.setSaldo(0f);
        this.setStatus(false);
    }

    public int getNumConta()
    {
        return numConta;
    }

    public void setNumConta(int numConta)
    {
        this.numConta = numConta;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getDono()
    {
        return dono;
    }

    public void setDono(String dono)
    {
        this.dono = dono;
    }

    public Float getSaldo()
    {
        return saldo;
    }

    public void setSaldo(Float saldo)
    {
        this.saldo = saldo;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

}
