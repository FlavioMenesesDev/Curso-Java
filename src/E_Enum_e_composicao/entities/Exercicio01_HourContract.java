package E_Enum_e_composicao.entities;

import java.time.LocalDate;

public class Exercicio01_HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hour;

    public Exercicio01_HourContract (){}

    public Exercicio01_HourContract(LocalDate date, Double valuePerHour, Integer hour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public double totalValue(){
        return valuePerHour * hour;
    }
}
