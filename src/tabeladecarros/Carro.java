package tabeladecarros;

public class Carro {
    private String modelo;
    private Integer ano;
    private Double valor;

    Carro() {};

    Carro(String modelo, Integer ano, Double valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getModelo () {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno () {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor () {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
