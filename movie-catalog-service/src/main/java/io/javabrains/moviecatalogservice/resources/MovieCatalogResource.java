package io.javabrains.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.*;
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		
		List<Rating> ratings = Arrays.asList(
				new Rating("1234",4),
				new Rating("5678",3)
				);
		//create a dummy list and return it
		return Collections.singletonList(
				new CatalogItem("Black Hawk Down", "War movie", 9));
		
	}
}
