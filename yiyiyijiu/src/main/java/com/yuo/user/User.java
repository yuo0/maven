package com.yuo.user;

import com.yuo.lis.Lis;
import com.yuo.yan.A;
import com.yuo.yan.B;
import com.yuo.yan.C;

public class User
{

	private Lis l;
	
	public String ding(String m)
	{
		if (m.equals("��"))
		{
			l=new A();
		}
		
		if (m.equals("��"))
		{
			l=new B();
		}
		
		if (m.equals("��"))
		{
			l=new C();
		}
		
		return l.code();
		
	}
}
