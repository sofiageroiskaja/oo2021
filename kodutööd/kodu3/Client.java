public class Client {

        private String firstname;
        private String lastname;
        private int age;
    
        public Client(String firstname, String lastname, String sex, int age) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
        }
    
        public void setFirstName(String firstname) {
            this.firstname = firstname;
        }
    
        public void setSecondName(String lastname) {
            this.lastname = lastname;
        }

        public String getName() {
            return firstname + ' ' + lastname;
        }
    
        public void setAge(Integer age) {
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }
}