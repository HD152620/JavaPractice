/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *    |_ IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author      :  chja2
 * @version      : 1.0
 */
public interface IDBManager {
	public final static String ORACLE_DATABASE = "ORACLE";
	public final static String SYBASE_DATABASE = "SYBASE";
	
	abstract void insert();
	abstract void search();
	abstract void update();
	abstract void delete();
	
	public static IDBManager getDBObject(String database){
		IDBManager manager = null;
		if(database.equals(ORACLE_DATABASE)){
			manager = new OracleDB();
		}else if(database.equals(SYBASE_DATABASE)){
			manager = new SybaseDB();
		}
		return manager;	
	}
}
