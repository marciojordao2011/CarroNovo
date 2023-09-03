package interativo;

public abstract class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano) {
    	this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }
    
    public int getAno() {
    	return ano;
    }
    
    public void setAno(int ano) {
    	this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public abstract void acelerar(int velocidade);
    public abstract void frear();
}
