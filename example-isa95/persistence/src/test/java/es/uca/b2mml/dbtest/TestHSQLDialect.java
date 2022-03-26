package es.uca.b2mml.dbtest;

import org.hibernate.dialect.HSQLDialect;

/**
 * HyperSQL dialect that drops tables using the 'cascade' option in order to
 * remove their constraints as well (if they exist), instead of trying to remove
 * them and failing when they do not exist. Useful for avoiding unwanted error messages.
 */
public class TestHSQLDialect extends HSQLDialect {

	@Override
	public String getDropTableString(String tableName) {
		return new StringBuilder("drop table ")
			.append(tableName)
			.append(" if exists ")
			.append(getCascadeConstraintsString()).toString();
	}

	@Override
	public boolean dropConstraints() {
		return false;
	}

	@Override
	public String getCascadeConstraintsString() {
		return " cascade ";
	}
	
}
