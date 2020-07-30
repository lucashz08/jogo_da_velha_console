
public class Velha {

	static private int matriz[][] = new int[3][3];
	static private int vezDeQuem = 1;
	static private String pre; 
	
	static public void printGame() {
		System.out.println("    -A---B---C-");
		System.out.println("1 |  " + eX(matriz[0][0]) + " | " + eX(matriz[0][1]) + " | " + eX(matriz[0][2]));
		System.out.println("    -----------");
		System.out.println("2 |  " + eX(matriz[1][0]) + " | " + eX(matriz[1][1]) + " | " + eX(matriz[1][2]));
		System.out.println("    -----------");
		System.out.println("3 |  " + eX(matriz[2][0]) + " | " + eX(matriz[2][1]) + " | " + eX(matriz[2][2]));

	}
	
	static public void changePlay()
	{
		if(vezDeQuem == 1)
			vezDeQuem = 2;
		else
			vezDeQuem = 1;
	}
	

	static public char eX(int o) {
		if (o == 1)
			return 'O';
		if (o == 2)
			return 'X';

		return ' ';
	}

	static public boolean vencedor() {
		if (matriz[0][0] == matriz[0][1] && matriz[0][0] == matriz[0][2] && matriz[0][1] == matriz[0][2]
				&& matriz[0][0] != 0) {
			return true;
		}
		if (matriz[1][0] == matriz[1][1] && matriz[1][0] == matriz[1][2] && matriz[1][1] == matriz[1][2]
				&& matriz[1][0] != 0) {
			return true;
		}
		if (matriz[2][0] == matriz[2][1] && matriz[2][0] == matriz[2][2] && matriz[2][1] == matriz[2][2]
				&& matriz[2][0] != 0) {
			return true;
		}
		if (matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2] && matriz[1][1] == matriz[2][2]
				&& matriz[0][0] != 0) {
			return true;
		}
		if (matriz[2][0] == matriz[1][1] && matriz[2][0] == matriz[0][2] && matriz[1][1] == matriz[0][2]
				&& matriz[2][0] != 0) {
			return true;
		}
		if (matriz[0][0] == matriz[1][0] && matriz[0][0] == matriz[2][0] && matriz[1][0] == matriz[2][0]
				&& matriz[0][0] != 0) {
			return true;
		}
		if (matriz[0][1] == matriz[1][1] && matriz[0][1] == matriz[2][1] && matriz[1][1] == matriz[2][1]
				&& matriz[0][1] != 0) {
			return true;
		}
		if (matriz[0][2] == matriz[1][2] && matriz[0][2] == matriz[2][2] && matriz[1][2] == matriz[2][2]
				&& matriz[0][2] != 0) {
			return true;
		}

		return false;
	}

	static public boolean velha() {

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				if (matriz[x][y] == 0) {
					return false;
				}
			}
		}

		return true;

	}

	static public boolean preencher(String pre)
	{
			if(pre.equals("a1") && matriz[0][0] == 0)
			{
				matriz[0][0] = vezDeQuem;
				return true;
			}
			
			if(pre.equals("a2") && matriz[1][0] == 0)
			{
				matriz[1][0] = vezDeQuem;
				return true;
			}
			
			if(pre.equals("a3") && matriz[2][0] == 0)
			{
				matriz[2][0] = vezDeQuem;
				return true;
			}

			if(pre.equals("b1") && matriz[0][1] == 0)
			{
				matriz[0][1] = vezDeQuem;
				return true;
			}
			
			if(pre.equals("b2") && matriz[1][1] == 0)
			{
				matriz[1][1] = vezDeQuem;
				return true;
			}
			
			if(pre.equals("b3") && matriz[2][1] == 0)
			{
				matriz[2][1] = vezDeQuem;
				return true;
			}
			if(pre.equals("c1") && matriz[0][2] == 0)
			{
				matriz[0][2] = vezDeQuem;
				return true;
				
			}
			if(pre.equals("c2") && matriz[1][2] == 0)
			{
				matriz[1][2] = vezDeQuem;
				return true;
			}
			if(pre.equals("c3") && matriz[2][2] == 0)
			{
				matriz[2][2] = vezDeQuem;
				return true;
			}
			
		return false;
	}
	
	static public void limpar()
	{
		for(int i = 0; i < 15; i++) {
			System.out.println();
		}
	}
	
	public static int getVezDeQuem() {
		return vezDeQuem;
	}

	public static void setVezDeQuem(int vezDeQuem) {
		Velha.vezDeQuem = vezDeQuem;
	}

	public static String getPre() {
		return pre;
	}

	public static void setPre(String pre) {
		Velha.pre = pre;
	}
	
}
