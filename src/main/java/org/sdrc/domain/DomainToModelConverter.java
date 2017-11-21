package org.sdrc.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Component;

@Component
public class DomainToModelConverter {
	
	
	public static List<UserAreaModel> toUserAreaMappingModel(List<UserAreaMapping> userAreaMappings) {
		List<UserAreaModel> userAreaModels = new ArrayList<UserAreaModel>();
		for (UserAreaMapping userAreaMapping : userAreaMappings) {
			UserAreaModel userAreaModel = new UserAreaModel();
			userAreaModel.setAreaModel(new ValueObject(userAreaMapping.getArea().getAreaId(),
					userAreaMapping.getArea().getAreaName(), userAreaMapping.getArea().getLevel()));
			userAreaModel.setUserAreaMappingId(userAreaMapping.getUserAreaMappingId());
			
			userAreaModels.add(userAreaModel);
		}

		return userAreaModels;
	}

	
			
}
