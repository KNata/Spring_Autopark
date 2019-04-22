//package entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "Visitor")
//public class Visitor {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "visitor_id", nullable = false)
//    private Integer visitorID;
//    @Column(name = "visitor_name", nullable = false)
//    private String visitorName;
//    @Column(name = "visitor_login", nullable = false)
//    private String visitorLogin;
//    @Column(name = "visitor_password", nullable = false)
//    private String visitorPassword;
//    @Column(name = "visitor_role", nullable = false)
//    private String visitorRole;
//    @Column(name = "is_admin", nullable = false)
//    private boolean isAdmin;
//    @Column(name = "driver_id", nullable = false)
//    private String  driverId;
//
//    public static Builder newBuilder() {
//        return new Visitor().new Builder();
//    }
//
//    public int getVisitorID() {
//        return visitorID;
//    }
//
//    public String getVisitorName() {
//        return visitorName;
//    }
//
//    public String getVisitorLogin() {
//        return visitorLogin;
//    }
//
//    public String getVisitorPassword() {
//        return visitorPassword;
//    }
//
//    public String getVisitorRole() {
//        return visitorRole;
//    }
//
//    public boolean isAdmin() {
//        return isAdmin;
//    }
//
//    public String getTheDriver() {
//        return driverId;
//    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Visitor visitor = (Visitor) o;
//        return visitorID == visitor.visitorID &&
//                isAdmin == visitor.isAdmin &&
//                driverId.equals(visitor.driverId) &&
//                Objects.equals(visitorName, visitor.visitorName) &&
//                Objects.equals(visitorLogin, visitor.visitorLogin) &&
//                Objects.equals(visitorPassword, visitor.visitorPassword) &&
//                Objects.equals(visitorRole, visitor.visitorRole);
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((visitorName == null) ? 0 : visitorName.hashCode());
//        result = prime * result + ((visitorLogin == null) ? 0 :  visitorLogin.hashCode());
//        result = prime * result + ((visitorPassword == null) ? 0 : visitorPassword.hashCode());
//        result = prime * result + visitorID;
//        result = prime * result + ((visitorRole == null) ? 0 : visitorRole.hashCode());
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "Visitor (" +
//                "visitorID = " + visitorID +
//                ", visitorName = '" + visitorName + '\'' +
//                ", visitorLogin = '" + visitorLogin + '\'' +
//                ", visitorPassword = '" + visitorPassword + '\'' +
//                ", visitorRole = '" + visitorRole + '\'' +
//                ", isAdmin = " + isAdmin +
//                ", routeList = " + driverId +
//                ')';
//    }
//
//    public class Builder {
//
//        private Builder() {
//        }
//
//        public Builder setVisitorID(int aVisitorID) {
//            visitorID = aVisitorID;
//            return this;
//        }
//
//        public Builder setVisitorName(String aVisitorName) {
//            visitorName = aVisitorName;
//            return this;
//        }
//
//        public Builder setVisitorLogin(String aVisitorLogin) {
//            visitorLogin = aVisitorLogin;
//            return this;
//        }
//
//        public Builder setVisitorPassword(String aVisitorPassword) {
//            visitorPassword = aVisitorPassword;
//            return this;
//        }
//
//        public Builder setVisitorRole(String aVisitorRole) {
//            visitorRole = aVisitorRole;
//            return this;
//        }
//
//        public Builder setAdminStatus(boolean anAdminStatus) {
//            isAdmin = anAdminStatus;
//            return this;
//        }
//
//        public Builder setDriver(String aDriverId) {
//            driverId = aDriverId;
//            return this;
//        }
//
//        public Visitor build() {
//            return Visitor.this;
//        }
//    }
//}
