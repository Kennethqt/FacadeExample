public class FuelInjector {
    protected Object fuelpump;

    public boolean on(){
        return true;

    }
    public void inject(){
        System.out.println("Injectado correctamente");
    }

    public boolean off(){
        return false;
    }

}
