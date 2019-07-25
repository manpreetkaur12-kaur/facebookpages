package com.MavenFbOrOrangeAdminPack;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenFacebook {
int a=100, b=29;

@Test
public void add()
	{
	System.out.println("Add");
	
	AssertJUnit.assertEquals(129, a+b);
	}
	@Test
	public void Sub()
		{
		System.out.println("Subtract");
		AssertJUnit.assertEquals(71, a-b);
	}
}

