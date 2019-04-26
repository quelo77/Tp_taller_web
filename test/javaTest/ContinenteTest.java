package javaTest;
import java.ar.edu.unlam.Continente;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.hamcrest.Matcher;
import org.hibernate.criterion.*;
import org.hibernate.Session;


public class ContinenteTest extends SpringTest {
	

	@Test
	@Transactional
	@Rollback(true)
	public void testCreoObjetos(){
		Session session;
		Continente c1,c2,c3;
		c1= new Continente();
		c1.setNombre("America");
		c2= new Continente();
		c1.setNombre("Europa");
		c3= new Continente();
		c1.setNombre("Asia");
		session=getSession();
		getSession().save(c1);
		getSession().save(c2);
		getSession().save(c3);
		
	
	}

	
}