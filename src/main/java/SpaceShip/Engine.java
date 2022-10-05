package SpaceShip;

class Engine{
    private int power;

    public void setPower(int power){
        this.power = power;
    }

    public int getPower(){
        return power;
    }
    public String getFuelType(){
        return "A500";
    }
}

class XFuelEngine extends Engine {

    protected String serialNumber;

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getFuelType() {
        return "XFuel";
    }


}

class AdvancedXFuelEngine extends XFuelEngine{
    public void printInfo(){
        System.out.println("Serial number is " +  getSerialNumber() + ", power is " + getPower());
    }

    private String getSerialNumber() {
        return super.serialNumber;
    }
}

