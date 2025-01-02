package ma.xproce.examendoae.mappers;

import ma.xproce.examendoae.dao.entities.Organisateur;
import ma.xproce.examendoae.dto.OrganisateurDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class OrganisateurMapper {
    ModelMapper modelMapper = new ModelMapper();
    public OrganisateurDTO organisateurToOrganisateurDTO(Organisateur org) {
        return modelMapper.map(org, OrganisateurDTO.class);
    }

    public Organisateur organisateurDTOToOrganisateur(OrganisateurDTO org) {
        return modelMapper.map(org, Organisateur.class);
    }
}
