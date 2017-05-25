package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

// import tn.com.tw.java.exception.TwreException;

/**
 * TypeBureau EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "TypeBureau")
public class TypeBureau implements Serializable {	
  
	private static final long serialVersionUID = -5778995898045292392L;
	
	@Id
	@Column(name = "RCCODETYPEBUR", nullable=false)
	private Integer rccodetypebur;
	
	@Column(name = "RCLIBELLETYPEBUR", length=100, nullable=false)
    private String rclibelletypebur;
    
	@OneToMany(mappedBy = "typeBureau")
    private List<BureauDouane> bureauxDouane = new ArrayList<BureauDouane>();    
	

}
