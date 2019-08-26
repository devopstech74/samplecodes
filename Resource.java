package springproject.springbackend.resource;

public class Resource {

private final String DRIVERNAME;
   private final String  DEVELOPERNAME;
   private final String  RESOURCELOCATION;
     private Resource()
     {
    	 DRIVERNAME = "org.h2.driver";
    	 DEVELOPERNAME="Sailesh";
    	 RESOURCELOCATION="e:\\projectfolder";
     }
     public static final Resource resource=new Resource();
     public static final Resource getInstance()
     {
    	 return resource;
     }
     public void getDetails()
     {
    	 System.out.println(DRIVERNAME);
    	 System.out.println(DEVELOPERNAME);
    	 System.out.println(RESOURCELOCATION);
     }
}
