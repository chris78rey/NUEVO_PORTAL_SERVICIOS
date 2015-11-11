/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "HISTORIALES_EMPLEADOS")
@NamedQueries({
    @NamedQuery(name = "HistorialesEmpleados.findAll", query = "SELECT h FROM HistorialesEmpleados h")})
public class HistorialesEmpleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistorialesEmpleadosPK historialesEmpleadosPK;
    @Column(name = "TIPO_ATRIBUTO")
    private String tipoAtributo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public HistorialesEmpleados() {
    }

    public HistorialesEmpleados(HistorialesEmpleadosPK historialesEmpleadosPK) {
        this.historialesEmpleadosPK = historialesEmpleadosPK;
    }

    public HistorialesEmpleados(String emprolEmpCodigo, int emprolCodigo, int codigo) {
        this.historialesEmpleadosPK = new HistorialesEmpleadosPK(emprolEmpCodigo, emprolCodigo, codigo);
    }

    public HistorialesEmpleadosPK getHistorialesEmpleadosPK() {
        return historialesEmpleadosPK;
    }

    public void setHistorialesEmpleadosPK(HistorialesEmpleadosPK historialesEmpleadosPK) {
        this.historialesEmpleadosPK = historialesEmpleadosPK;
    }

    public String getTipoAtributo() {
        return tipoAtributo;
    }

    public void setTipoAtributo(String tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historialesEmpleadosPK != null ? historialesEmpleadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialesEmpleados)) {
            return false;
        }
        HistorialesEmpleados other = (HistorialesEmpleados) object;
        if ((this.historialesEmpleadosPK == null && other.historialesEmpleadosPK != null) || (this.historialesEmpleadosPK != null && !this.historialesEmpleadosPK.equals(other.historialesEmpleadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.HistorialesEmpleados[ historialesEmpleadosPK=" + historialesEmpleadosPK + " ]";
    }
    
}
