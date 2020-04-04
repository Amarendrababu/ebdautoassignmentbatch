package com.maxis.ebdautoassignmentbatch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.maxis.ebdautoassignmentbatch.entity.EbdUserEntity;
import com.maxis.ebdautoassignmentbatch.repository.EbdUserRepository;
import com.maxis.ebdautoassignmentbatch.request.UserDetails;

@Service
public class UserService {
	
	
	@Autowired
	public EbdUserRepository ebdUserRepository;
	
	
	
	public void getEbdUserDetails(String userId,Model model){
		System.out.println("User Id ===================>"+userId);
		EbdUserEntity ebdUserEntity=ebdUserRepository.findByUserId(userId);
		UserDetails userDetails=new UserDetails();
		System.out.println("EBD User Entity:: ====>"+ebdUserEntity);
		if(ebdUserEntity !=null) {
			userDetails.setUserId(ebdUserEntity.getUserId());
			userDetails.setCompanyname(ebdUserEntity.getCompanyName());
			userDetails.setDealercode(ebdUserEntity.getDealerCode());
			userDetails.setEmail(ebdUserEntity.getEmail());
			userDetails.setMobileno(ebdUserEntity.getMobileNo());
			
		}
		
		System.out.println("EBD User Details:: ====>"+userDetails);
		
		model.addAttribute("userDetails", userDetails);
		
		
	}



	public void updateUserDetails(UserDetails userDetails, Model model) {
		EbdUserEntity ebdUserEntity=ebdUserRepository.findByUserId(userDetails.getUserId());
		System.out.println("updateUserDetails EBD User Details:: ====>"+userDetails);
		System.out.println("ebdUserEntity EBD User Entity:: ====>"+ebdUserEntity);
		if(ebdUserEntity !=null) {
			ebdUserEntity.setCompanyName(userDetails.getCompanyname());
			ebdUserEntity.setDealerCode(userDetails.getDealercode());
			ebdUserEntity.setEmail(userDetails.getEmail());
			ebdUserEntity.setMobileNo(userDetails.getMobileno());
			
			ebdUserRepository.save(ebdUserEntity);
			
			
		}
		
		model.addAttribute("userDetails", new UserDetails());
		
	}
	
	

}
