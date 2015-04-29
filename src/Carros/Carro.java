package Carros;

public class Carro {
	//Atributos ---------------------------
    //Sempre Privados
    private String marca;
    private int ano;
    private String codigoChassi;
    private String cor;
    private String matricula;
    private int numeroDePortas;
    private String combustivel;
    private int numeroDeLugares;
    private long biPropretario = 0;

    

   


    // Construtor
   public Carro(String marc, int year, String cChassi )
   {
       marca = marc;
       ano = year;
       codigoChassi = cChassi;
       
   }

   // Sets
    

   public void setPropretario(long biPropretario)
   {
       if (this.biPropretario != 0)
       {
           System.out.println("LADRรรรรรรรรรรรรรรรรรรรรรรO");
       }
       else
       {
           this.biPropretario = biPropretario;
       }
   }

   public void setCor(String cor)
   {
       this.cor = cor;
   }

   public void setMatricula(String matricula)
   {
       this.matricula = matricula;
   }

   public void setnumeroDePortas(int numeroDePortas)
   {
       this.numeroDePortas = numeroDePortas;
   }

   public void setcombustivel(String combustivel)
   {
       this.combustivel = combustivel;
   }

   public void setnumeroDeLugares(int numeroDeLugares)
   {
       this.numeroDeLugares = numeroDeLugares;
   }


   // Gets
   public long getPropretario()
   {
       return biPropretario;
   }
   public String getMarca()
   {
       return marca;
   }

   public int getAno()
   {
       return ano;
   }

   public String getCodigoChassi()
   {
       return codigoChassi;
   }
   public String getMatricula()
   {
       return matricula;
   }

   public String getCor()
   {
       return cor;
   }

   public int getNumeroDePortas()
   {
       return numeroDePortas;
   }

   public String getCombustivel()
   {
       return combustivel;
   }

   public int getNumeroDeLugares()
   {
       return numeroDeLugares;
   }

}
