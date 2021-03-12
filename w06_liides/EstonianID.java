public class EstonianID implements PersonalCodeBehaviour {
    private String code;
  
    public EstonianID(String code){
      this.code = code;
    }
  
    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(0,1));

        if(gender % 2 == 0){
            return "Sugu: Naine";
        } else{
            return "Sugu: Mees";
        }
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
    public String getDOB() {
      // TODO Auto-generated method stub
      return null;
    }
    
}