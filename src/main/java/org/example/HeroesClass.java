package org.example;

import java.util.Objects;

public class HeroesClass {
    private int heroesId;
    private String nombreHeroe;
    private Integer poderHeroeId;
    private Integer escenarioFavoritoHeroeId;
    private Double ataque;
    private Double defensa;
    private Double vida;
    private Integer nivel;
    private String fortalezas;
    private String debilidades;
    private String alias;
    private PoderesClass poderesByPoderHeroeId;
    private EscenariosClass escenariosByEscenarioFavoritoHeroeId;

    public int getHeroesId() {
        return heroesId;
    }

    public void setHeroesId(int heroesId) {
        this.heroesId = heroesId;
    }

    public String getNombreHeroe() {
        return nombreHeroe;
    }

    public void setNombreHeroe(String nombreHeroe) {
        this.nombreHeroe = nombreHeroe;
    }

    public Integer getPoderHeroeId() {
        return poderHeroeId;
    }

    public void setPoderHeroeId(Integer poderHeroeId) {
        this.poderHeroeId = poderHeroeId;
    }

    public Integer getEscenarioFavoritoHeroeId() {
        return escenarioFavoritoHeroeId;
    }

    public void setEscenarioFavoritoHeroeId(Integer escenarioFavoritoHeroeId) {
        this.escenarioFavoritoHeroeId = escenarioFavoritoHeroeId;
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
        HeroesClass that = (HeroesClass) o;
        return heroesId == that.heroesId && Objects.equals(nombreHeroe, that.nombreHeroe) && Objects.equals(poderHeroeId, that.poderHeroeId) && Objects.equals(escenarioFavoritoHeroeId, that.escenarioFavoritoHeroeId) && Objects.equals(ataque, that.ataque) && Objects.equals(defensa, that.defensa) && Objects.equals(vida, that.vida) && Objects.equals(nivel, that.nivel) && Objects.equals(fortalezas, that.fortalezas) && Objects.equals(debilidades, that.debilidades) && Objects.equals(alias, that.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heroesId, nombreHeroe, poderHeroeId, escenarioFavoritoHeroeId, ataque, defensa, vida, nivel, fortalezas, debilidades, alias);
    }

    public PoderesClass getPoderesByPoderHeroeId() {
        return poderesByPoderHeroeId;
    }

    public void setPoderesByPoderHeroeId(PoderesClass poderesByPoderHeroeId) {
        this.poderesByPoderHeroeId = poderesByPoderHeroeId;
    }

    public EscenariosClass getEscenariosByEscenarioFavoritoHeroeId() {
        return escenariosByEscenarioFavoritoHeroeId;
    }

    public void setEscenariosByEscenarioFavoritoHeroeId(EscenariosClass escenariosByEscenarioFavoritoHeroeId) {
        this.escenariosByEscenarioFavoritoHeroeId = escenariosByEscenarioFavoritoHeroeId;
    }
}
