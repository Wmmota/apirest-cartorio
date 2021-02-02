package br.com.wesley.mota.registrocartorio.controller.dto;

import br.com.wesley.mota.registrocartorio.model.Cartorio;

public class CartorioRs {

    public static CartorioRs converter(Cartorio c){
        var cartorio = new CartorioRs();
        cartorio.setId(c.getId());
        cartorio.setNm_cartorio(c.getNm_cartorio());
        cartorio.setLogradouro(c.getLogradouro());
        cartorio.setCEP(c.getCEP());
        cartorio.setNumero(c.getNumero(cartorio.getNumero()));
        cartorio.setTp_certidoes(c.getTp_certidoes());
        return cartorio;
    }

    private Long id;
    private String nm_cartorio;
    private String logradouro;
    private String CEP;
    private Integer numero;
    private String tp_certidoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Integer getNumero() {
        return numero;
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
}
