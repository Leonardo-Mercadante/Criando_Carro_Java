public class Carro {

    public static final String VERMELHO = "Vermelho";
    public static final String PRETA = "Preta";

    private Integer quantidadedePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneu;
    private String cor;
    private Integer quantidadeRetrovisores = 3;
    private Double motor = 1.0;
    private Integer arCondicionado;
    private Integer vidrosEletricos;
    private Integer direcaoEletrica;
    private String combustivel = ("Flex");
    private Integer portas = 4;


    public Carro(Integer quantidadedePneus) {
    setQuantidadedePneus(quantidadedePneus);
    }

    public Integer getQuantidadedePneus() {
        return quantidadedePneus + 1;
    }

    public void setQuantidadedePneus(Integer quantidadedePneus) {
        setQuantidadeCalotas(quantidadedePneus);
        quantidadeParafusosPneu = quantidadedePneus * 4;
        this.quantidadedePneus = quantidadedePneus;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;

    }

    public Integer getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(Integer arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public Integer getVidrosEletricos() {
        return vidrosEletricos;
    }

    public void setVidrosEletricos(Integer vidrosEletricos) {
        this.vidrosEletricos = vidrosEletricos;
    }

    public Integer getDirecaoEletrica() {
        return direcaoEletrica;
    }

    public void setDirecaoEletrica(Integer direcaoEletrica) {
        this.direcaoEletrica = direcaoEletrica;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusosPneu() {
        return quantidadeParafusosPneu;
    }

    public void setQuantidadeParafusosPneu(Integer quantidadeParafusosPneu) {
        this.quantidadeParafusosPneu = quantidadeParafusosPneu;
    }

    public void imprimeValores () {
        System.out.println("Quantidade de Pneus " + getQuantidadedePneus());
        System.out.println("Quantidade de calotas " + getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos pneu " + getQuantidadeParafusosPneu());
        System.out.println("Cor " + getCor());
        System.out.println("Quantidade de retrovisores "+ quantidadeRetrovisores);
        System.out.println("Tipo de motorização " + motor);
        System.out.println("Ar Condicionado " + getArCondicionado());
        System.out.println("Vidros Elétricos " + getVidrosEletricos());
        System.out.println("Direção Elétrica " + getDirecaoEletrica());
        System.out.println("Tipo de combustível " + combustivel);
        System.out.println("Quantidade de portas " + portas);

    }
}
