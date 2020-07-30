import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			Velha.printGame();
			
			System.out.println("Agora e a vez do [ "+ Velha.eX(Velha.getVezDeQuem()) +" ] digite a letra e o numero : ");
			
			Velha.setPre(sc.nextLine());
			
			
			if(Velha.getPre().equals("exit"))
			{
				System.out.println("Você finalizou o jogo.");
				break;
			}
			
			while(!Velha.preencher(Velha.getPre()))
			{
				System.out.println("Lugar está ocupado [ "+ Velha.eX(Velha.getVezDeQuem()) +" ] digite novamente: ");
				Velha.setPre(sc.nextLine());
			}
			
			if(Velha.vencedor())
			{
				Velha.limpar();
				System.out.println("Parabéns o [ "+ Velha.eX(Velha.getVezDeQuem()) +" ] venceu! ");
				break;
			}
			
			if(Velha.velha())
			{
				Velha.limpar();
				System.out.println("Jogo terminou empatado! Deu Velha! ");
				break;
			}
			
			Velha.changePlay();
			
			Velha.limpar();
		}
		
		sc.close();
	}
}
