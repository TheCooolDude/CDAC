class Program{
    public static void main(String[] args) {
        double p=Double.parseDouble(args[0]);
        int u=Integer.parseInt(args[1]);
        System.out.println("Future value "+ Investement.futureValues(p,u,false));
        
        System.out.println("Future value "+ Investement.futureValues(p,u,true));
    }
}