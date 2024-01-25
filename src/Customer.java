public class Customer {
        public enum Gender { MALE, FEMALE, OTHER }

        private String name;
        private Gender gender;

        public Customer(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }
    }
