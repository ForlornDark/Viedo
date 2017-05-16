package com.llhc.video.aop;

import java.util.Date;

public class LogAOPXML {
	
	public void logBefore() {
		System.out.println("===基于XML配置的AOP===" + new Date());
	}
}
