public class PrincipalAvenue {
    String name;
    String condition = "none";
    private DefiniteIntegral i;
    int ind;
    int simt;
    int cuadt;
    int traffic;

    public PrincipalAvenue(String name, int ind,int simt,int cuadt){
        this.name = name;
        this.ind = ind;
        this.simt = simt;
        this.cuadt = cuadt;
        i = new DefiniteIntegral(ind, simt ,cuadt);
    }

    public boolean validValues(){
        boolean valid = false;
        boolean vind = false;
        boolean vsimt = false;
        boolean vcuadt = false;

        if(ind > 0){
            vind = true;
        }
        if(simt > 0){
            vsimt = true;
        }
        if(cuadt < 0){
            vcuadt = true;
        }
        if(vind == true && vsimt == true && vcuadt == true){
            valid = true;
        }
        return valid;
    }

    public int calcTrafic(int inf,int sup){
        traffic = 0;
        if(validValues() == true){
            traffic = i.integrarCuadr(inf, sup);
        }
        return traffic;
    }

    public void setConditionAvenue(){
        if(traffic > 3000){
            condition = "high Traffic";
        }else{
            if(traffic > 2000 && traffic < 3000){
                condition = "medium Traffic";
            }else{
                if(traffic < 2000){
                    condition = "low Traffic";
                }
            }

        }
        System.out.println("traffic in " + name + " is: " + condition + "\n" + "number of cars: " + traffic);
    }

    public String getAvenueCondition(){
        return condition;
    }

}
