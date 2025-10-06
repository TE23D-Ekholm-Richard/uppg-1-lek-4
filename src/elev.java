public class Elev {
    private String name;
    private String email;
    private String klass;
    private String gymnasielinje;
    private String personnummer;

    public Elev(String name,String email, String klass, String gymnasielinje,String personnummer){
        this.name = name;
        this.email=email;
        this.klass=klass;
        this.gymnasielinje=gymnasielinje;
        this.personnummer=personnummer;
    }

    public void skrivUt(){
        System.out.println("Elev namn: "+ name);
        System.out.println("email "+ email );
        System.out.println("klass:" + klass);
        System.out.println("gymnasielinje: "+ gymnasielinje);
        System.out.println("personnummer: "+ personnummer);

    }

}
