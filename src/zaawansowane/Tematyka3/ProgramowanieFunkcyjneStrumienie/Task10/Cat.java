package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie.Task10;

 class Cat extends Animal{
    private String type = "cat";

    public Cat(String name, int noEyes){
        super(name, noEyes);
    }

    @Override
    public String getType() {
        return type;
    }
}
