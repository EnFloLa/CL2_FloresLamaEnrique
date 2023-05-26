package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Personal;
import com.example.demo.repositories.PersonalDao;

@Service
public class PersonalServiceImpl implements PersonalService {

	@Autowired
	private PersonalDao personalRepository;
	
	@Override
	public List<Personal> getAllPersonal() {
		// TODO Auto-generated method stub
		return this.personalRepository.findAll();
	}

}
