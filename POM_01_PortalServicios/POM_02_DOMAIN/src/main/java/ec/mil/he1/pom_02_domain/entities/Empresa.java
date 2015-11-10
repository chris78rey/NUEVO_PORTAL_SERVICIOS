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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "EMPRESA")
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")})
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMP_IDEMPRESA")
    private Long empIdempresa;
    @Column(name = "EMP_NOMBRE")
    private String empNombre;
    @Column(name = "EMP_REPRESENTANTE")
    private String empRepresentante;
    @Column(name = "EMP_DIRECCION")
    private String empDireccion;
    @Column(name = "EMP_TELEFONO")
    private Long empTelefono;
    @Column(name = "EMP_RUC")
    private Long empRuc;
    @Column(name = "EMP_CEDULAREPRESENTANTE")
    private String empCedularepresentante;
    @Column(name = "EMP_FAX")
    private String empFax;
    @Column(name = "EMP_TELEFONOREPRESENTANTE")
    private Long empTelefonorepresentante;
    @Column(name = "EMP_MAIL")
    private String empMail;
    @Lob
    @Column(name = "EMP_LOGO")
    private String empLogo;
    @Column(name = "EMP_CTACONTABLE")
    private String empCtacontable;
    @Column(name = "EMP_USER")
    private String empUser;
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<Rolpagos> rolpagosList;

    public Empresa() {
    }

    public Empresa(Long empIdempresa) {
        this.empIdempresa = empIdempresa;
    }

    public Long getEmpIdempresa() {
        return empIdempresa;
    }

    public void setEmpIdempresa(Long empIdempresa) {
        this.empIdempresa = empIdempresa;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpRepresentante() {
        return empRepresentante;
    }

    public void setEmpRepresentante(String empRepresentante) {
        this.empRepresentante = empRepresentante;
    }

    public String getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }

    public Long getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(Long empTelefono) {
        this.empTelefono = empTelefono;
    }

    public Long getEmpRuc() {
        return empRuc;
    }

    public void setEmpRuc(Long empRuc) {
        this.empRuc = empRuc;
    }

    public String getEmpCedularepresentante() {
        return empCedularepresentante;
    }

    public void setEmpCedularepresentante(String empCedularepresentante) {
        this.empCedularepresentante = empCedularepresentante;
    }

    public String getEmpFax() {
        return empFax;
    }

    public void setEmpFax(String empFax) {
        this.empFax = empFax;
    }

    public Long getEmpTelefonorepresentante() {
        return empTelefonorepresentante;
    }

    public void setEmpTelefonorepresentante(Long empTelefonorepresentante) {
        this.empTelefonorepresentante = empTelefonorepresentante;
    }

    public String getEmpMail() {
        return empMail;
    }

    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }

    public String getEmpLogo() {
        return empLogo;
    }

    public void setEmpLogo(String empLogo) {
        this.empLogo = empLogo;
    }

    public String getEmpCtacontable() {
        return empCtacontable;
    }

    public void setEmpCtacontable(String empCtacontable) {
        this.empCtacontable = empCtacontable;
    }

    public String getEmpUser() {
        return empUser;
    }

    public void setEmpUser(String empUser) {
        this.empUser = empUser;
    }

    public List<Rolpagos> getRolpagosList() {
        return rolpagosList;
    }

    public void setRolpagosList(List<Rolpagos> rolpagosList) {
        this.rolpagosList = rolpagosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empIdempresa != null ? empIdempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.empIdempresa == null && other.empIdempresa != null) || (this.empIdempresa != null && !this.empIdempresa.equals(other.empIdempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Empresa[ empIdempresa=" + empIdempresa + " ]";
    }
    
}
