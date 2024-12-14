package com.examen.models;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

@Entity
@Table(name = "SEG_REGISTRO_SESION")
public class RegistroSesion {

    @Id
    @Column(name = "SECUENCIA", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long secuencia;

    @Column(name = "COD_USUARIO", length = 32, nullable = false)
    private String codUsuario;

    @Column(name = "FECHA_CONEXION")
    private java.sql.Timestamp fechaConexion;

    @Column(name = "IP_CONEXION", length = 24)
    private String ipConexion;

    @Column(name = "RESULTADO", length = 3)
    private String resultado;

    @Column(name = "COD_ERROR", length = 5)
    private String codError;

    public RegistroSesion() {}

    public RegistroSesion(Long secuencia, String codUsuario, Timestamp fechaConexion, String ipConexion,
            String resultado, String codError) {
        this.secuencia = secuencia;
        this.codUsuario = codUsuario;
        this.fechaConexion = fechaConexion;
        this.ipConexion = ipConexion;
        this.resultado = resultado;
        this.codError = codError;
    }

    public Long getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Long secuencia) {
        this.secuencia = secuencia;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public java.sql.Timestamp getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(java.sql.Timestamp fechaConexion) {
        this.fechaConexion = fechaConexion;
    }

    public String getIpConexion() {
        return ipConexion;
    }

    public void setIpConexion(String ipConexion) {
        this.ipConexion = ipConexion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getCodError() {
        return codError;
    }

    public void setCodError(String codError) {
        this.codError = codError;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
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
        RegistroSesion other = (RegistroSesion) obj;
        if (codUsuario == null) {
            if (other.codUsuario != null)
                return false;
        } else if (!codUsuario.equals(other.codUsuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RegistroSesion [secuencia=" + secuencia + ", codUsuario=" + codUsuario + ", fechaConexion="
                + fechaConexion + ", ipConexion=" + ipConexion + ", resultado=" + resultado + ", codError=" + codError
                + "]";
    }

}
