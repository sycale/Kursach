package joggingApp.jogs.mapper;

import joggingApp.jogs.dto.JogDTO;
import joggingApp.jogs.entity.JogEntity;
import joggingApp.jogs.repository.JogRepository;
import org.springframework.stereotype.Component;

@Component
public class JogMapper {
	public static JogDTO entityToDTO(JogEntity jogEntity) {
		JogDTO jogDTO = new JogDTO();

		jogDTO.setDate(jogEntity.getDate());
		jogDTO.setDistance(jogEntity.getDistance());
		jogDTO.setId(jogEntity.getId());
		jogDTO.setJogger_name(jogEntity.getJogger_name());
		jogDTO.setTime(jogEntity.getTime());

		return jogDTO;
	}

	public static JogEntity dtoToEntity(JogDTO jogDTO) {
		JogEntity jogEntity = new JogEntity();

		jogEntity.setDate(jogDTO.getDate());
		jogEntity.setDistance(jogDTO.getDistance());
		jogEntity.setId(jogDTO.getId());
		jogEntity.setJogger_name(jogDTO.getJogger_name());
		jogEntity.setTime(jogDTO.getTime());

		return jogEntity;
	}

}
