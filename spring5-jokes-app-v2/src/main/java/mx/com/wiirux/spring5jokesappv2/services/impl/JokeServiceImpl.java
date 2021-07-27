package mx.com.wiirux.spring5jokesappv2.services.impl;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import mx.com.wiirux.spring5jokesappv2.services.JokeService;

@Service
public class JokeServiceImpl implements JokeService {
	
	private final ChuckNorrisQuotes cnq;
	
	public JokeServiceImpl() {
		this.cnq = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return cnq.getRandomQuote();
	}

}