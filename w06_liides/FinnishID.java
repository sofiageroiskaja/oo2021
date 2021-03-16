import java.time.Period;
import java.time.LocalDate;

public class FinnishID implements PersonalCodeBehaviour{
    private String code;

    public FinnishID(String code) {
        this.code = code;
    }

    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(7,9));

        if(gender % 2 == 0){
            return "Female";
        } else{
            return "Male";
        }
    }

    @Override
    public String getDOB() {
        String month = Integer.toString(getMonth());
        String dob = getDay() + "." + month + "." + getFullYear();
        return dob;
    }

    @Override
    public String getAge() {
        LocalDate dateofbirth = LocalDate.of(getFullYear(), getMonth(), getDay());
        LocalDate now = LocalDate.now();
        String age = Integer.toString(Period.between(dateofbirth, now).getYears());
        return age;
    }

    @Override
    public int getFullYear() {
        String y = code.substring(4, 6);
        String century = code.substring(6, 7);

        if (century.equals("+")) {
            y = "18" + y;
        } else if (century.equals("-")) {
            y = "19" + y;
        } else if (century.equals("A")) {
            y = "20" + y;
        }

        int fullYear = Integer.parseInt(y);
        return fullYear;
    }

    @Override
    public int getMonth() {
        int month = Integer.parseInt(code.substring(2,4));
        return month;
    }

    @Override
    public int getDay() {
        int day = Integer.parseInt(code.substring(0,2));
        return day;
    }
}
