import java.util.ArrayList;


public class Zone {
    String name;
    String condition = "none";
    ArrayList<PrincipalAvenue> list;

    public Zone(String name){
        this.name = name;
        list = new ArrayList<PrincipalAvenue>();
    }

    public String promTraffic(int inf,int sup){
        boolean valid = true;
        String res = "";
        if(list.size()== 0){
            System.out.println("Do not have any PrincipalAvenue asigned");
            valid = false;
        } else{
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).calcTrafic(inf, sup) == 0){
                    System.out.println("Please choose a valid number");
                    System.out.println("invalid function in: " +  list.get(i).name);
                    valid = false;
                }
            }
            if(valid == true){
                calcProm(inf,sup);
            }
        }

        return res;
    }

    public int calcProm(int inf, int sup){
        int cont = 0;
        for(int i = 0; i < list.size(); i++){
            cont = cont + list.get(i).calcTrafic(inf, sup);
            list.get(i).setConditionAvenue();
        }
        cont = cont/list.size();
        if(cont < 0 ){
            System.out.println("Please Choose a valid number");
            cont = 0;
        }else{
            System.out.println("The average number of cars passing through the zone" + name + " is: " + cont);
            setZoneCondition(cont);
        }
        return cont;
    }

    public void addAvenue(PrincipalAvenue a){
        list.add(a);
    }

    public void setZoneCondition(int value){
        if(value > 3000){
            condition = "high Traffic";
        }else{
            if(2000 < value && value < 3000){
                condition = "medium Traffic";
            }else{
                if(value < 2000){
                    condition = "low Traffic";
                }
            }
        }
        System.out.println(condition);
    }
}