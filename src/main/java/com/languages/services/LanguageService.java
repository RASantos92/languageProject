package com.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.languages.models.LanguageClass;
import com.languages.repositorys.LanguageRepository;

@Service
public class LanguageService {
	private static LanguageRepository langRepo;

	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}

	public LanguageClass create(LanguageClass newLang) {
		return langRepo.save(newLang);
	}

	public List<LanguageClass> getAll() {
		return (List<LanguageClass>) langRepo.findAll();
	}

	public LanguageClass getOne(Long id) {
		Optional<LanguageClass> lang = langRepo.findById(id);
		return lang.isPresent() ? lang.get() : null;
	}

	public LanguageClass update(LanguageClass toUpdate, Long id) {
		return langRepo.save(toUpdate);
	}

	public void destroy(LanguageClass toDelete, Long id) {
		langRepo.delete(toDelete);
	}
}
