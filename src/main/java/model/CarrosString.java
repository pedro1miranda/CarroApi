package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarrosString {
    public String codigoFipe;
    public String nome;
    public String valor;
    public int anoModelo;
    public String combustivel;
    public String codigo;
    public String mesReferencia;
    public String siglaCombustivel;

    @Override
    public String toString() {
        return "CarrosString{" +
                "codigoFipe='" + codigoFipe + '\'' +
                ", nome='" + nome + '\'' +
                ", valor='" + valor + '\'' +
                ", anoModelo=" + anoModelo +
                ", combustivel='" + combustivel + '\'' +
                ", codigo='" + codigo + '\'' +
                ", mesReferencia='" + mesReferencia + '\'' +
                ", siglaCombustivel='" + siglaCombustivel + '\'' +
                '}';
    }
}
