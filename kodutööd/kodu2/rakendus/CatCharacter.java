package rakendus;

public class CatCharacter {
  
    public String name;
    private String info = "I ruin everything";
    private Integer work = 1;
  
    public CatCharacter(String name){
      this.name = name;
    }
  
    public String getInfo(){
      return info;
    }
  
    public void setInfo(String info){
      this.info = info;
    }

    public Integer getWork(){
        return work;
    }
    
    public void setWork(Integer work){
        this.work = work;
    }

}
