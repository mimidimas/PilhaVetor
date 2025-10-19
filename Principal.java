package view;
import controller.VetorController;
public class Principal {

	public static void main(String[] args) throws Exception {
		VetorController v = new VetorController();
		int [] vetor = new int [] {0, 5, 7 , -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};		
		v.carregaPilha(vetor);
	}

}
