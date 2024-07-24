package session_11_inheritance_encapsulation.challenge.challenge2.single_inheritance;

public class MountainBike extends Bicycle {

    private String tireType;
    private boolean suspensionActive;

    public void adjustSuspension(boolean activate) {
        this.suspensionActive = activate;
        System.out.println("Suspension " );
        if (activate) {
            System.out.println("activated");
        } else {
            System.out.println("deactivated");
        }


    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public boolean isSuspensionActive() {
        return suspensionActive;
    }

    public void setSuspensionActive(boolean suspensionActive) {
        this.suspensionActive = suspensionActive;
    }

    @Override
    public void setGear(int gear) {
        super.setGear(gear);
    }

    @Override
    public int getGear() {
        return super.getGear();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}