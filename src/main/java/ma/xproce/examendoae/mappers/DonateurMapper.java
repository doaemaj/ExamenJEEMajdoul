package ma.xproce.examendoae.mappers;

import ma.xproce.examendoae.dao.entities.Donateur;
import ma.xproce.examendoae.dto.DonateurDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DonateurMapper {
    ModelMapper modelMapper = new ModelMapper();
    public DonateurDTO donateurToDTO(Donateur donateur) {
        return modelMapper.map(donateur, DonateurDTO.class);
    }

    public Donateur donateurDTOTodonateur(DonateurDTO donateurDTO) {
        return modelMapper.map(donateurDTO, Donateur.class);
    }

}
