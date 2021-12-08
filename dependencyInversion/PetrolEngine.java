package dependencyInversion.goodExample;

 class PetrolEngine  implements EngineInterface{

    
    public void start() {
        System.out.println("Petrol Engine Started");
    }
    
}
