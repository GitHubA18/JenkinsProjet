/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Control.Calcul;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usager
 */
public class testAdd {
    
    public testAdd() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testaddPositifPositif(){
    //Calcul calc=new Calcul();
    
    int a, b, resultatAttendu;
    //Cas de test a et b positif
    a=5;
    b=5;
    resultatAttendu= a+b;
    if(Calcul.Addition(a, b)!=resultatAttendu){
    fail("a et b positifs");
    }
    
    }
      @Test
    public void testaddPositifNegatif(){
    //Calcul calc=new Calcul();
    
    int a, b, resultatAttendu;
    //Cas de test a et b positif
    a=5;
    b=-3;
    resultatAttendu= a+b;
    if(Calcul.Addition(a, b)!=resultatAttendu){
    fail("a positif et b negatif");
    }  
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

}