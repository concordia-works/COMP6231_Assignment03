package Servers;

import Utils.Config;

import javax.xml.ws.Endpoint;

/**
 * Created by quocminhvu on 2017-05-26.
 */

public class ServersPublisher {
    public static void main(String args[]) {
        try {
            CenterServer serverMtl = new CenterServer(Config.Server_ID.MTL);
            Endpoint endpointMtl = Endpoint.publish("http://localhost:8888/mtl", serverMtl);
            System.out.println("MTL Server published : " + endpointMtl.isPublished());

            CenterServer serverLvl = new CenterServer(Config.Server_ID.LVL);
            Endpoint endpointLvl = Endpoint.publish("http://localhost:8888/lvl", serverLvl);
            System.out.println("LVL Server published : " + endpointLvl.isPublished());

            CenterServer serverDdo = new CenterServer(Config.Server_ID.DDO);
            Endpoint endpointDdo = Endpoint.publish("http://localhost:8888/ddo", serverDdo);
            System.out.println("DDO Server published : " + endpointDdo.isPublished());
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
    }
}
