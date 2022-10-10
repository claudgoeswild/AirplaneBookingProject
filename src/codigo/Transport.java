
package codigo;

public class Transport {
    private int seatTotal = 12;
    private int seatNormal = 6;
    private int seatPrio = 6;

    public Transport(int seatTotal, int seatNormal, int seatPrio) {
        this.seatTotal = seatTotal;
        this.seatNormal = this.seatNormal;
        this.seatPrio = seatPrio;
    }
    
    public Transport() {
    }
    public int getSeatTotal() {
        return seatTotal;
    }

    public void setSeatTotal(int seatTotal) {
        this.seatTotal = seatTotal;
    }

    public int getSeatNormal() {
        return seatNormal;
    }

    public void setSeatNormal(int seatNormal) {
        this.seatNormal = seatNormal;
    }

    public int getSeatPrio() {
        return seatPrio;
    }

    public void setSeatPrio(int seatPrio) {
        this.seatPrio = seatPrio;
    }    
}
