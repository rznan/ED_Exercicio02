package controller;

public class ArrayController {
	public ArrayController() {}
	
	public int findSmallestElement(int[] arr, int len) {
		// para facilitar a chamada do método principal criei 
		// uma função que recebe apenas dois parâmetros que chama
		// a função que encontra o menor elemento em si
		return findSmallestElement(arr, len, len-1);
	}
	
	private int findSmallestElement(int[] arr, int len, int smallestIdx) {
		// a condição de para é quando o array tiver um tamanho 0,
		// ou seja, não tiver nenhum elemento. Nesse ponto basta 
		// retornar o valor que está no index de menor elemento
		if(len <= 0) return arr[smallestIdx]; 
		
		// smallestIdx recebe o index do menor elemento entre o elemento que ele
		// aponta atualmente e o último elemento do arr atual
		smallestIdx = arr[smallestIdx] > arr[len-1] ? len-1 : smallestIdx;
		
		return findSmallestElement(arr, --len, smallestIdx);
	}
	

}
