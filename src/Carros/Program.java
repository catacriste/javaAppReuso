package Carros;

import java.io.IOException;

public class Program {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Criação de 2 Objetos do tipo pessoa ,  2 Construtores um com 1 String e outro para 2 strings para o nome e outro para o nome + apelido.
        //  Pessoa p = new Pessoa("Antonio");
        // Para definir os construtores - - - - -- - - - - - - - - 


		
        // Construtores Inicializadores
        Pessoa p1 = new Pessoa("Catalin", " Criste");
        Pessoa p2 = new Pessoa("Jorge", " Silva");
        Carro c1 = new Carro("Audi", 2014, "SCKW4000003374538");
        c1.setCor("Preto");
        c1.setMatricula("CM-10-G1");
        c1.setnumeroDePortas(4);
        c1.setcombustivel("Dísel");
        c1.setnumeroDeLugares(5);
        // Apresenta o das pessoas
        p1.setDataNascimento("31 - 01 - 2014");
        p1.setMorada(" Rua das Flores ");
        p1.setTelefone(961399690);
        p1.setBi(312142345);
        p1.setNif(543241331);
        p1.setNiss(54335454);



        p1.agoraFaloEu(p2);
        // Propretário - Carro - Pessoa

        c1.setPropretario(p1.getBi());
        //
  /*      System.out.println("Informações sobre o carro ");
        System.out.println("  ");
        //

        // Imprime no ecra os dados do carro
        if (c1.getPropretario() == 0)
        {
            System.out.println("Não tem propretario");
        }
        else
        {
            System.out.println("Propretário : " + p1.getName());
            System.out.println("Marca : " + c1.getMarca());
            System.out.println("Ano : " + c1.getAno());
            System.out.println("Codigo Chassi : " + c1.getCodigoChassi());
            System.out.println("Cor : " + c1.getCor());
            System.out.println("Matricula : " + c1.getMatricula());
            System.out.println("Numero de portas : " + c1.getNumeroDePortas());
            System.out.println("Combustível : " + c1.getCombustivel());
            System.out.println("Numero de Lugares : " + c1.getNumeroDeLugares());
        }
        // Para os metodos
        
        
        //
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Informação sobre a pessoa");
        System.out.println("  ");
        //
        System.out.println("Eu chamo-me " + p1.getName() + " " + "E tenho o apelido de : " + p1.getLastName());
        System.out.println("Nasci no dia : " + p1.getDataN());
        System.out.println("Morada : " + p1.getMorada());
        System.out.println("Telefone " + p1.getTelefone());
        System.out.println("Bi : " + p1.getBi());
        System.out.println("Nif: " + p1.getNif());
        System.out.println("Niss : " + p1.getNiss());*/
	}

}
