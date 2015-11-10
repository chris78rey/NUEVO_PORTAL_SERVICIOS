/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "POST_ANES_MEDICAMENTOS")
@NamedQueries({
    @NamedQuery(name = "PostAnesMedicamentos.findAll", query = "SELECT p FROM PostAnesMedicamentos p")})
public class PostAnesMedicamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PostAnesMedicamentosPK postAnesMedicamentosPK;
    @Column(name = "MEDICAMENTO")
    private String medicamento;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumns({
        @JoinColumn(name = "PSTANS_RGSOPR_PRTOPRSLC_NUMERO", referencedColumnName = "RGSOPR_PRTOPRSLC_NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "PSTANS_RGSOPR_PRTOPRSLC_PCN_NU", referencedColumnName = "RGSOPR_PRTOPRSLC_PCN_NUMERO_HC", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PostAnestesicos postAnestesicos;

    public PostAnesMedicamentos() {
    }

    public PostAnesMedicamentos(PostAnesMedicamentosPK postAnesMedicamentosPK) {
        this.postAnesMedicamentosPK = postAnesMedicamentosPK;
    }

    public PostAnesMedicamentos(int pstansRgsoprPrtoprslcPcnNu, int pstansRgsoprPrtoprslcNumero, Date hora) {
        this.postAnesMedicamentosPK = new PostAnesMedicamentosPK(pstansRgsoprPrtoprslcPcnNu, pstansRgsoprPrtoprslcNumero, hora);
    }

    public PostAnesMedicamentosPK getPostAnesMedicamentosPK() {
        return postAnesMedicamentosPK;
    }

    public void setPostAnesMedicamentosPK(PostAnesMedicamentosPK postAnesMedicamentosPK) {
        this.postAnesMedicamentosPK = postAnesMedicamentosPK;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public PostAnestesicos getPostAnestesicos() {
        return postAnestesicos;
    }

    public void setPostAnestesicos(PostAnestesicos postAnestesicos) {
        this.postAnestesicos = postAnestesicos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postAnesMedicamentosPK != null ? postAnesMedicamentosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostAnesMedicamentos)) {
            return false;
        }
        PostAnesMedicamentos other = (PostAnesMedicamentos) object;
        if ((this.postAnesMedicamentosPK == null && other.postAnesMedicamentosPK != null) || (this.postAnesMedicamentosPK != null && !this.postAnesMedicamentosPK.equals(other.postAnesMedicamentosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PostAnesMedicamentos[ postAnesMedicamentosPK=" + postAnesMedicamentosPK + " ]";
    }
    
}
