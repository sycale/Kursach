package joggingApp.jogs.controllers;

import joggingApp.jogs.dto.JogDTO;
import joggingApp.jogs.service.JogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogs")
public class JogControllers {
	private final JogService jogService;

	public JogControllers(JogService jogService) {
		this.jogService = jogService;
	}

	@GetMapping
	public List<JogDTO> getAllJogs() {
		return jogService.getAllJogs();
	}

	@PostMapping
	public JogDTO addJog(@RequestBody JogDTO jogDTO) {
		return jogService.addJog(jogDTO);
	}

	@DeleteMapping("/{jogId}")
	public void deleteJog(@PathVariable Long jogId) throws Exception {
		jogService.removeJog(jogId);
	}

}
