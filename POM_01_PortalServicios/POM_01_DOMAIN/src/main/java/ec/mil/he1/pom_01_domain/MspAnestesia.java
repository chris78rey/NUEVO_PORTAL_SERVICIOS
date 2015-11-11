/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "MSP_ANESTESIA")
@NamedQueries({
    @NamedQuery(name = "MspAnestesia.findAll", query = "SELECT m FROM MspAnestesia m")})
public class MspAnestesia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MspAnestesiaPK mspAnestesiaPK;
    @Column(name = "CODIGO_GRUPO")
    private BigInteger codigoGrupo;
    @Column(name = "DESCRIPCION_GRUPO")
    private String descripcionGrupo;
    @Column(name = "CODIGO_SUBGRUPO")
    private String codigoSubgrupo;
    @Column(name = "DESCRIPCION_SUBGRUPO")
    private String descripcionSubgrupo;
    @Column(name = "CODIGO_SUBGRUPO_1")
    private String codigoSubgrupo1;
    @Column(name = "DESCRIPCION_SUBGRUPO_1")
    private String descripcionSubgrupo1;
    @Column(name = "DESCRIPCION_ITEM")
    private String descripcionItem;
    @Column(name = "UNIDADES")
    private BigInteger unidades;

    public MspAnestesia() {
    }

    public MspAnestesia(MspAnestesiaPK mspAnestesiaPK) {
        this.mspAnestesiaPK = mspAnestesiaPK;
    }

    public MspAnestesia(String codigoItem, String convenio, String tipo) {
        this.mspAnestesiaPK = new MspAnestesiaPK(codigoItem, convenio, tipo);
    }

    public MspAnestesiaPK getMspAnestesiaPK() {
        return mspAnestesiaPK;
    }

    public void setMspAnestesiaPK(MspAnestesiaPK mspAnestesiaPK) {
        this.mspAnestesiaPK = mspAnestesiaPK;
    }

    public BigInteger getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(BigInteger codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getDescripcionGrupo() {
        return descripcionGrupo;
    }

    public void setDescripcionGrupo(String descripcionGrupo) {
        this.descripcionGrupo = descripcionGrupo;
    }

    public String getCodigoSubgrupo() {
        return codigoSubgrupo;
    }

    public void setCodigoSubgrupo(String codigoSubgrupo) {
        this.codigoSubgrupo = codigoSubgrupo;
    }

    public String getDescripcionSubgrupo() {
        return descripcionSubgrupo;
    }

    public void setDescripcionSubgrupo(String descripcionSubgrupo) {
        this.descripcionSubgrupo = descripcionSubgrupo;
    }

    public String getCodigoSubgrupo1() {
        return codigoSubgrupo1;
    }

    public void setCodigoSubgrupo1(String codigoSubgrupo1) {
        this.codigoSubgrupo1 = codigoSubgrupo1;
    }

    public String getDescripcionSubgrupo1() {
        return descripcionSubgrupo1;
    }

    public void setDescripcionSubgrupo1(String descripcionSubgrupo1) {
        this.descripcionSubgrupo1 = descripcionSubgrupo1;
    }

    public String getDescripcionItem() {
        return descripcionItem;
    }

    public void setDescripcionItem(String descripcionItem) {
        this.descripcionItem = descripcionItem;
    }

    public BigInteger getUnidades() {
        return unidades;
    }

    public void setUnidades(BigInteger unidades) {
        this.unidades = unidades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mspAnestesiaPK != null ? mspAnestesiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspAnestesia)) {
            return false;
        }
        MspAnestesia other = (MspAnestesia) object;
        if ((this.mspAnestesiaPK == null && other.mspAnestesiaPK != null) || (this.mspAnestesiaPK != null && !this.mspAnestesiaPK.equals(other.mspAnestesiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MspAnestesia[ mspAnestesiaPK=" + mspAnestesiaPK + " ]";
    }
    
}
