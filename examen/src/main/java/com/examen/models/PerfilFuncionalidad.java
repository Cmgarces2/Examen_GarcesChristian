package com.examen.models;

import com.examen.pk.PerfilFuncionalidadPK;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

@Entity
@Table(name = "SEG_PERFIL_FUNCIONALIDAD")
public class PerfilFuncionalidad {

    @EmbeddedId
    private PerfilFuncionalidadPK id;

    @Column(name = "ORDEN")
    private Integer orden;

    @Column(name = "ESTADO", length = 3)
    private String estado;

    @Column(name = "ADMITE_CREACION")
    private Boolean admiteCreacion;

    @Column(name = "ADMITE_MODIFICACION")
    private Boolean admiteModificacion;

    public PerfilFuncionalidad() {}

    public PerfilFuncionalidad(PerfilFuncionalidadPK id, Integer orden, String estado, Boolean admiteCreacion,
            Boolean admiteModificacion) {
        this.id = id;
        this.orden = orden;
        this.estado = estado;
        this.admiteCreacion = admiteCreacion;
        this.admiteModificacion = admiteModificacion;
    }

    public PerfilFuncionalidadPK getId() {
        return id;
    }

    public void setId(PerfilFuncionalidadPK id) {
        this.id = id;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getAdmiteCreacion() {
        return admiteCreacion;
    }

    public void setAdmiteCreacion(Boolean admiteCreacion) {
        this.admiteCreacion = admiteCreacion;
    }

    public Boolean getAdmiteModificacion() {
        return admiteModificacion;
    }

    public void setAdmiteModificacion(Boolean admiteModificacion) {
        this.admiteModificacion = admiteModificacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PerfilFuncionalidad other = (PerfilFuncionalidad) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PerfilFuncionalidad [id=" + id + ", orden=" + orden + ", estado=" + estado + ", admiteCreacion="
                + admiteCreacion + ", admiteModificacion=" + admiteModificacion + "]";
    }

    

}
