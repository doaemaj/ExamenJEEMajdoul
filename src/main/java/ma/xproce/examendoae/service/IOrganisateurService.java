package ma.xproce.examendoae.service;

import ma.xproce.examendoae.dto.OrganisateurDTO;

import java.util.List;

public interface IOrganisateurService {
    OrganisateurDTO getById(Integer id);
    List<OrganisateurDTO> getAll();


}
