package com.letunnel.services.springdatajpa;

import com.letunnel.model.CommonProcedures;
import com.letunnel.repositories.CommonProceduresRepository;
import com.letunnel.services.CommonProceduresService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CommonProceduresSDJpaService implements CommonProceduresService {

    private final CommonProceduresRepository commonProceduresRepository;

    public CommonProceduresSDJpaService(CommonProceduresRepository commonProceduresRepository) {
        this.commonProceduresRepository = commonProceduresRepository;
    }

    @Override
    public Set<CommonProcedures> findAll() {
        Set<CommonProcedures> commonProcedures = new HashSet<>();
        commonProceduresRepository.findAll().forEach(commonProcedures::add);
        return commonProcedures;
    }

    @Override
    public CommonProcedures findById(Long id) {
        return commonProceduresRepository.findById(id).orElse(null);
    }

    @Override
    public CommonProcedures save(CommonProcedures commonProcedure) {
        return commonProceduresRepository.save(commonProcedure);
    }

    @Override
    public void delete(CommonProcedures commonProcedure) {
        commonProceduresRepository.delete(commonProcedure);
    }

    @Override
    public void deleteById(Long id) {
        commonProceduresRepository.deleteById(id);
    }

}
