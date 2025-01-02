package ma.xproce.examendoae.service;

import ma.xproce.examendoae.dto.ActionDTO;
import ma.xproce.examendoae.dto.DonDTO;

import java.util.List;

public interface IActionService {
    List<DonDTO> getActionDons(Integer id);
    ActionDTO createAction(ActionDTO actionDTO);
    List<ActionDTO> getAll();
}
