package controller;
import view.*;
import Model.PilhaInt;
public class VetorController {
	PilhaInt p = new PilhaInt();
	public VetorController (){
		super();
	}
	
	public int[] carregaPilha ( int[] vetor) throws Exception {
		for (int i =0; i< vetor.length; i++) {
			if(vetor[i]> 0 || vetor[i]==0 ) {
				p.push(vetor [i]);	
			} else if (vetor[i]< 0) {
				int n1 = p.pop();
				int n2 = p.pop();
				int r = n1 + n2;
				
				p.push(vetor [i]);
				p.push(r);
				}
			}
		System.out.println("Tamanho da pilha: "+ p.size());
		return vetor;
	}
	
}
