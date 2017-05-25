package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.entities.DdeModifSegartDec;
import sn.com.douane.ejb.demat.model.entities.BrouillonDecExt;
import sn.com.douane.ejb.demat.model.entities.BrouillonDecExtApe;
import sn.com.douane.ejb.demat.model.entities.BrouillonDecExtOuv;
import sn.com.douane.ejb.demat.model.entities.DeclarationExt;
import sn.com.douane.ejb.demat.model.entities.DeclarationExtApe;
import sn.com.douane.ejb.demat.model.entities.DeclarationExtOuverture;
import sn.com.douane.ejb.demat.model.entities.Lotissement;
import sn.com.douane.ejb.demat.model.entities.PriseEnChargeMarchandise;

/**
 * 
 * @author nesrine
 * 
 */
@Entity
@Table(name = "MAD")
public class Mad implements Serializable {

	private static final long serialVersionUID = 386322172985547874L;

	@Id
	@Column(name = "CODEMAD", length = 10, nullable = false)
	private String codeMad;

	@Column(name = "CODETYPEMAD", length = 1, nullable = false)
	private String codeTypeMad;

	@Column(name = "INDLOTISSEMENT", length = 1, nullable = false)
	private String indLotissement;

	@Column(name = "CODEPPMMAD", length = 5, nullable = false)
	private String rcCodePpm;

	@Column(name = "AGREEMENTMAD", length = 5, nullable = false)
	private String agreementMad;

	@Column(name = "DESIGNATIONMAD", length = 100, nullable = false)
	private String designationMad;

	@Column(name = "EMPLACEMENTMAD", length = 100)
	private String emplacementMad;

	@Column(name = "DATEAGREEMENTMAD")
	private Date dateAgreementMad;	

	@Column(name = "RCCODEBURDOUANE",columnDefinition="CHAR(3)",nullable = false)
	private String rcCodeBurdouane;
	
	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "RCCODEBURDOUANE", insertable = false, updatable = false)
	private BureauDouane bureauDouane;

	

}
