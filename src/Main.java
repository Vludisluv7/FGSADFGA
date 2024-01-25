
    public class Main {
        public enum Holiday { NONE, NEW_YEAR, WOMEN_DAY, MEN_DAY }

        public static void main(String[] args) {
            Customer[] customers = {
                    new Customer("John", Customer.Gender.MALE),
                    new Customer("Emma", Customer.Gender.FEMALE),
                    new Customer("Alex", Customer.Gender.MALE),
                    new Customer("Sophia", Customer.Gender.FEMALE),
                    new Customer("Michael", Customer.Gender.MALE)
            };

            greetCustomers(customers, Holiday.NEW_YEAR);
        }

        public static void greetCustomers(Customer[] customers, Holiday holiday) {
            for (Customer customer : customers) {
                switch (holiday) {
                    case NEW_YEAR:
                        System.out.println("Happy New Year, " + customer.getName() + "!");
                        break;
                    case WOMEN_DAY:
                        if (customer.getGender() == Customer.Gender.FEMALE) {
                            System.out.println("Happy International Women's Day, " + customer.getName() + "!");
                        }
                        break;
                    case MEN_DAY:
                        if (customer.getGender() == Customer.Gender.MALE) {
                            System.out.println("Happy Defender of the Fatherland Day, " + customer.getName() + "!");
                        }
                        break;
                    default:
                        System.out.println("No holiday today. Have a nice day, " + customer.getName() + "!");
                        break;
                }
            }
        }
    }


