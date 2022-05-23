
    public class Customer {
        private String name;
        private int age;
        private String dayofbirth;

        public Customer() {
        }

        public Customer(String name, int age, String dayofbirth) {
            this.name = name;
            this.age = age;
            this.dayofbirth = dayofbirth;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDayofbirth() {
            return dayofbirth;
        }

        public void setDayofbirth(String dayofbirth) {
            this.dayofbirth = dayofbirth;
        }


    }
