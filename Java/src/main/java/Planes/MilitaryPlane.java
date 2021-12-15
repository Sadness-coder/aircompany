package Planes;
import models.MilitaryType;
import java.util.Objects;

public class MilitaryPlane extends Plane {
    private MilitaryType militaryType;

    public MilitaryPlane(String planeModel,
                         int maxSpeed,
                         int maxFlightDistance,
                         int maxLoadCapacity,
                         MilitaryType militaryType) {
        super(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", type=" + militaryType + '}');
    }

    @Override
    public boolean equals(Object obj){
    MilitaryPlane militaryPlane = (MilitaryPlane) obj;
    return this == obj && obj instanceof  MilitaryPlane && super.equals(obj) && militaryType == militaryPlane.militaryType ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}
