package br.com.wesley.mota.registrocartorio.model;

import javax.persistence.*;

@Entity
@Table(name = "cartorio")
public class Cartorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cd_cartorio")
    private Long id;

    @Column(name="nm_cartorio")
    private String nm_cartorio;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="CEP")
    private String CEP;

    @Column(name="numero")
    private Integer numero;

    @Column(name="tp_certidoes")
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
}
