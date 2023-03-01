public class Wilder {

        private String firstname;
        private Boolean aware;

        // constructor
        public Wilder(String firstname, Boolean aware) { 
            this.firstname = firstname;
            this.aware = aware;
        }

        //gettes 
        public String getFirstname() {
            return this.firstname;
        }

        public Boolean getAware() {
            return this.aware;
        }

        //setter 
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void setAware(Boolean aware) {
            this.aware = aware;
        }

        // method
        public String whoAmI() {
            if (this.aware) {
                return "I am " + this.getFirstname() + " and i'm aware";
            } else {
                return "I am " + this.getFirstname() + " and i'm not aware";
            }
        }
}