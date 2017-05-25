package sn.com.douane.ejb.rc.model.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CompBureau EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "COMPBUREAU")
public class CompBureau implements Serializable {	
  
	private static final long serialVersionUID = 374898981919162216L;

	@Id
	@Column(name = "RCCODECOMPETENCE", length = 2, nullable=false)
	private String rccodecompetence ;
	
	@Column(name = "RCDESCOMPETENCES", nullable=false)
    private String rcdescompetences;
    
    @OneToMany(mappedBy = "compBureau")
    private List<BureauDouane> bureaux = new ArrayList<BureauDouane>();   
    
 

}
