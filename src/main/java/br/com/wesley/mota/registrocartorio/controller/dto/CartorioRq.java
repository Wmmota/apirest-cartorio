package br.com.wesley.mota.registrocartorio.controller.dto;

public class CartorioRq {
    private String nm_cartorio;
    private String logradouro;
    private String CEP;
    private Integer numero;
    private String tp_certidoes;

    public String getNm_cartorio() {
        return nm_cartorio;
    }

    public void setNm_cartorio(String nm_cartorio) {
        this.nm_cartorio = nm_cartorio;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Integer getNumero(Integer numero) {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTp_certidoes() {
        return tp_certidoes;
    }

    public void setTp_certidoes(String tp_certidoes) {
        this.tp_certidoes = tp_certidoes;
    }

    public Integer getNumero() {
        return numero;
    }
}
