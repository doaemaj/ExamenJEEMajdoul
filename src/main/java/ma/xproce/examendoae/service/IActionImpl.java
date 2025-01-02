package ma.xproce.examendoae.service;

import ma.xproce.examendoae.dao.entities.Action;
import ma.xproce.examendoae.dao.entities.Don;
import ma.xproce.examendoae.dao.repositories.ActionRepository;
import ma.xproce.examendoae.dto.ActionDTO;
import ma.xproce.examendoae.dto.DonDTO;
import ma.xproce.examendoae.mappers.ActionMapper;
import ma.xproce.examendoae.mappers.DonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class IActionImpl implements IActionService{
    @Autowired
    private final ActionRepository actionRepository;
    private final ActionMapper actionMapper;
    private final DonMapper donMapper;

    public IActionImpl(ActionRepository actionRepository, ActionMapper actionMapper, DonMapper donMapper) {
        this.actionRepository = actionRepository;
        this.actionMapper = actionMapper;
        this.donMapper = donMapper;
    }

    @Override
    public List<DonDTO> getActionDons(Integer id) {
        Action action=actionRepository.findById(id).orElseThrow(() -> new RuntimeException("Action not found"));
        List<Don> dons =action.getDons();
        return dons.stream().map(donMapper::donToDonDTO).collect(Collectors.toList());
    }

    @Override
    public ActionDTO createAction(ActionDTO actionDTO) {
        Action action=actionMapper.actionDTOToAction(actionDTO);
        action = actionRepository.save(action);
        return actionMapper.actionToActionDTO(action);
    }

    @Override
    public List<ActionDTO> getAll() {
        List<Action> actions=actionRepository.findAll();
        return actions.stream().map(actionMapper::actionToActionDTO).collect(Collectors.toList());
    }
}
