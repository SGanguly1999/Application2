package com.example.demo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {
	
	@GetMapping("")
	public String get() {
		return "Hi";
	}

	@PostMapping("add")
	public String web(HttpServletRequest req,HttpServletResponse response) throws IOException, ServletException
	{  
		try {
		// Musician Details
		System.out.println("Hey hi everyone");
		String SSN=req.getParameter("SSN");
		String musicianName= req.getParameter("musicianName");
		
		//Song details
		String songId=req.getParameter("songid");
		String author=req.getParameter("author");
		String songTitle=req.getParameter("songTitle");
		
		//Album Details
		String albumTitle=req.getParameter("albumTitle");
		String identifier=req.getParameter("identifier");
		int copyrightdate= Integer.parseInt(req.getParameter("copyrightdate"));
		String format=req.getParameter("format");
		
		//Instrument details
		String instrumentName=req.getParameter("instrumentName");
		String key= req.getParameter("key");
		String instrumentId=req.getParameter("instrumentId");
		
		//Address details
		String address=req.getParameter("address");
		long phone= Long.parseLong(req.getParameter("phone").trim());
		
		Musician musician1 =  new Musician(SSN,musicianName);
		Album album1=new Album(identifier,albumTitle,copyrightdate,format);
		Song song1 = new Song(songId,author,songTitle);
		Instruments instrument1 = new Instruments(instrumentId,key,instrumentName);
		Address address1=new Address(phone,address);
		System.out.println(musician1+" "+album1+" "+song1+" "+instrument1+" "+address1);
		Database.entry(musician1,album1,song1,instrument1,address1);
	    return "<h1>Added to database successfully</h1>";	
		}
		catch(Exception e) {
			e.printStackTrace();
			return "<h1>The data could'nt be entered due to some error";
		}

}
}
