//package app.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//
//@Entity
//@Table(name = "Driver")
//public class Driver {
//
//    @Id
//    @Column(name = "driver_id")
//    private String driverID;
//    @Column(name = "driver_name")
//    private String driverName;
//
//    public static Builder newBuilder() {
//        return new Driver().new Builder();
//    }
//
//    public String getDriverID() {
//        return driverID;
//    }
//
//    public String getDriverName() {
//        return driverName;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Driver driver = (Driver) o;
//        return driverID == driver.driverID &&
//                Objects.equals(driverName, driver.driverName);
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((driverID == null) ? 0 : driverID.hashCode());
//        result = prime * result + ((driverName == null) ? 0 :  driverName.hashCode());
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "Driver (" +
//                "driverID = " + driverID +
//                ", driverName = '" + driverName + '\'' +
//                '}';
//    }
//
//    public class Builder {
//
//        private Builder() {}
//
//        public Builder setDriverID(String aDriverID) {
//            driverID = aDriverID;
//            return this;
//        }
//
//        public Builder setDriverName(String aDriverName) {
//            driverName = aDriverName;
//            return this;
//        }
//
//
//        public Driver build() {
//            return Driver.this;
//        }
//    }
//}
