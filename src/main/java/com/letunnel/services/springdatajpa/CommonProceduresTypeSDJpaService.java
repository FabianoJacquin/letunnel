package com.letunnel.services.springdatajpa;

import com.letunnel.model.CommonProceduresType;
import com.letunnel.repositories.CommonProceduresTypeRepository;
import com.letunnel.services.CommonProceduresTypeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CommonProceduresTypeSDJpaService implements CommonProceduresTypeService {

    private final CommonProceduresTypeRepository commonProceduresTypeRepository;

    public CommonProceduresTypeSDJpaService(CommonProceduresTypeRepository commonProceduresTypeRepository) {
        this.commonProceduresTypeRepository = commonProceduresTypeRepository;
    }

    @Override
    public Set<CommonProceduresType> findAll() {
        Set<CommonProceduresType> commonProceduresTypes = new HashSet<>();
        commonProceduresTypeRepository.findAll().forEach(commonProceduresTypes::add);
        return commonProceduresTypes;
    }

    @Override
    public CommonProceduresType findById(Long id) {
        return commonProceduresTypeRepository.findById(id).orElse(null);
    }

    @Override
    public CommonProceduresType save(CommonProceduresType commonProcedureType) {
        return commonProceduresTypeRepository.save(commonProcedureType);
    }

    @Override
    public void delete(CommonProceduresType commonProcedureType) {
        commonProceduresTypeRepository.delete(commonProcedureType);
    }

    @Override
    public void deleteById(Long id) {
        commonProceduresTypeRepository.deleteById(id);
    }

}
