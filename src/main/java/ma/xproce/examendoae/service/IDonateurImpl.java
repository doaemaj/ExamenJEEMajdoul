package ma.xproce.examendoae.service;

import ma.xproce.examendoae.dao.entities.Donateur;
import ma.xproce.examendoae.dao.repositories.DonateurRepository;
import ma.xproce.examendoae.dto.DonateurDTO;
import ma.xproce.examendoae.mappers.DonateurMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IDonateurImpl implements IDonateurService{
    @Autowired
    private final DonateurRepository donateurRepository;
    private final DonateurMapper donateurMapper;

    public IDonateurImpl(DonateurRepository donateurRepository, DonateurMapper donateurMapper) {
        this.donateurRepository = donateurRepository;
        this.donateurMapper = donateurMapper;
    }


}
