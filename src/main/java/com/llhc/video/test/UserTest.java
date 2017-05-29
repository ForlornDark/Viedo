package com.llhc.video.test;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;




public class UserTest {

	
	@Test
	public void getUsers() {
		String res;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
        Date date = new Date();
        res = simpleDateFormat.format(date);
        System.out.println(res);
	}

}
