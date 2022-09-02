import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        float nota, totalNotas=0 , media;
		String disciplina, nome;
		
        Scanner leia = new Scanner(System.in);
        

		System.out.println("Digite seu nome: ");
		nome=leia.nextLine();
		
		System.out.println("Digite sua disciplina: ");
		disciplina = leia.nextLine();


		
		for(int cont = 1; cont <= 3; cont++) {
			System.out.println("Insira a nota "+ cont + ": ");
			nota = leia.nextFloat();
			totalNotas += nota;
		}
		
		
		media = totalNotas/3;
		System.out.println("\nOlá, "+ nome+ "\n");
		System.out.println("Na disciplina "+ disciplina+ " a média é "+ media);

        leia.close();
	}

}

