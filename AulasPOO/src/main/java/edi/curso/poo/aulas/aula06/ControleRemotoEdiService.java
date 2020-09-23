package edi.curso.poo.aulas.aula06;

public class ControleRemotoEdiService implements ControladorEdi
{

    ControleRemotoEdi controle = new ControleRemotoEdi();

    @Override
    public boolean ligar()
    {
        if (!controle.isLigado())
        {
            controle.setLigado(true);
            System.out.println("TV ligada.");
            return true;
        }
        else
            System.out.println("A TV já está ligada.");
        return false;

    }

    @Override
    public boolean desligar()
    {
        if (!controle.isLigado())
        {
            controle.setLigado(true);
            System.out.println("TV desligada.");
            return true;
        }
        else
            System.out.println("A TV já está desligada.");
        return false;

    }

    @Override
    public boolean abrirMenu()
    {
        if (this.ligar() == true)
        {
            System.out.println("Menu aberto!");
            for (int i = 0; i > controle.getVolume(); i += 10)
            {
                System.out.println("|");
            }
            return true;
        }
        else
            System.out.println("Impossível abrir menu com a TV desligada.");
        return false;

    }

    @Override
    public boolean fecharMenu()
    {
        if (this.abrirMenu() == true)
        {
            System.out.println("Fechando menu.");
            System.out.println("Menu fechado");
            return true;
        }
        else
        {
            System.out.println("Impossível fechar menu não aberto.");
            return false;
        }

    }

    @Override
    public void maisVolume()
    {
        if (this.abrirMenu())
        {
            controle.setVolume(controle.getVolume()+10);
        }
        else
        {
            System.out.println("O menu está fechado.");
        }
        

    }

    @Override
    public void menosVolume()
    {
        if (this.abrirMenu())
        {
            controle.setVolume(controle.getVolume()-10);
        }
        else
        {
            System.out.println("O menu está fechado.");
        }

    }

    @Override
    public void ligarMudo()
    {
        if(this.ligar() && controle.isTocando()) 
        {
            System.out.println("Modo Mudo ativado");
        }else System.out.println("A TV já está no modo mudo");

    }

    @Override
    public void desligarMudo()
    {
        if(this.ligar() && !controle.isTocando()) 
        {
            System.out.println("Modo Mudo ativado");
        }else System.out.println("A TV já está no modo mudo");

    }

    @Override
    public boolean play()
    {
        if(this.ligar() && !this.play()) {
            System.out.println("Play ativado");
            return true;
        }else if(!this.ligar()) {
            System.out.println("Impossível dar play, pois a TV está desligada");
            return false;
        }System.out.println("A novela não está pausada");
        return false;

    }

    @Override
    public boolean pause()
    {
        if(this.ligar() && this.play()) {
            System.out.println("Pause ativado");
            return true;
        }else if(!this.ligar()) {
            System.out.println("Impossível pausar, pois a TV está desligada");
            return false;
        }System.out.println("A novela está pausada");
        return false;

    }

}
