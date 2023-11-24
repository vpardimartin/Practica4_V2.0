package org.practica4;

import java.util.Collection;
import java.util.Objects;

public class TiposClass {
    private int tipoId;
    private String nombreTipo;
    private String descripcionTipo;
    private Collection<PoderesClass> poderesByTipoId;

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getDescripcionTipo() {
        return descripcionTipo;
    }

    public void setDescripcionTipo(String descripcionTipo) {
        this.descripcionTipo = descripcionTipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TiposClass that = (TiposClass) o;
        return tipoId == that.tipoId && Objects.equals(nombreTipo, that.nombreTipo) && Objects.equals(descripcionTipo, that.descripcionTipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoId, nombreTipo, descripcionTipo);
    }

    public Collection<PoderesClass> getPoderesByTipoId() {
        return poderesByTipoId;
    }

    public void setPoderesByTipoId(Collection<PoderesClass> poderesByTipoId) {
        this.poderesByTipoId = poderesByTipoId;
    }
}
