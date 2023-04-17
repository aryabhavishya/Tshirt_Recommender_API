package com.assignment.tshirtdetails.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.tshirtdetails.dao.TshirtDao;
import com.assignment.tshirtdetails.entities.TshirtData;

@Service
public class TshirtService {

	@Autowired
	private TshirtDao tdao;
	public List<TshirtData> getAll() {

		return tdao.findAll();
	}

	public void addTshirt(TshirtData tdata1) {
		tdao.save(tdata1);
	}

	public List<TshirtData> getSome(String colour,String size ,String gender,String outputpref) 
		{
			List<TshirtData> tshirt=tdao.findAll();
			List<TshirtData> tshirt1=new ArrayList<>();
			for(TshirtData ts:tshirt)
			{
				if(ts.getColour().equals(colour)&&ts.getGender().equals(gender)&&ts.getSize().equals(size)) {
					tshirt1.add(ts);
				}
			}
			if(outputpref.equals("PRICE")) {
				Collections.sort(tshirt1, Comparator.comparing(TshirtData::getPrice));
			}
			else if(outputpref.equals("RATING")) {
				Collections.sort(tshirt1, Comparator.comparing(TshirtData::getRating,(s1, s2) -> {
					return s2.compareTo(s1);
				}));
			}
			return tshirt1;
		}
	}	
