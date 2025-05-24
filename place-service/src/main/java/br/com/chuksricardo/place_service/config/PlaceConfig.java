package br.com.chuksricardo.place_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.chuksricardo.place_service.domain.PlaceRepository;
import br.com.chuksricardo.place_service.domain.PlaceService;

@Configuration
public class PlaceConfig {
  
  @Bean
  PlaceService placeService(PlaceRepository placeRepository){
    return new PlaceService(placeRepository);
  }
}
