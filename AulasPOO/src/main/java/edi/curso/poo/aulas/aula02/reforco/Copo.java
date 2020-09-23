package edi.curso.poo.aulas.aula02.reforco;

public class Copo
{
    boolean tampa;
    String cor;
    boolean adesivo;
    String capacidade;

    public String getCapacidade()
    {
        return capacidade;
    }

    public void setCapacidade(String capacidade)
    {
        this.capacidade = capacidade;
    }

    public boolean isTampa()
    {
        return tampa;
    }

    public void setTampa(boolean tampa)
    {
        this.tampa = tampa;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public boolean isAdesivo()
    {
        return adesivo;
    }

    public void setAdesivo(boolean adesivo)
    {
        this.adesivo = adesivo;
    }

    public String encher(String estadoCopo)
    {
        estadoCopo.toString();

        if (estadoCopo.equals("Cheio") || estadoCopo.equals("Vazio") || estadoCopo.equals("Incompleto"))
        {
            if ((!"Cheio".equals(this.capacidade) || "Incompleto".equals(this.capacidade)) && this.tampa == true)
            {
                return "Copo " + capacidade + " e tampado não pode ser preenchido.";
            }
            else if ("Cheio".equals(this.capacidade) && (this.tampa == true || this.tampa == false))
            {
                return "O copo já está " + capacidade + "!";
            }
            else
            {               

                return "Enchendo o copo " + capacidade + ".";
            }
        }
        else
        {

            return estadoCopo + " não é um estado válido.";
        }
    }

    public String statusCorCopo()
    {
        if (this.cor.equals("Turquesa") || this.cor.equals("Azul"))
        {
            return "Copo de cor: " + this.cor + ".";
        }
        else
        {
            return "Insira uma cor valida para o copo: Turquesa ou Azul";
        }
    }

    public String statusCapacidadeCopo()
    {
        if(encher(this.capacidade).equals("Enchendo o copo " + capacidade + ".") && this.tampa == false) {
            this.capacidade = "Cheio";
            return "Capacidade atual: " + this.capacidade + ".";
        }else {
            return "Capacidade atual: " + this.capacidade + ".";
        }
        
    }

    public String statusAdesivoCopo()
    {
        if (this.adesivo == true)
        {
            return "Possui adesivo.";
        }
        else
            return "Não possui adesivo.";

    }

    public String statusTampa()
    {
        if (this.tampa == true)
        {
            return "Está tampado.";
        }
        else
            return "Está destampado.";
    }

    public String statusCopo(String estadoCopo)
    {
        return this.encher(estadoCopo) + "Descrição:" + "" + this.statusCorCopo() + "" + this.statusAdesivoCopo()
                + "" + this.statusTampa() + "" + this.statusCapacidadeCopo();
    }

}
