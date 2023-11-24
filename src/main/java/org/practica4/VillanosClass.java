package org.practica4;

import java.util.Objects;

public class VillanosClass {
    private int villanoId;
    private String nombreVillano;
    private Integer poderVillanoId;
    private Integer escenarioFavoritoVillanoId;
    private Double ataque;
    private Double defensa;
    private Double vida;
    private Integer nivel;
    private String fortalezas;
    private String debilidades;
    private String alias;
    private PoderesClass poderesByPoderVillanoId;
    private EscenariosClass escenariosByEscenarioFavoritoVillanoId;

    public int getVillanoId() {
        return villanoId;
    }

    public void setVillanoId(int villanoId) {
        this.villanoId = villanoId;
    }

    public String getNombreVillano() {
        return nombreVillano;
    }

    public void setNombreVillano(String nombreVillano) {
        this.nombreVillano = nombreVillano;
    }

    public Integer getPoderVillanoId() {
        return poderVillanoId;
    }

    public void setPoderVillanoId(Integer poderVillanoId) {
        this.poderVillanoId = poderVillanoId;
    }

    public Integer getEscenarioFavoritoVillanoId() {
        return escenarioFavoritoVillanoId;
    }

    public void setEscenarioFavoritoVillanoId(Integer escenarioFavoritoVillanoId) {
        this.escenarioFavoritoVillanoId = escenarioFavoritoVillanoId;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public Double getDefensa() {
        return defensa;
    }

    public void setDefensa(Double defensa) {
        this.defensa = defensa;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getFortalezas() {
        return fortalezas;
    }

    public void setFortalezas(String fortalezas) {
        this.fortalezas = fortalezas;
    }

    public String getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(String debilidades) {
        this.debilidades = debilidades;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillanosClass that = (VillanosClass) o;
        return villanoId == that.villanoId && Objects.equals(nombreVillano, that.nombreVillano) && Objects.equals(poderVillanoId, that.poderVillanoId) && Objects.equals(escenarioFavoritoVillanoId, that.escenarioFavoritoVillanoId) && Objects.equals(ataque, that.ataque) && Objects.equals(defensa, that.defensa) && Objects.equals(vida, that.vida) && Objects.equals(nivel, that.nivel) && Objects.equals(fortalezas, that.fortalezas) && Objects.equals(debilidades, that.debilidades) && Objects.equals(alias, that.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(villanoId, nombreVillano, poderVillanoId, escenarioFavoritoVillanoId, ataque, defensa, vida, nivel, fortalezas, debilidades, alias);
    }

    public PoderesClass getPoderesByPoderVillanoId() {
        return poderesByPoderVillanoId;
    }

    public void setPoderesByPoderVillanoId(PoderesClass poderesByPoderVillanoId) {
        this.poderesByPoderVillanoId = poderesByPoderVillanoId;
    }

    public EscenariosClass getEscenariosByEscenarioFavoritoVillanoId() {
        return escenariosByEscenarioFavoritoVillanoId;
    }

    public void setEscenariosByEscenarioFavoritoVillanoId(EscenariosClass escenariosByEscenarioFavoritoVillanoId) {
        this.escenariosByEscenarioFavoritoVillanoId = escenariosByEscenarioFavoritoVillanoId;
    }
}
