package ma.xproce.examendoae.service;

import ma.xproce.examendoae.dao.entities.Organisateur;
import ma.xproce.examendoae.dao.repositories.OrganisateurRepository;
import ma.xproce.examendoae.dto.OrganisateurDTO;
import ma.xproce.examendoae.mappers.OrganisateurMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IOrganisateurImpl implements IOrganisateurService {

    @Autowired
    private final OrganisateurRepository organisateurRepository;
    private final OrganisateurMapper organisateurMapper;

    public IOrganisateurImpl(OrganisateurRepository organisateurRepository, OrganisateurMapper organisateurMapper) {
        this.organisateurRepository = organisateurRepository;
        this.organisateurMapper = organisateurMapper;
    }

    @Override
    public OrganisateurDTO getById(Integer id) {
        Organisateur organisateur=organisateurRepository.findById(id).get();
        return organisateurMapper.organisateurToOrganisateurDTO(organisateur);
    }

    @Override
    public List<OrganisateurDTO> getAll() {
        List<Organisateur> organisateurs=organisateurRepository.findAll();
        return organisateurs.stream().map(organisateurMapper::organisateurToOrganisateurDTO).collect(Collectors.toList());
    }
}
