package com.labo.budgets.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labo.budgets.models.AppRole;
import com.labo.budgets.models.Laboratoire;
import com.labo.budgets.models.Utilisateur;
import com.labo.budgets.repositories.LaboratoireRepo;
import com.labo.budgets.repositories.UtilisateurRepo;

@Service
public class LaboService {
	
	private LaboratoireRepo laboratoireRepo;
	private UtilisateurRepo utilisateurRepo;
	
	@Autowired
	public LaboService(LaboratoireRepo laboratoireRepo, UtilisateurRepo utilisateurRepo) {
		this.laboratoireRepo = laboratoireRepo;
		this.utilisateurRepo = utilisateurRepo;
	}
	
	public List<Laboratoire> getAllLabos(){
		return this.laboratoireRepo.findAll();
	}
	
	public Laboratoire getLaboById(long id) {
		return this.laboratoireRepo.findById(id).get();
	}
	
	public Laboratoire saveLabo(Laboratoire labo) {
		return this.laboratoireRepo.save(labo);
	}
	

}