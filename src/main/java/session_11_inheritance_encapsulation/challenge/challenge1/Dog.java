package session_11_inheritance_encapsulation.challenge.challenge1;

public class Dog extends Animal {
    //Create a Dog class that extends Animal and overrides sound() method; dogs make a particular sound, so we want to print “bark”, in this case

    @Override
    public void sound() {
        System.out.println("bark");
    }
}
