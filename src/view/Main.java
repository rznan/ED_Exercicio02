package view;

import controller.ArrayController;


//2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
//tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor
//valor con�do neste vetor.
//O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
//O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;


public class Main {
	public static void main(String[] args) {
		int[] arr = { 2, 3, -1, 11, 8, 9 };
		var arrayController = new ArrayController();
		
		int result = arrayController.findSmallestElement(arr, arr.length);
		
		System.out.println(result);
	}
}
