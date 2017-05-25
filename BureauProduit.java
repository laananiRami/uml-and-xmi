package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


/**
 * BureauProduit EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "BureauProduit")
public class BureauProduit implements Serializable {
	
	private static final long serialVersionUID = 3813165953862857426L;
	
	@Id
	@Column(name = "RCCODEPROD", nullable = false, length = 6)
    private String rccodeprod;
	    
	@Column(name = "RCPRECUEMOAPROD", nullable = false, length = 2)
    private String rcprecuemoaprod;
    
	@Column(name = "RCPRECSENPROD", nullable = false, length = 2)
    private String rcprecsenprod;
    
	@ManyToOne
	@JoinColumn(name = "RCCODEBUREAU", nullable = false)
    private BureauDouane burprodbur;

	
}
