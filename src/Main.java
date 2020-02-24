public class Main extends Car  {

         public static void main (String[] args) {
             Car Audi = new Car();
             Car BMW = new Car();
             Car audi = new Car();
        Audi.setCountry("DE");
        BMW.setCountry("DE");
        audi.setCountry("DE");
        Audi.setMaker("audi");
        BMW.setMaker("bmw");
        audi.setMaker("audi");
        Audi.setModel("A8");
        BMW.setModel("335i");
        audi.setModel("Rs7");

        System.out.println(Audi.getCountry()+Audi.getMaker()+ Audi.getModel());
        System.out.println(BMW.getCountry()+ BMW.getMaker()+ BMW.getModel());
        System.out.println(audi.getCountry()+ audi.getMaker()+ audi.getModel());

    }


}
