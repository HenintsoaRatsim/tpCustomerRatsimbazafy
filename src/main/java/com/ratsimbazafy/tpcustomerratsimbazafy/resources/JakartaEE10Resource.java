package com.ratsimbazafy.tpcustomerratsimbazafy.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 * Cette classe représente une ressource Jakarta EE 10.
 * Elle fournit des méthodes pour interagir avec cette ressource.
 * La ressource est accessible via le chemin "/jakartaee10".
 * @author 
 */
@Path("jakartaee10")
public class JakartaEE10Resource {
    
    @GET
    public Response ping(){
        return Response
                .ok("ping Jakarta EE aa")
                .build();
    }
}
