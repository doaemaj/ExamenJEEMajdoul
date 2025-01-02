package ma.xproce.examendoae.mappers;

import ma.xproce.examendoae.dao.entities.Action;
import ma.xproce.examendoae.dto.ActionDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ActionMapper {
    ModelMapper modelMapper = new ModelMapper();

    public ActionDTO actionToActionDTO(Action action) {
        return modelMapper.map(action, ActionDTO.class);
    }

    public Action actionDTOToAction(ActionDTO actionDTO) {
        return modelMapper.map(actionDTO, Action.class);
    }
}
