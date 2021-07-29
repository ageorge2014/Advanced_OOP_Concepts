import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {

    class Education {
        String school;
        String major;

        public Education(String school, String major) {
            this.school = school;
            this.major = major;
        }

        public String getSchool() {
            return school;
        }

        public String getMajor() {
            return major;
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
            return startYear + "-" + endYear + ":" + title;
        }
    }


    private Person person;

    private List<Education> educationList;
    private PriorityQueue<Experience> experienceList;

    public PriorityQueue<Experience> getExperience() {
        return experienceList;
    }

    public void addEducation(Education education) {
        educationList.add(education);
    }

    public void addExperience(Experience experience) {
        experienceList.add(experience);
    }

    public Resume(Person p) {
        person = p;
        educationList = new ArrayList<>();
        experienceList = new PriorityQueue<>(new Comparator<Experience>() {
            @Override
            public int compare(Experience experience, Experience t1) {
                return t1.startYear - experience.endYear;
            }
        });

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append(person.toString());
        str.append("Education" + "\n");
        educationList.forEach(item -> str.append(item + "\n"));
        str.append("Experience" + "\n");
        experienceList.forEach(item -> str.append(item + "\n"));

        return str.toString();
    }

}