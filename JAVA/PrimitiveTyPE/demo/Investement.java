class Investement{
    public static double futureValues(double p,int duration ,boolean risk){
        double i= risk?0.08: 0.06;
        return(p/i)*(Math.pow(1+i,duration)-1);
    }

    }
