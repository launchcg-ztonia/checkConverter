@JsonRootName(value="check")
@Entity
public class Check {
    @JsonProperty(value="_id")
    @_id
    Integer id;
    
    String name;
    String description;
    String graphiteBaseUrl;
    String target;
    Integer warn;
    Integer error;
    Boolean enabled;
    String state;
    Array<Subscription> subscriptions;
        
     public String getName() {
         return this.name;
     }
    
     public String setName(String name) {
         this.name = name;
     }
    
     public String getDescription() {
         return this.description;
     }
     public String setDescription(String description) {
         this.description = description;
     }
    
     public String getGraphiteBaseUrl() {
         return this.graphiteBaseUrl;
     }
     public String setGraphiteBaseUrl(String graphiteBaseUrl) {
         this.graphiteBaseUrl = graphiteBaseUrl;
     }
    
     public String getTarget() {
         return this.target;
     }
     public String setTarget(String target) {
         this.target = target;
     }
    
     public String getWarn() {
         return this.warn;
     }
     public String setWarn(Integer warn) {
         this.warn = warn;
     }
    
     public String getError() {
         return this.error;
     }
     public String setError(Integer error) {
         this.error = error;
     }
    
     public String getEnabled() {
         return this.enabled;
     }
     public String setEnabled(Boolean enabled) {
         this.enabled = enabled;
     }
    
     public String getState() {
         return this.state;
     }
     public String setState(String state) {
         this.state = state;
     }
    
     public String getSubscriptions() {
         return this.subscriptions;
     }
     public String setSubscriptions(Array<subscription> subscriptions) {
         this.subscriptions = subscriptions;
     }
    
}
