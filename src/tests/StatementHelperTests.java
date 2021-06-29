package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helpers.StatementHelper;

public class StatementHelperTests {
	@Test
	public void test() {
		String testStmt = "\"select id, cd_comp, valeur\" + //"
				+ "\" from compoweb_prop\" + //"
				+ "\" where cd_comp in (\" + //"
				+ "\" select c.cd_comp\" + //"
				+ " from composantweb c, lcomposantweb l\""
				+ "\" where c.cd_comp = l.cd_comp and l.cdp_comp = 'test')\"";
		String parsedStmt = StatementHelper.parseStatement(testStmt);
		String finalStmt = "select id, cd_comp, valeur from compoweb_prop where cd_comp in (select c.cd_comp from composantweb c, lcomposantweb l where c.cd_comp = l.cd_comp and l.cdp_comp = 'test')";
		assertEquals(parsedStmt, finalStmt);
	}

}
