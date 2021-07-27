package mx.com.wiirux.services.impl;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import mx.com.wiirux.services.JokeService;

@Service
public class JokeServiceImpl implements JokeService {
	
	private final ChuckNorrisQuotes cnq;
	
	public JokeServiceImpl() {
		super();
		this.cnq = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return cnq.getRandomQuote();
	}

}
