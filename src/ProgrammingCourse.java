public class ProgrammingCourse extends AbstractCourse implements Onlineable{

    public ProgrammingCourse() {
    }

    public ProgrammingCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }

    @Override
    public void conductClass() {
        System.out.println("Проведение урока программирования");
    }


    @Override
    public void provideOnlineAccess() {
        System.out.println("Предоставление онлайн-доступа к курсу программирования");
    }
}
