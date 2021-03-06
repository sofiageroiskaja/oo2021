import java.time.Period;
import java.time.LocalDate;

public class EstonianID implements PersonalCodeBehaviour {
    private String code;
  
    public EstonianID(String code){
        this.code = code;
    }
  
    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(0,1));

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
        int fullYear = Integer.parseInt(code.substring(1,3));

        if(fullYear < 22){
            return fullYear + 2000;
        } else{
            return fullYear + 1900;
        }
    }
  
    @Override
    public int getMonth() {
        int month = Integer.parseInt(code.substring(3, 5));
        return month;
    }

    @Override
    public int getDay() {
        int day = Integer.parseInt(code.substring(5, 7));
        return day;
    }
}