package org.example;

import java.util.Collection;
import java.util.Objects;

public class EscenariosClass {
    private int escenariosId;
    private String nombreEscenario;
    private String descripcionEscenario;
    private Collection<HeroesClass> heroesByEscenariosId;
    private Collection<VillanosClass> villanosByEscenariosId;

    public int getEscenariosId() {
        return escenariosId;
    }

    public void setEscenariosId(int escenariosId) {
        this.escenariosId = escenariosId;
    }

    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public String getDescripcionEscenario() {
        return descripcionEscenario;
    }

    public void setDescripcionEscenario(String descripcionEscenario) {
        this.descripcionEscenario = descripcionEscenario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EscenariosClass that = (EscenariosClass) o;
        return escenariosId == that.escenariosId && Objects.equals(nombreEscenario, that.nombreEscenario) && Objects.equals(descripcionEscenario, that.descripcionEscenario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(escenariosId, nombreEscenario, descripcionEscenario);
    }

    public Collection<HeroesClass> getHeroesByEscenariosId() {
        return heroesByEscenariosId;
    }

    public void setHeroesByEscenariosId(Collection<HeroesClass> heroesByEscenariosId) {
        this.heroesByEscenariosId = heroesByEscenariosId;
    }

    public Collection<VillanosClass> getVillanosByEscenariosId() {
        return villanosByEscenariosId;
    }

    public void setVillanosByEscenariosId(Collection<VillanosClass> villanosByEscenariosId) {
        this.villanosByEscenariosId = villanosByEscenariosId;
    }
}
