package ma.xproce.examendoae.service;

import ma.xproce.examendoae.dao.entities.Don;
import ma.xproce.examendoae.dao.repositories.DonRepository;
import ma.xproce.examendoae.dto.DonDTO;
import ma.xproce.examendoae.mappers.DonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IDonImpl implements IDonService{
    @Autowired
    private final DonRepository donRepository;
    private final DonMapper donMapper;

    public IDonImpl(DonRepository donRepository, DonMapper donMapper) {
        this.donRepository = donRepository;
        this.donMapper = donMapper;
    }

    @Override
    public DonDTO getById(Integer id) {
        Don don=donRepository.findById(id).get();
        return donMapper.donToDonDTO(don);

    }

    @Override
    public List<DonDTO> getAll() {
        List<Don> dons=donRepository.findAll();
        return dons.stream().map(donMapper::donToDonDTO).collect(Collectors.toList());
    }

    @Override
    public List<DonDTO> getAllByIds(List<Integer> ids) {
        List<Don> dons=donRepository.findAllById(ids);
        return dons.stream().map(donMapper::donToDonDTO).collect(Collectors.toList());
    }
}
