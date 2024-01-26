package design_patterns.behavioural.strategy.problem2;


// ▬ [1-3] "Concrete Strategy" ▬
//              → "Implements" the "SocialStrategy"
//              → for "Different Social Media Platforms" ▬
public class Instagram implements SocialStrategy {

    // ▬ The "connectTo()" Override Method ▬
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connected to " + friendName + " using Instagram");
    }
}
