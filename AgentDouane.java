package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

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
import javax.persistence.Transient;

import sn.com.douane.ejb.demat.model.entities.DeclarationExtOuverture;
import sn.com.douane.ejb.demat.model.entities.DossEnlevEscorte;
import sn.com.douane.ejb.demat.model.entities.ObservationDeclaration;
import sn.com.douane.ejb.demat.model.entities.ObservationEnlevement;
import sn.com.douane.ejb.demat.model.entities.Operation;
import sn.com.douane.ejb.demat.model.entities.SequentielRendezVous;
import sn.com.douane.ejb.demat.model.entities.UniteDeVisitePhysique;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="AGENTDOUANE")
public class AgentDouane implements Serializable{

	private static final long serialVersionUID = 2091356732488636848L;

	@Id
	@Column(name="RCCODEAGENT", length=5, nullable=false)
	private String rcCodeAgent;
    
	@Column(name="RCCODEBURAFF", length=3, nullable=false)
	private String rcCodeBurAff;
	
	@Column(name="RCCODEPROFIL", length=10, nullable=false)
	private String rcCodeProfil;
	
	@Column(name="RCINDAUT", length=1, nullable=false)
    private String rcIndAut;
	
	@Column(name="RCCODEUSER", length=7, nullable=false)
	private String rcCodeUser;
	
	@Column(name="RCCODESECTION", length=3)
    private String rcCodeSection;
   
	@Column(name="RCCODEBURACT", length=3)
    private String rcCodeBurAct;
	
	@Column(name="RCREFAUT", length=15)
    private String rcRefAut;
	
	@Column(name="RCDATEAUT")
    private Date rcDateAut;
	
	@Column(name="RCNOMAGENT", length=50)
    private String rcNomAgent;
	
	@Column(name="RCPRENOMAGENT", length=50)
    private String rcPrenomAgent;
    
	@Column(name="RCCODEMAD", length=10)
    private String rcCodeMad;
	
	@Column(name="RCUSERMAJ", length=7)
	private String rcUserMaj; 
	
	@Column(name="DATEMAJ")
	private Date dateMaj; 
	
	@Column(name="IDUVP")
	private Long idUvp;
	
	@Column(name="IDXUVP")
	private Integer idXuvp;	

   

	private BureauDouane burDouaneAff; 

	private BureauDouane burDouaneAct;

	

}
