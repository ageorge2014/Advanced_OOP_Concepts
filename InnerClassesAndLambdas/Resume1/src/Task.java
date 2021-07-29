public class Task {
    public static void main(String[] args){
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);

        Resume.Education edu = r.new Education("NEIU", "Computer Science");
            r.addEducation(edu);
        Resume.Experience experience = new Resume.Experience("Analyst", 2012, 2020);
            r.addExperience(experience);
            r.addExperience(new Resume.Experience("Banker", 1999, 2015));
            r.addExperience(new Resume.Experience("Sales Manager", 2016, 2019));
            r.addExperience(new Resume.Experience("Contractor", 2019, 2021));

        System.out.println(r); //watch the resume print.

    }
}