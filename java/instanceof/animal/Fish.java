package animal;

public class Fish extends Animal {
    public Boolean saltwater_;

    public Fish(Boolean saltwater) {
        saltwater_ = saltwater;
    }

    public String ride() {
        if (saltwater_) {
            return "You can't ride a sea fish.";
        } else {
            return "You can't ride a freshwater fish.";
        }
    }
}
