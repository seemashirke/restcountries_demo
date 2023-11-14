package com.countryservice.demo;

import java.util.Comparator;

import com.pojo.BaseCountry;

public class BorderComparator implements Comparator<BaseCountry> {

	@Override
	public int compare(BaseCountry o1, BaseCountry o2) {
		// TODO Auto-generated method stub
		if ((o1.getBorders()!=null &&o2.getBorders()!=null)&&
				(o1.getBorders().size() == o2.getBorders().size())) 
            return 0; 
        else if ((o1.getBorders()!=null &&o2.getBorders()!=null)&&
        		o1.getBorders().size() > o2.getBorders().size()) 
            return 1; 
        else
            return -1; 
	}

}
