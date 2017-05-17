package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.demat.model.entities.BrouillonDecExt;
import sn.com.douane.ejb.demat.model.entities.BrouillonDecExtOuv;
import sn.com.douane.ejb.demat.model.entities.BrouillonDecextVisite;
import sn.com.douane.ejb.demat.model.entities.DeclarationExt;
import sn.com.douane.ejb.demat.model.entities.DeclarationExtOuverture;
import sn.com.douane.ejb.demat.model.entities.DeclarationExtVisite;
import sn.com.douane.ejb.demat.model.entities.ObservationDeclaration;
import sn.com.douane.ejb.demat.model.entities.QuittanceConsignation;
import sn.com.douane.ejb.demat.model.entities.Registre;

/**
 * 
 * @author nesrine
 * 
 */
@Entity
@Table(name = "UTILISATEUR")
@NamedQueries(@NamedQuery(name = "findAllUser", query = "select object(o) from Utilisateur o"))
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 3493665878291238246L;

	@Id
	@Column(name = "RCCODUSER", length = 7, nullable = false)
	private String rcCodUser;

	@Column(name = "RCIDENTIFICATION", length = 255, nullable = false)
	private String rcIdentification;

	@Column(name = "RCCODEPROFIL", length = 10, nullable = false)
	private String rcCodeProfil;

	@Column(name = "RCMOTPASSE", length = 100, nullable = false)
	private String rcMotPasse;

	@Column(name = "RCTYPEUSER", length = 1, nullable = false)
	private String rcTypeUser;

	@Column(name = "RCETATACTIF", length = 1)
	private String rcEtatActif;

	@Column(name = "RCINDCONNECT", length = 1)
	private String rcIndconnect;

	@Column(name = "RCISADMIN", length = 1)
	private String rcIsAdmin;

	@Column(name = "MODULE1", length = 20)
	private String module1;

	@Column(name = "NOMXML", length = 20)
	private String nomXml;

	@Column(name = "RCEMAIL", length = 50)
	private String rcEmail;

	@Column(name = "RCINDENR", length = 1)
	private String rcIndEnr;

	@Column(name = "RCINDPREREG", length = 1)
	private String rcIndprereg;
	
	@Column(name = "RCETATMESSAGE", columnDefinition="CHAR(1)")
	private String rcEtatMessage;
	
	@Column(name = "ADDRESS1", length = 20)
	private String address1;
	
	@Column(name = "ADDRESS2", length = 20)
	private String address2;
	
	@Column(name = "CITY", length = 20)
	private String city;
	
	@Column(name = "ZIP", length = 10)
	private String zip;
	
	@Column(name= "COUNTRY", length = 30)
	private String country;
	
	@Column(name = "CODEGSPP", length = 50)
	private String codeGSPP;


	/*********  intergration new methodes ***/
	@Column(name = "RCDATEPROCHAINLOGIN")
	private Timestamp rcDateProchainLogin;
	
	@Column(name = "RCNBTENTLOGIN", length = 1)
	private Integer rcNbTentLogin;
	
	@Column(name = "RCDATEEXPIREMOTPASSE")
	private Timestamp rcDateExpireMotPasse;
	


	@ManyToOne(targetEntity = TypeUtilisateur.class)
	@JoinColumn(name = "RCTYPEUSER", insertable = false, updatable = false)
	private TypeUtilisateur typeUser;

	
	

}
