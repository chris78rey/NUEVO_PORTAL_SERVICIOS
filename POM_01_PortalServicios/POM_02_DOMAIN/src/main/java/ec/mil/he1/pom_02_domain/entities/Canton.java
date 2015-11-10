/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CANTON")
@NamedQueries({
    @NamedQuery(name = "Canton.findAll", query = "SELECT c FROM Canton c")})
public class Canton implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAN_IDCANTON")
    private String canIdcanton;
    @Column(name = "CAN_NOMBRE")
    private String canNombre;
    @Column(name = "CAN_USER")
    private String canUser;
    @JoinColumn(name = "PRV_IDPROVINCIA", referencedColumnName = "PRV_IDPROVINCIA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Provincia provincia;
    @OneToMany(mappedBy = "canton", fetch = FetchType.LAZY)
    private List<Parroquia> parroquiaList;

    public Canton() {
    }

    public Canton(String canIdcanton) {
        this.canIdcanton = canIdcanton;
    }

    public String getCanIdcanton() {
        return canIdcanton;
    }

    public void setCanIdcanton(String canIdcanton) {
        this.canIdcanton = canIdcanton;
    }

    public String getCanNombre() {
        return canNombre;
    }

    public void setCanNombre(String canNombre) {
        this.canNombre = canNombre;
    }

    public String getCanUser() {
        return canUser;
    }

    public void setCanUser(String canUser) {
        this.canUser = canUser;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public List<Parroquia> getParroquiaList() {
        return parroquiaList;
    }

    public void setParroquiaList(List<Parroquia> parroquiaList) {
        this.parroquiaList = parroquiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (canIdcanton != null ? canIdcanton.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Canton)) {
            return false;
        }
        Canton other = (Canton) object;
        if ((this.canIdcanton == null && other.canIdcanton != null) || (this.canIdcanton != null && !this.canIdcanton.equals(other.canIdcanton))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Canton[ canIdcanton=" + canIdcanton + " ]";
    }
    
}
