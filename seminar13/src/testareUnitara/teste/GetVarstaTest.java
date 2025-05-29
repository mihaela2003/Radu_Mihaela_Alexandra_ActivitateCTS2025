package testareUnitara.teste;

import org.junit.Test;
import testareUnitara.clase.Persoana;
import testareUnitara.exceptii.ExceptieCNPInexistent;
import testareUnitara.exceptii.ExceptieCNPInvalid;

import static org.junit.Assert.*;

public class GetVarstaTest {
    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @org.junit.Test
    public void getVarstaRight() {
        persoana = new Persoana("gigel", "1921126781234");
        assertEquals(32,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaRight1() {
        persoana = new Persoana("gigel", "6021126781234");
        assertEquals(22,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaBICEPBoundary() {
        persoana = new Persoana("gigel", "1991231781234");
        assertEquals(25,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaBICEPBoundary1() {
        persoana = new Persoana("gigel", "5000101781234");
        assertEquals(25,persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaBICEPErrorConditions() {
        persoana = new Persoana("gigel", "5b00101781234");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaBICEPErrorConditions1() {
        persoana = new Persoana("gigel", "5001401781234");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaBICEPPerformance() {
        persoana = new Persoana("gigel", "5001001781234");
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCORRECTOrder(){
        persoana = new Persoana("gigel", "5001001781234");
        Persoana persoana1 = new Persoana("costel", "1990101781234");
        assertTrue(persoana1.getVarsta() > persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaCORRECTExistence(){
        persoana = new Persoana("gigel", null);
        persoana.getVarsta();
    }

    @Test()
    public void getVarstaCORRECTCardinality(){
        persoana = new Persoana("gigel", "6250129462748");
        assertEquals(0, persoana.getVarsta());
    }

    @Test()
    public void getVarstaCORRECTCardinality1(){
        persoana = new Persoana("gigel", "6240129462748");
        assertEquals(1, persoana.getVarsta());
    }
}