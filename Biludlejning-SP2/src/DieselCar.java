public class DieselCar extends AFuelCar{
    boolean particleFilter;

    boolean hasParticleFilter(){
        return particleFilter;
    }

    @Override
    public int getRegistrationFee(){
        int fee = 1520;
        if(!particleFilter){
            fee += 1000;
        }
        return fee;
    }

    @Override
    public String toString(){
        String pf = hasParticleFilter() ? "with" : "without";
        return super.toString() + ", " + pf + " particle filter, registration fee: " + getRegistrationFee() + " kr";
    }

}
