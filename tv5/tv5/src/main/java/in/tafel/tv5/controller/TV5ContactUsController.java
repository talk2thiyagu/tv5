package in.tafel.tv5.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.tafel.tv5.bo.TV5ContactInfo;
import in.tafel.tv5.repository.TV5ContactInfoRepository;
import in.tafel.tv5.request.ContactInfo;

@RestController
@RequestMapping("/tv5")
@CrossOrigin
public class TV5ContactUsController {
	
	@Autowired
	private TV5ContactInfoRepository tv5ContactInfoRepo;

	@PostMapping("/contactInfo")
	public String contactInfo(@RequestBody ContactInfo request) {
		if(request == null) {
			return "FAILURE";
		}
		TV5ContactInfo contactInfo = new TV5ContactInfo();
		BeanUtils.copyProperties(request, contactInfo);
		try {
			tv5ContactInfoRepo.save(contactInfo);
		}catch(Exception e) {
			return "FAILURE";
		}
		return "SUCCESS";
	}
}
