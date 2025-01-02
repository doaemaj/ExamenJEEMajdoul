package ma.xproce.examendoae.mappers;

import ma.xproce.examendoae.dao.entities.Don;
import ma.xproce.examendoae.dto.DonDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DonMapper {
    ModelMapper modelMapper = new ModelMapper();

    public DonDTO donToDonDTO(Don don){
        return modelMapper.map(don, DonDTO.class);
    }
    public Don donDTOToDon(DonDTO donDTO){
        return modelMapper.map(donDTO, Don.class);
    }
}
