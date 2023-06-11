package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie.Task10;

 class Dog extends Animal {
    private String type = "dog";

    public Dog(String name, int noEyes){

        super(name, noEyes);
    }

     @Override
     public String getType() {
         return type;
     }
 }


