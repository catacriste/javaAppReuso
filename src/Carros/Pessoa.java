package Carros;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.io.IOException;

public class Pessoa {
	 //Atributos ---------------------------
	
    //Sempre Privados
    private String nome;
    private String apelido;
    private String dataNascimento;
    private String morada;
    private int telefone;
    private long bi;
    private long nif;
    private long niss;
    //Construtores-------------------------
    //Nome do  construtor é sempre o nome da classe, os mesmos não devolvem nada
    // Pode haver vários desde que com assinaturas(tipo ou numero de paramentos existentes) diferentes
    public Pessoa(String name, String lastN)
    {
        nome = name;
        apelido = lastN;
    }

    public Pessoa(String name, String lastName, String dataN)
    {
        nome = name;
        apelido = lastName;
        dataNascimento = dataN;
    }

    // Devolvem algo ( Neste caso strings)
    //podem ser void e podem não conter parametros
    //Se tiverem retorno tem que seguir devidamente antes da variável a palavra "Return"
    //Só pode retornar um dado caso o tipo de dado que está definido no Construtor
    //Métodos-------------------------------

    // Sets
    public void agoraFaloEu(Pessoa p) throws IOException
    {
    	long startTime = System.currentTimeMillis();
    	long elapsedTime = 0L;
    	
    	while (elapsedTime < 1000) {
    	    elapsedTime = (new Date()).getTime() - startTime;
    	}
        System.out.println("Eu " + getName() + getLastName() + " Falo Agora");
        
        
        p.agoraFaloEu(this);
    }

    public void setDataNascimento(String dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public void setMorada(String morada)
    {
        this.morada = morada;
    }

    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }

    public void setBi(long bi)
    {
        this.bi = bi;
    }

    public void setNif(long nif)
    {
        this.nif = nif;
    }

    public void setNiss(long niss)
    {
        this.niss = niss;
    }

    // Gets
    public long getNiss()
    {
        return niss;
    }

    public long getNif()
    {
        return nif;
    }

    public long getBi()
    {
        return bi;
    }

    public int getTelefone()
    {
        return telefone;
    }

    public String getMorada()
    {
        return morada;
    }

    public String getName()
    {
        return nome;
    }

    public String getLastName()
    {
        return apelido;
    }

    public String getDataN()
    {
        return dataNascimento;
    }

}
