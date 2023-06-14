package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.Database;
import com.mycompany.group234.model.Document;
import com.mycompany.group234.model.Project;
import com.mycompany.group234.model.ModelFile;
import com.mycompany.group234.model.BECapability;
import com.mycompany.group234.model.Capability;
import com.mycompany.group234.model.Industry;
import com.mycompany.group234.model.User;
import com.mycompany.group234.model.BETechnology;
import com.mycompany.group234.model.BackendApp;
import com.mycompany.group234.model.complex.BasicDetails;
import com.mycompany.group234.enums.IndustryType;
import com.mycompany.group234.enums.ModelType;
import com.mycompany.group234.enums.ModelCreator;
import com.mycompany.group234.converter.IndustryTypeConverter;
import com.mycompany.group234.converter.ModelTypeConverter;
import com.mycompany.group234.converter.ModelCreatorConverter;

@Entity(name = "BETechnologyFeatures")
@Table(schema = "\"generated_app\"", name = "\"BETechnologyFeatures\"")
@Data
public class BETechnologyFeatures{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"BeTechId\"")
	private Integer beTechId;

    
    @Column(name = "\"Features\"")
    private Integer features;
}