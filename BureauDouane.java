package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonSegGenDec;
import sn.com.douane.ejb.declaration.model.entities.CritereLocalBae;
import sn.com.douane.ejb.declaration.model.entities.DdeModifSegenDec;
import sn.com.douane.ejb.declaration.model.entities.ExclusionPpm;
import sn.com.douane.ejb.declaration.model.entities.HSegArtDec;
import sn.com.douane.ejb.declaration.model.entities.LiquidArtDecl;
import sn.com.douane.ejb.declaration.model.entities.SegGenDec;
import sn.com.douane.ejb.declaration.model.entities.SpecVerifProd;
import sn.com.douane.ejb.declaration.model.entities.SpecVerifRegime;
import sn.com.douane.ejb.demat.model.entities.Agenda;
import sn.com.douane.ejb.demat.model.entities.BordereauCmc;
import sn.com.douane.ejb.demat.model.entities.BrouillonDecExtApe;
import sn.com.douane.ejb.demat.model.entities.BrouillonDemandeMainLevee;
import sn.com.douane.ejb.demat.model.entities.BrouillonDepotProvisoire;
import sn.com.douane.ejb.demat.model.entities.Cmc;
import sn.com.douane.ejb.demat.model.entities.Compte;
import sn.com.douane.ejb.demat.model.entities.DeclarationExtApe;
import sn.com.douane.ejb.demat.model.entities.DemandeMainLevee;
import sn.com.douane.ejb.demat.model.entities.DepotProvisoire;
import sn.com.douane.ejb.demat.model.entities.Facture;
import sn.com.douane.ejb.demat.model.entities.UniteDeVisitePhysique;
import sn.com.douane.ejb.manifeste.model.entities.ArticleManifeste;
import sn.com.douane.ejb.manifeste.model.entities.BrouillonSegenMan;
import sn.com.douane.ejb.manifeste.model.entities.SegmentGenManifeste;

/**
 * BureauDouane EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "BUREAUDOUANE")
public class BureauDouane implements Serializable {

	private static final long serialVersionUID = -5807443478607171903L;

	@Id
	@Column(name = "RCCODEBURDOUANE", length = 3, nullable = false)
	private String rccodeburdouane;

	@Column(name = "RCLIBELLEBURDOUANE", length = 100, nullable = false)
	private String rclibelleburdouane;

	@Column(name = "MANIFESTEOBLIGATOIRE", length = 1)
	private String manifesteobligatoire;

	@Column(name = "RCREPARTITION", length = 1)
	private String rcrepartition ;

	@Column(name = "RCCOMPETENCE", length = 2, nullable = false)
	private String rcCompetence;

	@Column(name = "RCTYPEBURDOUANE", nullable = false)
	private Integer rcTypeBurDouane;

	@Column(name = "RCGENREBUR", length = 10, nullable = false)
	private String rcGenreBur;
	
	@Column(name = "AGENDA")
	private Long agenda;

	@Column(name = "IDCOMPTE")
	private Long idcompte;	


	private List<AgentDouane> agentDouaneAffs;


	private List<AgentDouane> agentDouaneActs ;


	

	


}
