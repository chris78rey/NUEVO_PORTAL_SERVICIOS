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
@Table(name = "PARROQUIAS")
@NamedQueries({
    @NamedQuery(name = "Parroquias.findAll", query = "SELECT p FROM Parroquias p")})
public class Parroquias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParroquiasPK parroquiasPK;
    @Column(name = "PARROQUIA")
    private String parroquia;
    @OneToMany(mappedBy = "parroquias", fetch = FetchType.LAZY)
    private List<Referentes> referentesList;
    @OneToMany(mappedBy = "parroquias", fetch = FetchType.LAZY)
    private List<Pacientes> pacientesList;
    @OneToMany(mappedBy = "parroquias1", fetch = FetchType.LAZY)
    private List<Pacientes> pacientesList1;
    @OneToMany(mappedBy = "parroquias", fetch = FetchType.LAZY)
    private List<SegUsuario> segUsuarioList;
    @JoinColumns({
        @JoinColumn(name = "CNT_PRV_CODIGO", referencedColumnName = "PRV_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "CNT_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cantones cantones;
    @OneToMany(mappedBy = "parroquias", fetch = FetchType.LAZY)
    private List<Empresas> empresasList;
    @OneToMany(mappedBy = "parroquias", fetch = FetchType.LAZY)
    private List<EmpleadosRoles> empleadosRolesList;
    @OneToMany(mappedBy = "parroquias", fetch = FetchType.LAZY)
    private List<UnidadesFamiliares> unidadesFamiliaresList;

    public Parroquias() {
    }

    public Parroquias(ParroquiasPK parroquiasPK) {
        this.parroquiasPK = parroquiasPK;
    }

    public Parroquias(String cntPrvCodigo, String cntCodigo, String codigo) {
        this.parroquiasPK = new ParroquiasPK(cntPrvCodigo, cntCodigo, codigo);
    }

    public ParroquiasPK getParroquiasPK() {
        return parroquiasPK;
    }

    public void setParroquiasPK(ParroquiasPK parroquiasPK) {
        this.parroquiasPK = parroquiasPK;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public List<Referentes> getReferentesList() {
        return referentesList;
    }

    public void setReferentesList(List<Referentes> referentesList) {
        this.referentesList = referentesList;
    }

    public List<Pacientes> getPacientesList() {
        return pacientesList;
    }

    public void setPacientesList(List<Pacientes> pacientesList) {
        this.pacientesList = pacientesList;
    }

    public List<Pacientes> getPacientesList1() {
        return pacientesList1;
    }

    public void setPacientesList1(List<Pacientes> pacientesList1) {
        this.pacientesList1 = pacientesList1;
    }

    public List<SegUsuario> getSegUsuarioList() {
        return segUsuarioList;
    }

    public void setSegUsuarioList(List<SegUsuario> segUsuarioList) {
        this.segUsuarioList = segUsuarioList;
    }

    public Cantones getCantones() {
        return cantones;
    }

    public void setCantones(Cantones cantones) {
        this.cantones = cantones;
    }

    public List<Empresas> getEmpresasList() {
        return empresasList;
    }

    public void setEmpresasList(List<Empresas> empresasList) {
        this.empresasList = empresasList;
    }

    public List<EmpleadosRoles> getEmpleadosRolesList() {
        return empleadosRolesList;
    }

    public void setEmpleadosRolesList(List<EmpleadosRoles> empleadosRolesList) {
        this.empleadosRolesList = empleadosRolesList;
    }

    public List<UnidadesFamiliares> getUnidadesFamiliaresList() {
        return unidadesFamiliaresList;
    }

    public void setUnidadesFamiliaresList(List<UnidadesFamiliares> unidadesFamiliaresList) {
        this.unidadesFamiliaresList = unidadesFamiliaresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parroquiasPK != null ? parroquiasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parroquias)) {
            return false;
        }
        Parroquias other = (Parroquias) object;
        if ((this.parroquiasPK == null && other.parroquiasPK != null) || (this.parroquiasPK != null && !this.parroquiasPK.equals(other.parroquiasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Parroquias[ parroquiasPK=" + parroquiasPK + " ]";
    }
    
}
