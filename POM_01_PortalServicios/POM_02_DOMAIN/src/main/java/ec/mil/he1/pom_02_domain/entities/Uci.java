/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "UCI")
@NamedQueries({
    @NamedQuery(name = "Uci.findAll", query = "SELECT u FROM Uci u")})
public class Uci implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UciPK uciPK;
    @Column(name = "BIBLIOGRAFIA")
    private String bibliografia;
    @Column(name = "VENTILADOR")
    private Character ventilador;
    @Column(name = "FIO2")
    private Short fio2;
    @Column(name = "TEC")
    private Character tec;
    @Column(name = "PIC_NIVEL")
    private String picNivel;
    @Column(name = "PIC_VALOR")
    private Short picValor;
    @OneToMany(mappedBy = "uci", fetch = FetchType.LAZY)
    private List<FotosUci> fotosUciList;
    @JoinColumns({
        @JoinColumn(name = "EPC_PRMATN_NUMERO", referencedColumnName = "PRMATN_NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "EPC_PRMATN_PCN_NUMERO_HC", referencedColumnName = "PRMATN_PCN_NUMERO_HC", insertable = false, updatable = false)})
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Epicrisis epicrisis;

    public Uci() {
    }

    public Uci(UciPK uciPK) {
        this.uciPK = uciPK;
    }

    public Uci(int epcPrmatnNumero, int epcPrmatnPcnNumeroHc) {
        this.uciPK = new UciPK(epcPrmatnNumero, epcPrmatnPcnNumeroHc);
    }

    public UciPK getUciPK() {
        return uciPK;
    }

    public void setUciPK(UciPK uciPK) {
        this.uciPK = uciPK;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public Character getVentilador() {
        return ventilador;
    }

    public void setVentilador(Character ventilador) {
        this.ventilador = ventilador;
    }

    public Short getFio2() {
        return fio2;
    }

    public void setFio2(Short fio2) {
        this.fio2 = fio2;
    }

    public Character getTec() {
        return tec;
    }

    public void setTec(Character tec) {
        this.tec = tec;
    }

    public String getPicNivel() {
        return picNivel;
    }

    public void setPicNivel(String picNivel) {
        this.picNivel = picNivel;
    }

    public Short getPicValor() {
        return picValor;
    }

    public void setPicValor(Short picValor) {
        this.picValor = picValor;
    }

    public List<FotosUci> getFotosUciList() {
        return fotosUciList;
    }

    public void setFotosUciList(List<FotosUci> fotosUciList) {
        this.fotosUciList = fotosUciList;
    }

    public Epicrisis getEpicrisis() {
        return epicrisis;
    }

    public void setEpicrisis(Epicrisis epicrisis) {
        this.epicrisis = epicrisis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uciPK != null ? uciPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uci)) {
            return false;
        }
        Uci other = (Uci) object;
        if ((this.uciPK == null && other.uciPK != null) || (this.uciPK != null && !this.uciPK.equals(other.uciPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Uci[ uciPK=" + uciPK + " ]";
    }
    
}
