package com.kyho.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	// Automatic Dependency Injection @Autowired
	@Autowired
	@Qualifier("mediaTek")
	MobileProcessor ap;
	
	public MobileProcessor getAp() {
		return ap;
	}

	public void setAp(MobileProcessor ap) {
		this.ap = ap;
	}

	public void config() {
		System.out.println("Octa Core,4 gb Ram, 12MP camera");
		ap.process();
	}

}
