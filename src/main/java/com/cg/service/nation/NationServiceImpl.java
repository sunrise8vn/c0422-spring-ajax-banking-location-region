package com.cg.service.nation;


import com.cg.model.Nation;
import com.cg.repository.NationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class NationServiceImpl implements INationService {

    @Autowired
    private NationRepository nationRepository;

    @Override
    public List<Nation> findAll() {
        return null;
    }

    @Override
    public Nation getById(Long id) {
        return null;
    }

    @Override
    public Optional<Nation> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Nation save(Nation nation) {
        return nationRepository.save(nation);
    }

    @Override
    public void remove(Long id) {

    }
}
