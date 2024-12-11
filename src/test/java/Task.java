

public class Task {
    private int id;
    private String label;
    private String dateRealisation;
    private double pricePerHour;
    private String type;          // Nouveau attribut type
    private String supervisor;    // Nouveau attribut supervisor

    public Task(int id, String label, String dateRealisation, double pricePerHour, String type, String supervisor) {
        this.id = id;
        this.label = label;
        this.dateRealisation = dateRealisation;
        this.pricePerHour = pricePerHour;
        this.type = type;
        this.supervisor = supervisor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDateRealisation() {
        return dateRealisation;
    }

    public void setDateRealisation(String dateRealisation) {
        this.dateRealisation = dateRealisation;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
