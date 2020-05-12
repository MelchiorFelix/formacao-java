package br.com.bytebank.banco.modelo;

public class GuardadorDeObjetos {
	
	private Object[] obj = new Object[10];
	private int pos = 0;
	
	public GuardadorDeObjetos() {}
	
	public void adiciona(Object ref) {
		obj[this.pos] = ref;
		this.pos++;
	}
	
	public int tamanho() {
		 return this.pos;
	}
	
	public Object getObj(int posi) {
		return this.obj[posi];
	}

}
