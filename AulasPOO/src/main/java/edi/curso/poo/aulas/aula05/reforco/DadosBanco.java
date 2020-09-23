package edi.curso.poo.aulas.aula05.reforco;

import java.util.ArrayList;
import java.util.List;

public class DadosBanco
{
    List<ContaBanco> dados = new ArrayList<>();

    public List<ContaBanco> getDados()
    {
        return dados;
    }

    public void setDados(List<ContaBanco> dados)
    {
        this.dados = dados;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dados == null) ? 0 : dados.hashCode());
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
        DadosBanco other = (DadosBanco) obj;
        if (dados == null)
        {
            if (other.dados != null)
                return false;
        }
        else if (!dados.equals(other.dados))
            return false;
        return true;
    }
    
    
    

}
