package bank.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="vehicleloan")
public class VehicleLoan {
    @Id
    // @GenericGenerator(name="vhc_generator",strategy="bank.example.demo.functionalities.VehicleLoanIdGenerator")
    // @GeneratedValue(generator = "vhc_generator")
    private int vehicleLoanId;

    private String vehicleType;
    @Column(unique = true)
    private String vehicleNumber;
    private Long vehicleLoanAmount;
    private int vehicleLoanPeriod;
    private int vehicleLoanEMIPaid;

    // @OneToOne(mappedBy = "vehicleLoan")
    // private User user;

    public VehicleLoan() {
    }

    public VehicleLoan(int vehicleLoanId, String vehicleType, String vehicleNumber, Long vehicleLoanAmount,
            int vehicleLoanPeriod, int vehicleLoanEMIPaid, User user) {
        this.vehicleLoanId = vehicleLoanId;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.vehicleLoanAmount = vehicleLoanAmount;
        this.vehicleLoanPeriod = vehicleLoanPeriod;
        this.vehicleLoanEMIPaid = vehicleLoanEMIPaid;
        // this.user = user;
    }

    public int getVehicleLoanId() {
        return vehicleLoanId;
    }

    public void setVehicleLoanId(int vehicleLoanId) {
        this.vehicleLoanId = vehicleLoanId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Long getVehicleLoanAmount() {
        return vehicleLoanAmount;
    }

    public void setVehicleLoanAmount(Long vehicleLoanAmount) {
        this.vehicleLoanAmount = vehicleLoanAmount;
    }

    public int getVehicleLoanPeriod() {
        return vehicleLoanPeriod;
    }

    public void setVehicleLoanPeriod(int vehicleLoanPeriod) {
        this.vehicleLoanPeriod = vehicleLoanPeriod;
    }

    public int getVehicleLoanEMIPaid() {
        return vehicleLoanEMIPaid;
    }

    public void setVehicleLoanEMIPaid(int vehicleLoanEMIPaid) {
        this.vehicleLoanEMIPaid = vehicleLoanEMIPaid;
    }

    // public User getUser() {
    //     return user;
    // }

    // public void setUser(User user) {
    //     this.user = user;
    // }

    // @Override
    // public String toString() {
    //     return "VehicleLoan [user=" + user + ", vehicleLoanAmount=" + vehicleLoanAmount + ", vehicleLoanEMIPaid="
    //             + vehicleLoanEMIPaid + ", vehicleLoanId=" + vehicleLoanId + ", vehicleLoanPeriod=" + vehicleLoanPeriod
    //             + ", vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + "]";
    // }

    
}
