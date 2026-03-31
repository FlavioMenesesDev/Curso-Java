package L_Generics.Set.Exercicio01;

import java.time.LocalDateTime;

public class logEntry {
    private String usarname;
    private LocalDateTime moment;

    public logEntry(String usarname, LocalDateTime moment) {
        this.usarname = usarname;
        this.moment = moment;
    }

    public String getUsarname() {
        return usarname;
    }

    public void setUsarname(String usarname) {
        this.usarname = usarname;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        logEntry logEntry = (logEntry) o;
        return usarname.equals(logEntry.usarname);
    }

    @Override
    public int hashCode() {
        return usarname.hashCode();
    }
}
