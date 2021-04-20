import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Optional;

public class StreamHW {

   public static void main(String args[]) {
       class Student{
        String name;
        int age;
        String gender;
        String sport;
        int ranking;
        int uni_start;
         
        public Student(String name, int age, String gender, String sport, int uni_start, int ranking){
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.sport = sport;
            this.uni_start = uni_start;
            this.ranking = ranking;
        }
         
        public String getName() {
            return name;
        }
         
        public int getAge() {
            return age;
        }
         
        public String getGender() {
            return gender;
        }
         
        public String getSport() {
            return sport;
        }
         
        public int getUniYear() {
            return uni_start;
        }
         
        public int getRanking() {
            return ranking;
        }
    }

    List<Student> StudentList = new ArrayList<Student>();      
    StudentList.add(new Student("John Johnson", 20, "Male", "Swimming", 2020, 34));
    StudentList.add(new Student("Peter Lee", 22, "Male", "Table tennis", 2018, 23));
    StudentList.add(new Student("Mark Kon", 25, "Male", "Swimming", 2016, 13));
    StudentList.add(new Student("Mari Mura", 25, "Female", "Table tennis", 2017, 8));
    StudentList.add(new Student("Lama Mama", 23, "Female", "Table tennis", 2018, 3));
    StudentList.add(new Student("Opal Lopa", 22, "Male", "Swimming", 2019, 4));
    StudentList.add(new Student("Gali Rek", 18, "Male", "Swimming", 2020, 78));
    StudentList.add(new Student("Vel Nelson", 24, "Male", "Swimming", 2016, 32));
    StudentList.add(new Student("Liza Park", 23, "Female", "Table tennis", 2019, 25));
    StudentList.add(new Student("Pul Palson", 23, "Male", "Swimming", 2018, 10));
    StudentList.add(new Student("Sorry Notsorry", 19, "Female", "Swimming", 2020, 2));
    StudentList.add(new Student("Malia Umalia", 22, "Female", "Table tennis", 2019, 24));
    StudentList.add(new Student("Veronika Toli", 25, "Female", "Swimming", 2017, 23));
    StudentList.add(new Student("Nico Gora", 22, "Male", "Swimming", 2018, 12));
    StudentList.add(new Student("Hora Mora", 21, "Female", "Table tennis", 2019, 1));

    System.out.println("Sports that our students do:");
    StudentList.stream()
    .map(Student::getSport)
    .distinct()
    .forEach(System.out::println);
    System.out.println("\n");

    Map<String, Long> genderNumber = StudentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
    System.out.println("Number of students that do swimming or play table tennis:\n" + genderNumber);
    System.out.println("\n");

    Map<String, List<Student>> studentsBySport = StudentList.stream().collect(Collectors.groupingBy(Student::getSport));     
    Set<Entry<String, List<Student>>> entrySet = studentsBySport.entrySet();
         
    for(Entry<String, List<Student>> entry : entrySet){
    System.out.println("Students In " + entry.getKey() + ":");
    List<Student> list = entry.getValue();
             
    for(Student e : list){
        System.out.println(e.getName());
    }
}
    System.out.println("\n");

    System.out.println("Average age of students");
    Map<String, Double> avgAge = StudentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
    System.out.println(avgAge);
    System.out.println("\n");

    System.out.println("Oldest athlete in our university: ");  
    Optional<Student> oldest = StudentList.stream().max(Comparator.comparingInt(Student::getAge));
    Student oldestStudent = oldest.get();
    System.out.println("Name: " + oldestStudent.getName());
    System.out.println("Age: " + oldestStudent.getAge());
    System.out.println("Sport: " + oldestStudent.getSport());
    System.out.println("\n");

    System.out.println("Youngest table tennis player in our university: ");  
    Optional<Student> youngestInTT= StudentList.stream()
            .filter(e -> e.getSport()=="Table tennis")
            .min(Comparator.comparingInt(Student::getAge));
                     
    Student youngestTTPlayer = youngestInTT.get();
    System.out.println("Name: " + youngestTTPlayer.getName());
    System.out.println("Age: " + youngestTTPlayer.getAge());
    System.out.println("Ranking: " + youngestTTPlayer.getRanking());
    System.out.println("\n");

    System.out.println("Youngest swimmer in our university: ");  
    Optional<Student> youngestInSwimming= StudentList.stream()
            .filter(e -> e.getSport()=="Swimming")
            .min(Comparator.comparingInt(Student::getAge));
                     
    Student youngestSwimmer = youngestInSwimming.get();
    System.out.println("Name: " + youngestSwimmer.getName());
    System.out.println("Age: " + youngestSwimmer.getAge());
    System.out.println("Ranking: " + youngestSwimmer.getRanking());
    System.out.println("\n");

    System.out.println("Average ranking of our athletes: ");  
    Map<String, Double> avgRanking = StudentList.stream().collect(Collectors.groupingBy(Student::getSport, Collectors.averagingDouble(Student::getRanking)));
    System.out.println(avgRanking);
    System.out.println("\n");

    System.out.println("Highest ranked student: ");
    Optional<Student> highestRanked = StudentList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Student::getRanking)));        
    Student highestRankedStudent = highestRanked.get();
    System.out.println("Name: " + highestRankedStudent.getName());
    System.out.println("Age: " + highestRankedStudent.getAge());
    System.out.println("Gender: " + highestRankedStudent.getGender());
    System.out.println("Sport: " + highestRankedStudent.getSport());
    System.out.println("Ranking: " + highestRankedStudent.getRanking());
    System.out.println("\n");

    System.out.println("Athletes that joined our University this year: ");  
    StudentList.stream()
        .filter(e -> e.getUniYear() >= 2020)
        .map(Student::getName)
        .forEach(System.out::println);
    System.out.println("\n");
    }
}