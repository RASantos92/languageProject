package com.languages.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.languages.models.LanguageClass;

@Repository
public interface LanguageRepository extends CrudRepository<LanguageClass, Long> {

}
