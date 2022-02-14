
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Geometric_Object {
    public String color= "white";
    public boolean filled = false;
    public Date dateCreated;

    public Geometric_Object(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Geometric_Object() {
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract String toString();
}
