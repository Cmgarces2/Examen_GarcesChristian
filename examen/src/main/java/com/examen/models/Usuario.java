package com.examen.models;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.*;

@Entity
@Table(name = "SEG_USUARIO")
public class Usuario {

    @Id
    @Column(name = "COD_USUARIO", length = 30, nullable = false)
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "COD_PERFIL")
    private Perfil perfil;

    @Column(name = "MAIL", length = 128)
    private String mail;

    @Column(name = "NOMBRE", length = 128)
    private String nombre;

    @Column(name = "TELEFONO", length = 10)
    private String telefono;

    @Column(name = "CLAVE", length = 64)
    private String clave;

    @Column(name = "ESTADO", length = 3)
    private String estado;

    @Column(name = "FECHA_CREACION")
    private java.sql.Timestamp fechaCreacion;

    @Column(name = "FECHA_CAMBIO_CLAVE")
    private java.sql.Date fechaCambioClave;

    @Column(name = "NRO_INTENTOS_FALLIDOS")
    private Integer intentosFallidos;

    @Column(name = "FECHA_ULTIMA_SESION")
    private java.sql.Timestamp ultimaSesion;

    @Column(name = "SUELDO", precision = 10, scale = 2)
    private java.math.BigDecimal sueldo;

    public Usuario() {}

    public Usuario(String codigo, Perfil perfil, String mail, String nombre, String telefono, String clave,
            String estado, Timestamp fechaCreacion, Date fechaCambioClave, Integer intentosFallidos,
            Timestamp ultimaSesion, BigDecimal sueldo) {
        this.codigo = codigo;
        this.perfil = perfil;
        this.mail = mail;
        this.nombre = nombre;
        this.telefono = telefono;
        this.clave = clave;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaCambioClave = fechaCambioClave;
        this.intentosFallidos = intentosFallidos;
        this.ultimaSesion = ultimaSesion;
        this.sueldo = sueldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public java.sql.Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(java.sql.Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public java.sql.Date getFechaCambioClave() {
        return fechaCambioClave;
    }

    public void setFechaCambioClave(java.sql.Date fechaCambioClave) {
        this.fechaCambioClave = fechaCambioClave;
    }

    public Integer getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(Integer intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public java.sql.Timestamp getUltimaSesion() {
        return ultimaSesion;
    }

    public void setUltimaSesion(java.sql.Timestamp ultimaSesion) {
        this.ultimaSesion = ultimaSesion;
    }

    public java.math.BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(java.math.BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        Usuario other = (Usuario) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [codigo=" + codigo + ", perfil=" + perfil + ", mail=" + mail + ", nombre=" + nombre
                + ", telefono=" + telefono + ", clave=" + clave + ", estado=" + estado + ", fechaCreacion="
                + fechaCreacion + ", fechaCambioClave=" + fechaCambioClave + ", intentosFallidos=" + intentosFallidos
                + ", ultimaSesion=" + ultimaSesion + ", sueldo=" + sueldo + "]";
    }

    
}
