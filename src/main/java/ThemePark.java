import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark implements IReviewed {
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public int getRating() {
//        ArrayList<Attraction> ratings = new ArrayList<>();
//        for(Attraction attraction : attractions) {
//            return this.attraction.getRating();
//        }
    }

}
