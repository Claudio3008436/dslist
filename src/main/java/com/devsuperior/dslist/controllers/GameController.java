package com.devsuperior.dslist.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.service.GameService;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	@Transactional
	public List<GameDTO> listarFilmes() {
		return gameService.listar();
	}

}
