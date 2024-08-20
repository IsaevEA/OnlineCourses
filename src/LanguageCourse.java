public class LanguageCourse extends AbstractCourse implements Onlineable{
    public LanguageCourse() {
    }

    public LanguageCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }

    @Override
    public void conductClass() {
        System.out.println("Проведение урока языка");
    }

    @Override
    public void provideOnlineAccess() {
        System.out.println("Предоставление онлайн-доступа к Языковому курсу");
    }
}
