/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ARCHIVOS_IMAGENES")
@NamedQueries({
    @NamedQuery(name = "ArchivosImagenes.findAll", query = "SELECT a FROM ArchivosImagenes a")})
public class ArchivosImagenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "NUMERO_DE_MAMAS")
    private String numeroDeMamas;
    @Column(name = "NUMERO_DE_ULTRASONIDO")
    private String numeroDeUltrasonido;
    @Column(name = "NUMERO_RADIOLOGICO")
    private String numeroRadiologico;
    @Column(name = "NUMERO_TOMOGRAFICO")
    private String numeroTomografico;
    @Column(name = "NUMERO_MEDICINA_NUCLEAR")
    private String numeroMedicinaNuclear;
    @Column(name = "NUMERO_RESONANCIA_MAGNETICA")
    private String numeroResonanciaMagnetica;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;

    public ArchivosImagenes() {
    }

    public ArchivosImagenes(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getNumeroDeMamas() {
        return numeroDeMamas;
    }

    public void setNumeroDeMamas(String numeroDeMamas) {
        this.numeroDeMamas = numeroDeMamas;
    }

    public String getNumeroDeUltrasonido() {
        return numeroDeUltrasonido;
    }

    public void setNumeroDeUltrasonido(String numeroDeUltrasonido) {
        this.numeroDeUltrasonido = numeroDeUltrasonido;
    }

    public String getNumeroRadiologico() {
        return numeroRadiologico;
    }

    public void setNumeroRadiologico(String numeroRadiologico) {
        this.numeroRadiologico = numeroRadiologico;
    }

    public String getNumeroTomografico() {
        return numeroTomografico;
    }

    public void setNumeroTomografico(String numeroTomografico) {
        this.numeroTomografico = numeroTomografico;
    }

    public String getNumeroMedicinaNuclear() {
        return numeroMedicinaNuclear;
    }

    public void setNumeroMedicinaNuclear(String numeroMedicinaNuclear) {
        this.numeroMedicinaNuclear = numeroMedicinaNuclear;
    }

    public String getNumeroResonanciaMagnetica() {
        return numeroResonanciaMagnetica;
    }

    public void setNumeroResonanciaMagnetica(String numeroResonanciaMagnetica) {
        this.numeroResonanciaMagnetica = numeroResonanciaMagnetica;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcnNumeroHc != null ? pcnNumeroHc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArchivosImagenes)) {
            return false;
        }
        ArchivosImagenes other = (ArchivosImagenes) object;
        if ((this.pcnNumeroHc == null && other.pcnNumeroHc != null) || (this.pcnNumeroHc != null && !this.pcnNumeroHc.equals(other.pcnNumeroHc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ArchivosImagenes[ pcnNumeroHc=" + pcnNumeroHc + " ]";
    }
    
}
