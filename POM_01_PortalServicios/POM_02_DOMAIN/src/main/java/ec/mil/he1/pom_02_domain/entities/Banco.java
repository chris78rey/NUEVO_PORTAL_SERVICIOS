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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "BANCO")
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM Banco b")})
public class Banco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BAN_IDBANCO")
    private Long banIdbanco;
    @Column(name = "BAN_NOMBRE")
    private String banNombre;
    @Column(name = "BAN_CUENTA")
    private String banCuenta;
    @Column(name = "BAN_OFICIALCUENTA")
    private String banOficialcuenta;
    @Column(name = "BAN_CORREOCUENTA")
    private String banCorreocuenta;
    @Column(name = "BAN_MOVILOFILCUENTA")
    private String banMovilofilcuenta;
    @Column(name = "BAN_USER")
    private String banUser;

    public Banco() {
    }

    public Banco(Long banIdbanco) {
        this.banIdbanco = banIdbanco;
    }

    public Long getBanIdbanco() {
        return banIdbanco;
    }

    public void setBanIdbanco(Long banIdbanco) {
        this.banIdbanco = banIdbanco;
    }

    public String getBanNombre() {
        return banNombre;
    }

    public void setBanNombre(String banNombre) {
        this.banNombre = banNombre;
    }

    public String getBanCuenta() {
        return banCuenta;
    }

    public void setBanCuenta(String banCuenta) {
        this.banCuenta = banCuenta;
    }

    public String getBanOficialcuenta() {
        return banOficialcuenta;
    }

    public void setBanOficialcuenta(String banOficialcuenta) {
        this.banOficialcuenta = banOficialcuenta;
    }

    public String getBanCorreocuenta() {
        return banCorreocuenta;
    }

    public void setBanCorreocuenta(String banCorreocuenta) {
        this.banCorreocuenta = banCorreocuenta;
    }

    public String getBanMovilofilcuenta() {
        return banMovilofilcuenta;
    }

    public void setBanMovilofilcuenta(String banMovilofilcuenta) {
        this.banMovilofilcuenta = banMovilofilcuenta;
    }

    public String getBanUser() {
        return banUser;
    }

    public void setBanUser(String banUser) {
        this.banUser = banUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (banIdbanco != null ? banIdbanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        if ((this.banIdbanco == null && other.banIdbanco != null) || (this.banIdbanco != null && !this.banIdbanco.equals(other.banIdbanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Banco[ banIdbanco=" + banIdbanco + " ]";
    }
    
}
