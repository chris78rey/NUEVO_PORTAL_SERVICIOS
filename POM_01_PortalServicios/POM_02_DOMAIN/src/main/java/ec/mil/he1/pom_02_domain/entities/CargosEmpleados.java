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
@Table(name = "CARGOS_EMPLEADOS")
@NamedQueries({
    @NamedQuery(name = "CargosEmpleados.findAll", query = "SELECT c FROM CargosEmpleados c")})
public class CargosEmpleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CargosEmpleadosPK cargosEmpleadosPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "OCPEMP_CODIGO")
    private String ocpempCodigo;
    @Column(name = "GRADO_RESPONSABILIDAD")
    private Character gradoResponsabilidad;
    @Column(name = "GRADO")
    private String grado;
    @OneToMany(mappedBy = "cargosEmpleados", fetch = FetchType.LAZY)
    private List<EmpleadosRoles> empleadosRolesList;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;

    public CargosEmpleados() {
    }

    public CargosEmpleados(CargosEmpleadosPK cargosEmpleadosPK) {
        this.cargosEmpleadosPK = cargosEmpleadosPK;
    }

    public CargosEmpleados(String empCodigo, String codigo) {
        this.cargosEmpleadosPK = new CargosEmpleadosPK(empCodigo, codigo);
    }

    public CargosEmpleadosPK getCargosEmpleadosPK() {
        return cargosEmpleadosPK;
    }

    public void setCargosEmpleadosPK(CargosEmpleadosPK cargosEmpleadosPK) {
        this.cargosEmpleadosPK = cargosEmpleadosPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getOcpempCodigo() {
        return ocpempCodigo;
    }

    public void setOcpempCodigo(String ocpempCodigo) {
        this.ocpempCodigo = ocpempCodigo;
    }

    public Character getGradoResponsabilidad() {
        return gradoResponsabilidad;
    }

    public void setGradoResponsabilidad(Character gradoResponsabilidad) {
        this.gradoResponsabilidad = gradoResponsabilidad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public List<EmpleadosRoles> getEmpleadosRolesList() {
        return empleadosRolesList;
    }

    public void setEmpleadosRolesList(List<EmpleadosRoles> empleadosRolesList) {
        this.empleadosRolesList = empleadosRolesList;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargosEmpleadosPK != null ? cargosEmpleadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargosEmpleados)) {
            return false;
        }
        CargosEmpleados other = (CargosEmpleados) object;
        if ((this.cargosEmpleadosPK == null && other.cargosEmpleadosPK != null) || (this.cargosEmpleadosPK != null && !this.cargosEmpleadosPK.equals(other.cargosEmpleadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CargosEmpleados[ cargosEmpleadosPK=" + cargosEmpleadosPK + " ]";
    }
    
}
