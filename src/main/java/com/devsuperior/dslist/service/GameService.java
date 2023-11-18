package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameDTO> listar(){
		List<Game> result = gameRepository.findAll();
		List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).toList();
		return dto;
		
	}
	
}
