package ma.xproce.examendoae.web;

import ma.xproce.examendoae.dao.entities.Action;
import ma.xproce.examendoae.dto.ActionDTO;
import ma.xproce.examendoae.dto.DonDTO;
import ma.xproce.examendoae.mappers.ActionMapper;
import ma.xproce.examendoae.service.IActionService;
import ma.xproce.examendoae.service.IDonService;
import ma.xproce.examendoae.service.IDonateurService;
import ma.xproce.examendoae.service.IOrganisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ActionController {
    private final IActionService actionService;
    private final IOrganisateurService organisateurService;
    private final IDonService donService;
    private final IDonateurService donateurService;
    private final ActionMapper actionMapper;

    @Autowired
    public ActionController(IActionService actionService, IOrganisateurService organisateurService, IDonService donService, IDonateurService donateurService, ActionMapper actionMapper) {
        this.actionService = actionService;
        this.organisateurService = organisateurService;
        this.donService = donService;
        this.donateurService = donateurService;
        this.actionMapper = actionMapper;
    }
    @GetMapping("/actions")
    public String actions(Model model){
        List<ActionDTO> actions=actionService.getAll();
        model.addAttribute("actions",actions);
        return "actions";

    }

    @GetMapping("donAction/{id}")
    public String donAction(Model model, @PathVariable Integer id ){
        List<DonDTO> dons=actionService.getActionDons(id);
        model.addAttribute("dons",dons);
        return "donAction";
    }

    @GetMapping("newActionForm")
    public String newActionForm(Model model){
        model.addAttribute("action",new ActionDTO());
        model.addAttribute("organisateurs",organisateurService.getAll());
        model.addAttribute("dons",donService.getAll());
        return "newActionForm";
    }

    @PostMapping("createAction")
    public String createAction(Model model, ActionDTO actionDTO,
                               @RequestParam(name = "organisateur-Id") Integer orgId,
                               @RequestParam(name = "dons-Ids") List<Integer> donIds, RedirectAttributes redirectAttributes){
        Action action=actionMapper.actionDTOToAction(actionDTO);
        actionDTO.setOrganisateur(organisateurService.getById(orgId));
        actionDTO.setDons(donService.getAllByIds(donIds));
        actionService.createAction(actionDTO);
        return "redirect:/actions";

    }
}
