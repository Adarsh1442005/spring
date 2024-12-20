package com.example.Car;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.servlet.*;
import org.hibernate.*;

//@Controller
//public class control{
//	@RequestMapping("")
//	public String crud() {
//		return "crud.jsp";
//	}
//	@RequestMapping("/submit")
//	public ModelAndView result(@RequestParam("carname")String name,@RequestParam("model")String model,@RequestParam("price")int price,@RequestParam("color")String color,@RequestParam("price")String fueltype,ModelAndView mv) {
//		mv.setViewName("content.jsp");
//		mv.addObject("car",name);
//		return mv;
//	}
//}



@RestController
public class control {
	
@PostMapping("/submit")
public String view(@RequestBody Car a) {
	Configuration con=new Configuration().configure().addAnnotatedClass(Car.class);
	SessionFactory sf= con.buildSessionFactory();
	Session session= sf.openSession();
	Transaction tx=session.beginTransaction();
	session.save(a);
	tx.commit();
	return a.getcarname();
	

		
	
	}
@GetMapping("")
public String crud() {
	return "crud.jsp";
}

	
	

}
