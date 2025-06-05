package testareUnitara.teste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testareUnitara.categorii.CategorieBoundary;
import testareUnitara.categorii.CategorieRight;

@Suite.SuiteClasses({AplicaDiscountTest.class, GetVarstaTest.class})
@RunWith(Categories.class)
@Categories.IncludeCategory(CategorieRight.class)
@Categories.ExcludeCategory(CategorieBoundary.class)
public class SuitaPersonalizata {
}
