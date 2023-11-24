package org.example;

import java.util.Collection;
import java.util.Objects;

public class PoderesClass {
    private int poderId;
    private String nombrePoder;
    private String descripcionPoder;
    private Integer tipoPoderId;
    private Byte asignado;
    private String tipoEntidad;
    private Collection<HeroesClass> heroesByPoderId;
    private TiposClass tiposByTipoPoderId;
    private Collection<VillanosClass> villanosByPoderId;

    public int getPoderId() {
        return poderId;
    }

    public void setPoderId(int poderId) {
        this.poderId = poderId;
    }

    public String getNombrePoder() {
        return nombrePoder;
    }

    public void setNombrePoder(String nombrePoder) {
        this.nombrePoder = nombrePoder;
    }

    public String getDescripcionPoder() {
        return descripcionPoder;
    }

    public void setDescripcionPoder(String descripcionPoder) {
        this.descripcionPoder = descripcionPoder;
    }

    public Integer getTipoPoderId() {
        return tipoPoderId;
    }

    public void setTipoPoderId(Integer tipoPoderId) {
        this.tipoPoderId = tipoPoderId;
    }

    public Byte getAsignado() {
        return asignado;
    }

    public void setAsignado(Byte asignado) {
        this.asignado = asignado;
    }

    public String getTipoEntidad() {
        return tipoEntidad;
    }

    public void setTipoEntidad(String tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoderesClass that = (PoderesClass) o;
        return poderId == that.poderId && Objects.equals(nombrePoder, that.nombrePoder) && Objects.equals(descripcionPoder, that.descripcionPoder) && Objects.equals(tipoPoderId, that.tipoPoderId) && Objects.equals(asignado, that.asignado) && Objects.equals(tipoEntidad, that.tipoEntidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poderId, nombrePoder, descripcionPoder, tipoPoderId, asignado, tipoEntidad);
    }

    public Collection<HeroesClass> getHeroesByPoderId() {
        return heroesByPoderId;
    }

    public void setHeroesByPoderId(Collection<HeroesClass> heroesByPoderId) {
        this.heroesByPoderId = heroesByPoderId;
    }

    public TiposClass getTiposByTipoPoderId() {
        return tiposByTipoPoderId;
    }

    public void setTiposByTipoPoderId(TiposClass tiposByTipoPoderId) {
        this.tiposByTipoPoderId = tiposByTipoPoderId;
    }

    public Collection<VillanosClass> getVillanosByPoderId() {
        return villanosByPoderId;
    }

    public void setVillanosByPoderId(Collection<VillanosClass> villanosByPoderId) {
        this.villanosByPoderId = villanosByPoderId;
    }
}
