package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "bus")
public class Bus {

    @Id
    @Column(name = "bus_id", nullable = false)
    private String busID;
    @Column(name = "bus_model", nullable = false)
    private String busModel;
    @Column(name = "max_count_of_passengers", nullable = false)
    private int maxCountOfPassagers;
    @Column(name = "miles", nullable = false)
    private int miles;
    @Column(name = "passed_service", nullable = false)
    private boolean passedService;

    public static Bus.Builder newBuilder() {
        return new Bus().new Builder();
    }

    public String getBusID() {
        return busID;
    }

    public String getBusModel() {
        return busModel;
    }

    public int getMaxCountOfPassagers() {
        return maxCountOfPassagers;
    }

    public int getMiles() {
        return miles;
    }

    public boolean isPassedService() {
        return passedService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return maxCountOfPassagers == bus.maxCountOfPassagers &&
                miles == bus.miles &&
                passedService == bus.passedService &&
                Objects.equals(busID, bus.busID) &&
                Objects.equals(busModel, bus.busModel);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((busID == null) ? 0 : busID.hashCode());
        result = prime * result + ((busModel == null) ? 0 :  busModel.hashCode());
        result = prime * result + maxCountOfPassagers;
        result = prime * result + miles;
        return result;
    }

    @Override
    public String toString() {
        return "Bus (" +
                "busID = '" + busID + '\'' +
                ", busModel = '" + busModel + '\'' +
                ", maxCountOfPassagers = " + maxCountOfPassagers +
                ", miles = " + miles +
                ", passedService = " + passedService +
                ')';
    }

    public class Builder {

        private Builder() {
        }

        public Builder setBusID(String aBusID) {
            busID = aBusID;
            return this;
        }

        public Builder setBusModel(String aBusModel) {
            busModel = aBusModel;
            return this;
        }

        public Builder setmaxCountOfPassagers(int aMaxCountOfPassagers) {
            maxCountOfPassagers = aMaxCountOfPassagers;
            return this;
        }

        public Builder setMiles(int aMiles) {
            miles = aMiles;
            return this;
        }

        public Builder setPassedService(boolean aService) {
            passedService = aService;
            return this;
        }

        public Bus build() {
            return Bus.this;
        }
    }

}
