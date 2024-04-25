public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public void setName(String aName) {
              name = aName;
        }
        public String getName() {
                return name;
        }
        public void setStudentId(int aId) {
                studentId = aId;
        }
        public int getStudentId() {
                return studentId;
        }
        private void setNumberOfCredits(int creditNumber) {
                numberOfCredits = creditNumber;
        }
        private int getNumberOfCredits() {
                return numberOfCredits;
        }
        public void setGpa(double newGpa) {
                gpa = newGpa;
        }
        public double getGpa(){
                return gpa;
        }
}
