package org.quali.poc.ab;

import java.net.InetAddress;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        InetAddress ip = null;
        String hostname = "";
        String version = "1";
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "IP: " + ip + " | Hostname: " + hostname + " | Version: " + version; 
    }
}