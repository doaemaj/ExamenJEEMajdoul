package ma.xproce.examendoae.service;

import ma.xproce.examendoae.dto.DonDTO;

import java.util.List;

public interface IDonService {

    DonDTO getById(Integer id);

    List<DonDTO> getAll();
    List<DonDTO> getAllByIds(List<Integer> ids);
}
