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
 * GenreBureau EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "GENREBUREAU")
public class GenreBureau implements Serializable {
	
	private static final long serialVersionUID = 4914656502583956438L;
	
	@Id	
	@Column(name = "RCGENREBUREAU", length = 10, nullable=false)
	private String rcgenrebureau ;
	
	@Column(name = "RCDESGENREBUREAU", length=100, nullable=false)
    private String rcdesgenrebureau;	
	
	@OneToMany(mappedBy = "genreBureau")
    private List<BureauDouane> bureauxDouane = new ArrayList<BureauDouane>();
	

	
}
