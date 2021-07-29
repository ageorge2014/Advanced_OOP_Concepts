import java.util.ArrayList;
import java.util.List;

public class Resume {

    public class Education {
        String school;
        String major;

        public String getSchool() {
            return school;
        }
        public String getMajor() {
            return major;
        }

        public Education(String school, String major) {
            this.school = school;
            this.major = major;
        }



        @Override
        public String toString() {
            return major + "at" + school;
        }
    }

    public static class Experience {
        String title;
        int startYear;
        int endYear;

        public Experience(String title, int startYear, int endYear) {
            this.title = title;
            this.startYear = startYear;
            this.endYear = endYear;
        }

        @Override
        public String toString() {
            return (this.startYear + "-" + this.endYear + ":" + this.title);
        }
    }

    private Person person;
    private List<Education> educationList;
    private List<Experience> experienceList;

    public Resume(Person p) {
        person = p;
        educationList = new ArrayList<>();
        experienceList = new ArrayList<>();
    }
    public void addExperience(Experience experience) {
        experienceList.add(experience);
    }
    public void addEducation(Education education) {
        educationList.add(education);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append(person.toString());
        str.append("Experience");
        experienceList.forEach(item -> str.append(item + "\n"));
        str.append("Education" + "\n");
        educationList.forEach(item -> str.append(item + "\n"));

        return str.toString();
    }

}