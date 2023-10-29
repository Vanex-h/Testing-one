package rw.ac.rca.gradesclassb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
@Entity
public class MathLib {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer number1;

    private Integer number2;
    @Transient
    private Integer sum;

    @Transient
    private Integer product;

    public MathLib(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public MathLib() {
    }
    public MathLib(int id, Integer number1, Integer number2) {
        this.id = id;
        this.number1 = number1;
        this.number2 = number2;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getNumber1() {
        return number1;
    }
    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }
    public Integer getNumber2() {
        return number2;
    }
    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }
    public Integer getSum() {
        return sum;
    }
    public void setSum(Integer sum) {
        this.sum = sum;
    }
    public Integer getProduct() {
        return product;
    }
    public void setProduct(Integer product) {
        this.product = product;
    }

}