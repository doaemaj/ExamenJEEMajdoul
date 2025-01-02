package ma.xproce.examendoae;

import ma.xproce.examendoae.dao.entities.Action;
import ma.xproce.examendoae.dao.entities.Don;
import ma.xproce.examendoae.dao.entities.Organisateur;
import ma.xproce.examendoae.dao.entities.Donateur;

import ma.xproce.examendoae.dao.repositories.ActionRepository;
import ma.xproce.examendoae.dao.repositories.DonRepository;
import ma.xproce.examendoae.dao.repositories.DonateurRepository;
import ma.xproce.examendoae.dao.repositories.OrganisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ExamenDoaeApplication implements CommandLineRunner {

    private final OrganisateurRepository organisateurRepository;
    private final DonRepository donRepository;
    private final ActionRepository actionRepository;
    private final DonateurRepository donateurRepository;

    @Autowired
    public ExamenDoaeApplication(DonateurRepository donateurRepository,OrganisateurRepository organisateurRepository, DonRepository donRepository, ActionRepository actionRepository) {
        this.organisateurRepository = organisateurRepository;
        this.donRepository = donRepository;
        this.actionRepository = actionRepository;
        this.donateurRepository=donateurRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExamenDoaeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // **Création des organisateurs**
//        Organisateur org1 = new Organisateur(null, "Organisateur A", "orgA@example.com", "passwordA", null);
//        Organisateur org2 = new Organisateur(null, "Organisateur B", "orgB@example.com", "passwordB", null);
//        organisateurRepository.save(org1);
//        organisateurRepository.save(org2);
//
//        // **Création des donateurs**
//        Donateur donateur1 = new Donateur(null, "Donateur 1", "Prenom 1", "donateur1@example.com", "123456789", "password1", Donateur.DonateurEval.DEBUTANT, null);
//        Donateur donateur2 = new Donateur(null, "Donateur 2", "Prenom 2", "donateur2@example.com", "987654321", "password2", Donateur.DonateurEval.DONATEUR_ACTIF, null);
//        donateurRepository.save(donateur1);
//        donateurRepository.save(donateur2);
//
//        // **Création des actions**
//        Action action1 = new Action(null, "Action Humanitaire", "Description de l'action humanitaire", LocalDate.now(), 1000.0, Action.ActionEtat.OUVERTE, org1, null);
//        Action action2 = new Action(null, "Aide aux Étudiants", "Description de l'aide aux étudiants", LocalDate.now().minusDays(10), 500.0, Action.ActionEtat.PREPARATION, org2, null);
//        actionRepository.save(action1);
//        actionRepository.save(action2);
//
//        // **Création des dons**
//        Don don1 = new Don(null, "Don Argent", 200.0, Don.DonType.ARGENT, action1, donateur1);
//        Don don2 = new Don(null, "Don Bien", 50.0, Don.DonType.BIEN, action1, donateur2);
//        Don don3 = new Don(null, "Don de Soutien", 300.0, Don.DonType.ARGENT, action2, donateur1);
//        donRepository.save(don1);
//        donRepository.save(don2);
//        donRepository.save(don3);
//
//        // Mettre à jour les listes pour les relations bidirectionnelles
//        action1.setDons(List.of(don1, don2));
//        action2.setDons(List.of(don3));
//        actionRepository.save(action1);
//        actionRepository.save(action2);
//
//        org1.setActions(List.of(action1));
//        org2.setActions(List.of(action2));
//        organisateurRepository.save(org1);
//        organisateurRepository.save(org2);
//
//        donateur1.setDons(List.of(don1, don3));
//        donateur2.setDons(List.of(don2));
//        donateurRepository.save(donateur1);
//        donateurRepository.save(donateur2);
    }

}
