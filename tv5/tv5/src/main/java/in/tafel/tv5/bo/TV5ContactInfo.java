package in.tafel.tv5.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="TV5_CONTACT_INFO")
public class TV5ContactInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name="PURPOSE")
	private String purpose;
	
	@Column(name="ORGANIZATION_NAME")
	private String organizationName;
	
}
