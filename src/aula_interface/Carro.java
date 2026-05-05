package aula08;

public class Carro {
    private String modelo;
    private String placa;
    private Integer ano;
    private Double valor;
    private String obs;
    
    Carro () {}
    
    Carro (String modelo, String placa, Integer ano, Double valor) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valor = valor;
        this.obs = obs;
    }

    Carro(String modelo, String placa, Integer ano, Double valor, String obs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo () {
        return modelo;
    }
    
    public void setPlaca (String placa) {
        this.placa = placa;
    }
    
     public String getPlaca () {
        return placa;
     }
     
     public void setAno (Integer ano) {
         this.ano = ano;
     }
     
     public Integer getAno () {
        return ano;
     }
     
     public void setObs (String obs) {
        this.obs = obs;
    }
    
     public String getObs () {
        return obs;
     }
    
}
