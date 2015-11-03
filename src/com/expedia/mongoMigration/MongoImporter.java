public Boolean importJson(Datastore ds, ObjectMapper mapper, String filename) {

    try {           
        JsonParser parser = new JsonFactory().createParser(new FileReader(filename));
        Iterator<Person> it = mapper.readValues(parser, Person.class);

        while(it.hasNext()) {
            ds.save(it.next());
        }

        return Boolean.TRUE;

    } catch (JsonParseException e) {
        /* Json was invalid, deal with it here */
    } catch (JsonMappingException e) {
        /* Jackson was not able to map
         * the JSON values to the bean properties,
         * possibly because of
         * insufficient mapping information.
         */
    } catch (IOException e) {
        /* Most likely, the file was not readable
         * Should be rather thrown, but was
         * cought for the sake of showing what can happen
         */
    }

    return Boolean.FALSE;
}