package edi.curso.poo.aulas.aula05.reforco;

public class ContaBanco
{
    public Long numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private boolean status;

    public ContaBanco()
    {
        super();
    }
    

    public ContaBanco(Long numConta)
    {   
        super();   
        this.numConta = numConta;       
    }



    public Long getNumConta()
    {
        return numConta;
    }

    public void setNumConta(Long numConta)
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

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dono == null) ? 0 : dono.hashCode());
        result = prime * result + ((numConta == null) ? 0 : numConta.hashCode());
        result = prime * result + ((saldo == null) ? 0 : saldo.hashCode());
        result = prime * result + (status ? 1231 : 1237);
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContaBanco other = (ContaBanco) obj;
        if (dono == null)
        {
            if (other.dono != null)
                return false;
        }
        else if (!dono.equals(other.dono))
            return false;
        if (numConta == null)
        {
            if (other.numConta != null)
                return false;
        }
        else if (!numConta.equals(other.numConta))
            return false;
        if (saldo == null)
        {
            if (other.saldo != null)
                return false;
        }
        else if (!saldo.equals(other.saldo))
            return false;
        if (status != other.status)
            return false;
        if (tipo == null)
        {
            if (other.tipo != null)
                return false;
        }
        else if (!tipo.equals(other.tipo))
            return false;
        return true;
    }
    
    

}
