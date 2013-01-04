/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_2025 extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_2025Record> {

	private static final long serialVersionUID = -364869693;

	/**
	 * The singleton instance of <code>x_test_case_2025</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.XTestCase_2025 X_TEST_CASE_2025 = new org.jooq.test.cubrid.generatedclasses.tables.XTestCase_2025();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_2025Record> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_2025Record.class;
	}

	/**
	 * The column <code>x_test_case_2025.ref_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_2025Record, java.lang.Integer> REF_ID = createField("ref_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_2025);

	/**
	 * The column <code>x_test_case_2025.ref_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_2025Record, java.lang.String> REF_NAME = createField("ref_name", org.jooq.impl.SQLDataType.VARCHAR, X_TEST_CASE_2025);

	/**
	 * No further instances allowed
	 */
	private XTestCase_2025() {
		super("x_test_case_2025", org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_2025Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.XTestCase_2025Record, ?>>asList(org.jooq.test.cubrid.generatedclasses.Keys.X_TEST_CASE_2025__FK_X_TEST_CASE_2025_3, org.jooq.test.cubrid.generatedclasses.Keys.X_TEST_CASE_2025__FK_X_TEST_CASE_2025_2, org.jooq.test.cubrid.generatedclasses.Keys.X_TEST_CASE_2025__FK_X_TEST_CASE_2025_1);
	}
}
