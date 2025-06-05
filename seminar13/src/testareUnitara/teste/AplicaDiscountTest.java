package testareUnitara.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import testareUnitara.categorii.CategorieBoundary;
import testareUnitara.categorii.CategorieRight;
import testareUnitara.clase.IPersoana;
import testareUnitara.clase.PachetTuristic;
import testareUnitara.dubluri.PersoanaFake;
import testareUnitara.dubluri.PersoanaStub;

import static org.junit.Assert.assertEquals;

public class AplicaDiscountTest {

    @Test
    @Category(CategorieBoundary.class)
    public void aplicaDiscountVarstniciBoundaryTest() {
        IPersoana persoana = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(425, pachetTuristic.getPret(), 0.001);
    }

    @Test
    @Category(CategorieRight.class)
    public void aplicaDiscountVarstniciRightOverTest(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(66);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bali", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(425, pachetTuristic.getPret(), 0.001);
    }

    @Test
    @Category(CategorieRight.class)
    public void aplicaDiscountVarstniciRightUnderTest(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(22);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bali", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(15);
        assertEquals(500, pachetTuristic.getPret(), 0.001);
    }
}