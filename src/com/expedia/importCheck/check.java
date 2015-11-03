@JsonRootName(value="check")
@Entity
public class Check {
    @JsonProperty(value="_id")
    @_id
    Integer id;
    
    String name;
    String description
String graphiteBaseUrl
       String target
        Integer warn
        Integer error
        Boolean enabled
        String state
        Array<Subscription> subscriptions
        
    
}