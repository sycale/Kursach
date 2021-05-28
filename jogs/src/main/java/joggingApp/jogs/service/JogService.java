package joggingApp.jogs.service;

import joggingApp.jogs.dto.JogDTO;
import joggingApp.jogs.entity.JogEntity;
import joggingApp.jogs.mapper.JogMapper;
import joggingApp.jogs.repository.JogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogService {
	private final JogRepository jogRepository;

	@Autowired
	public JogService(JogRepository jogRepository) {
		this.jogRepository = jogRepository;
	}

	@Transactional
	public List<JogDTO> getAllJogs() {
		return jogRepository.findAll().stream().map(JogMapper::entityToDTO).collect(Collectors.toUnmodifiableList());
	}

	@Transactional
	public JogDTO addJog(JogDTO jogDTO) {
		return JogMapper.entityToDTO(jogRepository.save(JogMapper.dtoToEntity(jogDTO)));
	}

	@Transactional
	public void removeJog(Long jogId) throws Exception {
		JogEntity jogEntity = jogRepository.findById(jogId).orElseThrow(() -> new Exception("No jog with such id"));
		jogRepository.delete(jogEntity);
	}
}
