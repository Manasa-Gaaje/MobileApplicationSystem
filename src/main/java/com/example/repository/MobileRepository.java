package com.example.repository;

import java.util.ArrayList;
import com.example.model.Mobile;

public interface MobileRepository 
{
	ArrayList<Mobile> getMobiles();
	Mobile getMobileById(int mobileId);
	Mobile addMobile(Mobile mobile);
	Mobile updateMobile(int mobileId, Mobile mobile);
	void deleteMobile(int mobileId);

}
