Morphia morphia = new Morphia();
morphia.map(Check.class);

/* You can reuse this datastore */
Datastore datastore = morphia.createDatastore(mongoClient, "myDatabase");

/* 
 * Jackson's ObjectMapper, which is reusable, too,
 * does all the magic.
 */
ObjectMapper mapper = new ObjectMapper();