package com.examen.pk;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class PerfilFuncionalidadPK implements Serializable {

    @Column(name = "COD_PERFIL", length = 8)
    private String codPerfil;

    @Column(name = "COD_FUNCIONALIDAD", length = 8)
    private String codFuncionalidad;

    @Column(name = "COD_MODULO", length = 16)
    private String codModulo;

    public PerfilFuncionalidadPK() {}

    public PerfilFuncionalidadPK(String codPerfil, String codFuncionalidad, String codModulo) {
        this.codPerfil = codPerfil;
        this.codFuncionalidad = codFuncionalidad;
        this.codModulo = codModulo;
    }

    public String getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
    }

    public String getCodFuncionalidad() {
        return codFuncionalidad;
    }

    public void setCodFuncionalidad(String codFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
    }

    public String getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(String codModulo) {
        this.codModulo = codModulo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codPerfil == null) ? 0 : codPerfil.hashCode());
        result = prime * result + ((codFuncionalidad == null) ? 0 : codFuncionalidad.hashCode());
        result = prime * result + ((codModulo == null) ? 0 : codModulo.hashCode());
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
        PerfilFuncionalidadPK other = (PerfilFuncionalidadPK) obj;
        if (codPerfil == null) {
            if (other.codPerfil != null)
                return false;
        } else if (!codPerfil.equals(other.codPerfil))
            return false;
        if (codFuncionalidad == null) {
            if (other.codFuncionalidad != null)
                return false;
        } else if (!codFuncionalidad.equals(other.codFuncionalidad))
            return false;
        if (codModulo == null) {
            if (other.codModulo != null)
                return false;
        } else if (!codModulo.equals(other.codModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PerfilFuncionalidadPK [codPerfil=" + codPerfil + ", codFuncionalidad=" + codFuncionalidad
                + ", codModulo=" + codModulo + "]";
    }

    

}