package edi.curso.poo.aulas.aula07e08.reforco;

public class Alimento
{
    private String nome;
    private String estado;
    private String temperatura;
    private String status;

    public Alimento(String nome, String estado, String temperatura)
    {
        super();
        this.nome = nome;
        this.estado = estado;
        this.temperatura = temperatura;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado)
    {
        if (estado.equals("Líquido"))
        {
            System.out.println("Não é possível colocar líquidos na Airfryer.");
            this.estado = null;
        }
        else
            this.estado = estado;
    }

    public String getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(String temperatura)
    {
        if (temperatura.equals("Quente"))
        {
            System.out.println("O alimento já está aquecido. Deseja tostá-lo? 1 - S ou 2 - N");

            int escolha = 0;

            switch (escolha)
            {
            case 1:
                System.out.println("Alimento tostado com cheiro de enxofre");
                this.temperatura = temperatura;
                break;

            case 2:
                System.out.println("Retire o alimento da Airfryer");
                this.temperatura = null;
                break;
            }

        }
        else
            this.temperatura = temperatura;
    }

    public String getStatus()
    {
        return status;
             
    }

    public void setStatus(String status)
    {
        this.status = "Alimento: " + this.nome + ". Estado: "+this.estado+". Temperatura: "+this.temperatura;
    }

}
