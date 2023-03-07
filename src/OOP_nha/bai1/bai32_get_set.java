package OOP_nha.bai1;

import java.util.Objects;

public class bai32_get_set {
    private int day;
    private int month;
    private int year;

    public bai32_get_set() {
    }

    public bai32_get_set(int day, int month, int year) {
        if(day>=1&&day<=31)
            this.day=day;
        else
            this.day=1;

        if(month >=1 && month<=12)
            this.month=month;
        else
            this.month=1;

        if(year >=0 )
            this.year=year;
        else
            this.year=1;

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day>=1 && day <=31)
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "bai32_get_set{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bai32_get_set that = (bai32_get_set) o;
        return day == that.day && month == that.month && year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
