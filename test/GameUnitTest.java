/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controller.GameController;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class GameUnitTest {
     GameController GC = new GameController();
    public GameUnitTest() {
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
    @FileParameters("src\\Utils\\file.csv")
    public void gameTestWithFile(String prato){
        GC.iniciaArvore();
          if (GC.getNo().getPrato().equals(prato)) {
            Assert.assertEquals(GC.getNo().getPrato(), prato);
        } else if (GC.getNo().getEsq().getPrato().equals(prato)) {
            Assert.assertEquals(GC.getNo().getEsq().getPrato(), prato);
        } else {
            Assert.assertEquals(GC.getNo().getDir().getPrato(), prato);
        }
    }
    @Test
    public void gameTest(){
        GC.iniciaArvore();
          Assert.assertEquals(GC.getNo().getPrato(),"Massa");
        Assert.assertEquals(GC.getNo().getEsq().getPrato(),"Lasanha");
        Assert.assertEquals(GC.getNo().getDir().getPrato(),"Bolo de Chocolate");
    }
}
