package edi.curso.poo.aulas.aula06;

public class ControleRemotoGuanabara implements ControladorGuanabara
{
    private boolean ligado;
    private boolean tocando;
    private int volume;

    public ControleRemotoGuanabara()
    {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private boolean isLigado()
    {
        return ligado;
    }

    private void setLigado(boolean ligado)
    {
        this.ligado = ligado;
    }

    private boolean isTocando()
    {
        return tocando;
    }

    private void setTocando(boolean tocando)
    {
        this.tocando = tocando;
    }

    private int getVolume()
    {
        return volume;
    }

    private void setVolume(int volume)
    {
        this.volume = volume;
    }

    @Override
    public void ligar()
    {
        this.setLigado(true);

    }

    @Override
    public void desligar()
    {
        this.setLigado(false);

    }

    @Override
    public void abrirMenu()
    {
        System.out.println("---------MENU---------");
        System.out.println("Está ligado?" + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());

        for (int i = 0; i <= this.getVolume(); i += 10)
        {
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu()
    {
        System.out.println("Fechando Menu");

    }

    @Override
    public void maisVolume()
    {
        if (this.isLigado())
        {
            this.setVolume(this.getVolume() + 5);
        }

    }

    @Override
    public void menosVolume()
    {
        if (this.isLigado())
        {
            this.setVolume(this.getVolume() - 5);
        }

    }

    @Override
    public void ligarMudo()
    {
        if (this.isLigado() && this.getVolume()>0)
        {
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo()
    {
        if (this.isLigado() && this.getVolume()<0)
        {
            this.setVolume(50);
        } 

    }

    @Override
    public void play()
    {
        if(this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
        }

    }

    @Override
    public void pause()
    {
        if(this.isLigado() && !this.isTocando()) {
            this.setTocando(false);
        }

    }

}
