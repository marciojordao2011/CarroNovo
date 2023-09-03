package interativo;

public class CarroEsportivo extends Carro {
    private boolean turbo;
    private int ano;
    
    

    public CarroEsportivo(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.turbo = false;
        this.ano = ano;
    }
    
    public boolean ehCarroAntigo() {
        return ano <= 1988;
    }
    
    
    @Override
    public String toString() {
        String status = isLigado() ? "ligado" : "desligado";
        String classificacao = ehCarroAntigo() ? "Carro Antigo" : "Carro Moderno"; 

        return "Carro: Marca - " + getMarca() + ", Modelo - " + getModelo() +
                ", Ano - " + ano + ", Velocidade Atual - " + getVelocidadeAtual() +
                " km/h, Status - " + status + ", Classificação - " + classificacao;
    }

    @Override
    public void acelerar(int velocidade) {
        if (isLigado()) {
            if (turbo) {
                setVelocidadeAtual(getVelocidadeAtual() + (1 * velocidade));
            } else {
                setVelocidadeAtual(getVelocidadeAtual() + velocidade);
            }
            System.out.println("Acelerando para " + getVelocidadeAtual() + " km/h");
        } else {
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        }
    }

    @Override
    public void frear() {
        if (getVelocidadeAtual() > 0) {
            setVelocidadeAtual(0);
            System.out.println("Carro freou completamente.");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void ativarTurbo() {
        turbo = true;
    }
}