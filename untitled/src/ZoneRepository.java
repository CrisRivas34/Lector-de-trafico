import java.util.ArrayList;

public class ZoneRepository {
    ArrayList<String> list;
    ArrayList<Zone> listZone;
    public void generateZone(){
        Zone a = new Zone("Zona Norte");
        a.addAvenue(new PrincipalAvenue("Libertadores", 300, 600, -90));
        a.addAvenue(new PrincipalAvenue("Libertadores2", 300, 600, -200));

        Zone b = new Zone("Zona Central");
        b.addAvenue(new PrincipalAvenue("Busch", 400, 600, -80));
        b.addAvenue(new PrincipalAvenue("Max Paredes", 600, 800, -90));

        Zone c = new Zone("Zona Sur");
        c.addAvenue(new PrincipalAvenue("Hernando Siles", 300, 400, -70));
        c.addAvenue(new PrincipalAvenue("Av. Maestro", 200, 300, -90));

        list = new ArrayList<String>();
        list.add(a.name);
        list.add(b.name);
        list.add(c.name);

        listZone = new ArrayList<Zone>();
        listZone.add(a);
        listZone.add(b);
        listZone.add(c);

    }
}
