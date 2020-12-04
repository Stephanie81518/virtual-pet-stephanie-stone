public class VirtualPet {

    private String name;
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;
    private int tickTimer;

    public VirtualPet(String name, int hunger, int thirst, int waste, int boredom, int sickness) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
        this.boredom = boredom;
        this.sickness = sickness;
        this.name = name;
        this.tickTimer = 0;
    }

    public boolean tick() {
        tickTimer++;
        hunger--;
        thirst--;
        waste++;
        boredom--;
        sickness--;

        if (tickTimer > 7) {
            System.out.println(this.name + " has gone to pet heaven after a long life. You have treated your pet well. GAME OVER.");
            return false;
        }
        if (hunger <= 0) {
            System.out.println(this.name + " has died of hunger.");
            return false;
        }
        if (thirst <= 0) {
            System.out.println(this.name + " has died of thirst.");
            return false;
        }
        if (waste >= 20) {
            System.out.println(this.name + " has died of constipation.");
            return false;
        }
        if (boredom <= 0) {
            System.out.println(this.name + " has died of boredom.");
            return false;
        }
        if (sickness <= 0) {
            System.out.println(this.name + " has died from sickness.");
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getWaste() {
        return waste;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getSickness() {
        return sickness;
    }

    public int getTickTimer() {
        return tickTimer;
    }

    public void feed() {
        hunger += 3;
        thirst -= 3;
        waste += 5;
        System.out.println("You have fed " + name + "!");
    }

    public void water() {
        thirst += 5;
        waste += 5;
        System.out.println("You gave water to " + name + "!");
    }

    public void bathroom() {
        waste -= 5;
        boredom -= 5;
        System.out.println(name + " has gone to the bathroom!");
    }

    public void play() {
        boredom += 5;
        hunger -= 3;
        thirst -= 5;
        sickness -= 5;
        System.out.println(name + " loves to play!");
    }

    public void illness() {
        sickness += 5;
        thirst -= 3;
        boredom -= 3;
        System.out.println("You have cured " + name + "!");
    }
}
