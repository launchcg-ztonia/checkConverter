package com.expedia.mongoMigration;

import com.mongodb.DBObject;

public class ConversionRunner {

	public static void main(String[] args) {
		MongoConnection source = null;
		MongoConnection destination = null;
		/*
		String databaseHost = args[0];
		String databaseName = args[1];
		if (args.length > 2){
			String userName = args[2];
			String password = args[3];
			worker = new MongoConnection(databaseHost, databaseName, userName, password);
		}
		else {
			worker = new MongoConnection(databaseHost, databaseName, null, null);
		}
		*/

        String importFileName = args[0]
		String sourceHostname = args[1];
		String destinationHostname = args[2];

		source = new MongoConnection(sourceHostname, 'seyren', null, null);
		destination = new MongoConnection(destinationHostname, 'seyren', null, null);

		boolean dropCurrentChecksSuccess = destination.dropCurrentChecks();
		DBObject[] sourceChecks = worker.getChecks();
		for (DBObject check : sourceChecks){
			boolean disableSuccess = worker.disableCheck(check);
			boolean convertSuccess = worker.convertCheckSubscriptions(check);
			boolean saveSuccess = worker.saveCheck(check);
		}
	}

}
